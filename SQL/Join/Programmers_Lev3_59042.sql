-- 없어진 기록 찾기(Lev3) : Join

-- 첫번째 풀이
WITH TMP_TBL0 AS (
SELECT B.ANIMAL_ID AS ANIMAL_ID
     , B.NAME      AS NAME
     , A.ANIMAL_ID AS INS_ANIMAL_ID
  FROM ANIMAL_INS A
     , ANIMAL_OUTS B
WHERE A.ANIMAL_ID(+) = B.ANIMAL_ID
)

SELECT A.ANIMAL_ID  AS ANIMAL_ID
     , A.NAME       AS NAME
  FROM TMP_TBL0 A
 WHERE A.INS_ANIMAL_ID IS NULL
 ORDER BY ANIMAL_ID, NAME
;

-- 두번째 풀이
SELECT A.ANIMAL_ID AS ANIMAL_ID
     , A.NAME      AS NAME
  FROM ANIMAL_OUTS A
 WHERE NOT EXISTS ( SELECT 'X'
                      FROM ANIMAL_INS X
                     WHERE X.ANIMAL_ID = A.ANIMAL_ID )
 ORDER BY ANIMAL_ID, NAME