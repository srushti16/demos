

SELECT COUNT(flashcard_id) FROM flashcard 
    INNER JOIN flashcard_cardset USING(flashcard_id) WHERE set_id = 1;

-- function to get number of cards in a given set
CREATE OR REPLACE FUNCTION get_number_cards_in_set
(set_id_param IN number) -- parameters
RETURN number -- return type specified
IS -- or AS they are synonymous 
-- we can define addional variables
card_count number;
begin
    SELECT COUNT(flashcard_id) INTO card_count FROM flashcard 
        INNER JOIN flashcard_cardset USING(flashcard_id) WHERE set_id = set_id_param;
    RETURN card_count;
end;
-- delimiter for plsql blocks
/

-- test out the function
SELECT get_number_cards_in_set(1) FROM dual;

-- create the sequence for our flashcard ids
CREATE SEQUENCE flashcard_id_seq START WITH 6;

-- create trigger to generate the id inserted and prevent ids from being updated
CREATE OR REPLACE TRIGGER flashcard_id_trig
BEFORE INSERT OR UPDATE ON flashcard
FOR EACH ROW
BEGIN
    IF INSERTING THEN
        SELECT flashcard_id_seq.nextVal INTO :new.flashcard_id FROM dual;
    ELSIF UPDATING THEN
        SELECT :old.flashcard_id INTO :new.flashcard_id FROM dual;
    END IF;
END;
/

UPDATE flashcard SET flashcard_id = 1;
SELECT * FROM flashcard;
INSERT INTO flashcard (flashcard_id, question, answer) 
    VALUES (10, 'will it work', 'it should'); 


-- stored procedure
CREATE OR REPLACE PROCEDURE create_flashcard_for_set
(question IN varchar2, 
answer IN varchar2, 
set_id IN number, 
generated_id OUT number)
IS 
BEGIN
    INSERT INTO flashcard (question, answer) 
        VALUES (question, answer) 
    RETURNING flashcard_id INTO generated_id; -- get the generated id
    
    INSERT INTO flashcard_cardset (set_id, flashcard_id) 
        VALUES (set_id, generated_id);
END create_flashcard_for_set;
/

SET SERVEROUTPUT ON
DECLARE
    gen_id number;
BEGIN
    create_flashcard_for_set('java???', 'yes????', 1, gen_id);
    dbms_output.put_line(gen_id);
END;
/

SELECT * FROM flashcard;
SELECT * FROM flashcard_cardset;

-- create table for audit logs
CREATE TABLE audit_flashcard
(
    audit_id number PRIMARY KEY,
    old_id number,
    new_id number,
    old_question varchar2(200),
    new_question varchar2(200),
    old_answer varchar2(500),
    new_answer varchar2(500),
    audit_time timestamp
);

CREATE SEQUENCE audit_flashcard_seq;
CREATE OR REPLACE TRIGGER audit_book_trig
AFTER UPDATE OR INSERT OR DELETE ON flashcard
FOR EACH ROW
BEGIN
    INSERT INTO audit_flashcard
        (audit_id, old_id, new_id, old_question, new_question, 
        old_answer, new_answer, audit_time)
        VALUES (audit_flashcard_seq.nextVal, :old.flashcard_id, :new.flashcard_id,
        :old.question, :new.question, :old.answer, :new.answer, systimestamp);
END;
/

select * from audit_flashcard;

select * from flashcard;

UPDATE flashcard SET question = 'updated question' WHERE flashcard_id = 8;


-- stored procedure to find flashcards in a given set
CREATE OR REPLACE PROCEDURE find_flashcards_in_set
(set_id IN number, results OUT sys_refcursor)
IS
BEGIN
    OPEN results FOR SELECT flashcard_id, question, answer FROM flashcard 
        INNER JOIN flashcard_cardset USING(flashcard_id) WHERE set_id = set_id;
END find_flashcards_in_set;
/

SET SERVEROUTPUT ON;
DECLARE
    results sys_refcursor;
    flashcard_id number;
    question varchar2(200);
    answer varchar2(500);
BEGIN
    find_flashcards_in_set(1, results);
    LOOP
        FETCH results INTO flashcard_id, question, answer;
        EXIT WHEN results%notfound;
        dbms_output.put_line(flashcard_id || ' | ' || question || ' | ' || answer);
    END LOOP;
END;
/

SELECT * FROM flashcard;