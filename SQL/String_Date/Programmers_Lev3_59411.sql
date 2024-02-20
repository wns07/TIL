-- 오랜 기간 보호한 동물(2)(Lev3) : String, Date

-- 1번
WITH TMP_TBL0 AS (
SELECT A.ANIMAL_ID
     , B.NAME
     , B.DATETIME - A.DATETIME AS DURATION
  FROM ANIMAL_INS  A
     , ANIMAL_OUTS B
 WHERE A.ANIMAL_ID = B.ANIMAL_ID
 ORDER BY DURATION DESC
)
SELECT A.ANIMAL_ID
     , A.NAME
  FROM TMP_TBL0 A
 WHERE ROWNUM < 3
;

-- 2번
WITH TMP_TBL0 AS (
SELECT A.ANIMAL_ID
     , B.NAME
  FROM ANIMAL_INS  A
     , ANIMAL_OUTS B
 WHERE A.ANIMAL_ID = B.ANIMAL_ID
 ORDER BY B.DATETIME - A.DATETIME DESC
)
SELECT A.ANIMAL_ID
     , A.NAME
  FROM TMP_TBL0 A
 WHERE ROWNUM < 3