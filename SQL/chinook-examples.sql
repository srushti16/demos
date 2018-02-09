-- scalar functions act upon a single value
SELECT UPPER(name) FROM artist;
SELECT LOWER(name) FROM artist;
SELECT name FROM artist WHERE 
    RPAD(UPPER(name), LENGTH(name) + 1, ' ') LIKE '%THE %';

-- dual is this kind of virtual table that we can just select single values from
SELECT systimestamp FROM DUAL;
SELECT 5 from DUAL;
SELECT CEIL(15.01) FROM DUAL;

-- aggregate functions act upon a set of values
-- where comes before group by, having comes after
SELECT COUNT(name), name FROM track 
    WHERE not name LIKE 'W%'
    GROUP BY name
    HAVING COUNT(name) > 1
    ORDER BY name asc;
    

SELECT MAX(LENGTH(name)) FROM artist;

SELECT LENGTH(name), name FROM artist 
    WHERE LENGTH(name) = (SELECT MAX(LENGTH(name)) FROM artist);
    
SELECT name from artist
WHERE artistid IN (
    SELECT artistid FROM album 
    WHERE albumid IN (
        SELECT albumid FROM track WHERE name = '2 Minutes To Midnight'));

SELECT * FROM track WHERE name = '2 Minutes To Midnight';


-- views
CREATE VIEW minutesToMindnight AS 
    SELECT * FROM track WHERE name = '2 Minutes To Midnight';

SELECT albumid FROM minutesToMindnight;

CREATE VIEW artist_to_midnight AS
    SELECT * FROM album WHERE albumid IN (SELECT albumid FROM minutesToMindnight);
    
SELECT * FROM artist_to_midnight;


-- JOINS
SELECT * FROM artist
    INNER JOIN track 
    USING (name);
    
SELECT * FROM artist
    INNER JOIN album
    ON artist.name = album.title;


--CREATE INDEX 
select * from track where name like '%The %';

CREATE INDEX name_index ON track(name);
DROP INDEX name_index;


-- Set operations
-- UNION removes duplicates and union all keeps duplicates
SELECT * FROM track WHERE name like '%Z%'
UNION ALL
SELECT * FROM track WHERE name like '%T%';

-- minus removes the records in the second resultset from the first
SELECT * FROM track WHERE trackid > 50
MINUS 
SELECT * FROM track WHERE trackid > 55;

SELECT * FROM track WHERE trackid BETWEEN 51 AND 55;

-- intersect

SELECT * FROM track WHERE trackid < 25
INTERSECT
SELECT * FROM track WHERE MOD(trackid, 5) = 0;

SELECT * FROM employee WHERE birthdate < TO_DATE('1970-01-01', 'YYYY-MM-DD');