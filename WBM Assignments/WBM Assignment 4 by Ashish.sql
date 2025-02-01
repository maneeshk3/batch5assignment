Create table wtpartmaster_new (wbmsourceidentifier INT);

INSERT INTO wtpartmaster_new (wbmsourceidentifier) VALUES (20);
INSERT INTO wtpartmaster_new (wbmsourceidentifier) VALUES (30);
INSERT INTO wtpartmaster_new (wbmsourceidentifier) VALUES (40);
INSERT INTO wtpartmaster_new (wbmsourceidentifier) VALUES (50);
INSERT INTO wtpartmaster_new (wbmsourceidentifier) VALUES (20);
INSERT INTO wtpartmaster_new (wbmsourceidentifier) VALUES (30);
INSERT INTO wtpartmaster_new(wbmsourceidentifier) VALUES (40);
INSERT INTO wtpartmaster_new (wbmsourceidentifier) VALUES (20);

---Q1: Write a SQL query  in the wtpartmaster table to find which wbmsourceidentifier have been duplicated and how many?

select * from wtpartmaster_new;

select wbmsourceidentifier, count(*) as duplicate_count from wtpartmaster_new
group by wbmsourceidentifier having count(*) > 1
ORDER BY duplicate_count DESC;

---Q2: write a sql query to remove duplicates by keeping the first occurance in table

WITH CTE AS (
    SELECT wbmsourceidentifier, 
           ROW_NUMBER() OVER (PARTITION BY wbmsourceidentifier ORDER BY wbmsourceidentifier) AS rn
    FROM wtpartmaster_new
)
SELECT wbmsourceidentifier 
FROM CTE
WHERE rn = 1;
