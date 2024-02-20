-- 중성화 여부 파악하기(Lev2) : String, Date

SELECT A.ANIMAL_ID         AS ANIMAL_ID
     , A.NAME              AS NAME
     , CASE WHEN A.SEX_UPON_INTAKE LIKE 'Neutered%' THEN 'O'
            WHEN A.SEX_UPON_INTAKE LIKE 'Spayed%' THEN 'O'
            ELSE 'X'
       END                 AS "중성화"
  FROM ANIMAL_INS A
 ORDER BY A.ANIMAL_ID