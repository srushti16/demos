INSERT INTO flashcard (flashcard_id, question, answer) 
    VALUES (1, 'What is SQL', 'Adrian doesn''t know');
INSERT INTO flashcard (flashcard_id, question, answer)
    VALUES (2, 'Are Strings in Java mutable or immutable', 'immutable');
INSERT INTO flashcard (flashcard_id, question, answer)
    VALUES (3, 'Do Interfaces Have methods', 'Yes and they are implicitly public abstract');
INSERT INTO flashcard (flashcard_id, question, answer)
    VALUES (4, 'Do Interfaces have fields?', 'Yes, and they are implicitly public static final');
INSERT INTO flashcard (flashcard_id, question, answer)
    VALUES (5, 'What is a sub query', 'A query within the where clause of a query');
    
INSERT INTO cardset (set_id, title, subject) 
    VALUES (1, 'Core Java', 'Java');

INSERT INTO cardset (set_id, title, subject) 
    VALUES (2, 'Spring', 'Java');

INSERT INTO FLASHCARD_CARDSET (flashcard_id, set_id)
    VALUES (2,1);
INSERT INTO FLASHCARD_CARDSET (flashcard_id, set_id)
    VALUES (3,1);
INSERT INTO FLASHCARD_CARDSET (flashcard_id, set_id)
    VALUES (4,1);


commit;



SELECT * FROM flashcard;

-- inner join takes only the records that have a relation between the tables
SELECT * FROM flashcard flash 
    INNER JOIN flashcard_cardset junct 
    ON flash.flashcard_id = junct.flashcard_id
    INNER JOIN cardset cset 
    ON junct.set_id = cset.set_id;

-- left join takes all records from the left table and they get null values for the 
-- columns in the right if there is no relation
SELECT * FROM flashcard flash 
    LEFT JOIN flashcard_cardset junct 
    ON flash.flashcard_id = junct.flashcard_id
    LEFT JOIN cardset cset 
    ON junct.set_id = cset.set_id;

-- full join takes all records and if a record has no relation it get null
-- values for the columns from the other table
SELECT * FROM flashcard  
    FULL JOIN flashcard_cardset 
    ON flashcard.flashcard_id = flashcard_cardset.flashcard_id
    FULL JOIN cardset  
    ON flashcard_cardset.set_id = cardset.set_id;
