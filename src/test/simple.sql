use test;

DROP TABLE zjc_1022;

create table zjc_1022 (
    c1 INT,
    c2 STRING
)
STORED AS PARQUET;

insert overwrite table zjc_1022 SELECT 1, "HELLO" UNION ALL SELECT 2, "HELLO"; 

drop table zjc_1023;

create table zjc_1023 (
    c1 INT,
    c2 STRING
)
STORED AS PARQUET;

INSERT OVERWRITE TABLE zjc_1023 SELECT * FROM zjc_1022;

SELECT C1, C2 FROM zjc_1023;

drop table if exists zjc_1023_1;

CREATE TABLE zjc_1023_1 (
  c1_cnt INT,
  c2_name String
) 
PARTITIONED BY (dayid STRING)
STORED AS PARQUET;

INSERT OVERWRITE TABLE zjc_1023_1 PARTITION(dayid='20180923')
SELECT SUM(z1.c1 + z2.c1), z1.c2
FROM zjc_1022 z1 INNER JOIN zjc_1023 z2 ON z1.c1 = z2.c1
GROUP BY z1.c2;