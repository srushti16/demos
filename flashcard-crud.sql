-- CRUD - Create - insert, read - select, update - update, delete - delete
-- C
INSERT INTO flashcard (flashcard_id, question, answer) 
    VALUES (2, 'What is SQL', 'Adrian doesn''t know');
    
INSERT INTO flashcard (flashcard_id, question, answer)
    VALUES (3, 'Are Strings in Java mutable or immutable', 'immutable');
    
-- R 
-- you can specify the column you want to select
SELECT flashcard_id, question FROM flashcard;
-- * will select all columns
-- * SELECTS ALL COLUMNS, USED INPLACE OF SPECIFYING ALL COLUMN NAMES
SELECT * FROM flashcard;

-- where clause can be used to filter the results of our query
SELECT * FROM flashcard WHERE flashcard_id > 1;
-- find all questions that contain the word SQL in it
SELECT * FROM flashcard 
    WHERE UPPER(question) LIKE '%SQL%' 
    AND flashcard_id != 1;
    
-- ORDER BY is used to sort the result set by a given column
SELECT * FROM flashcard ORDER BY question;

-- U - update
UPDATE flashcard SET 
    question = 'what is jUnit', 
    answer = 'jUnit is a testing framework'
    WHERE flashcard_id = 1;
    
-- D - delete
DELETE FROM flashcard
    WHERE flashcard_id < 3;

commit;
    

