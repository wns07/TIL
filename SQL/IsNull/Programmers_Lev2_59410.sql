-- NULL 처리하기(Lev2) : IS NULL

SELECT A.ANIMAL_TYPE       AS ANIMAL_TYPE
     , CASE WHEN A.NAME IS NULL THEN 'No name'
            ELSE A.NAME
       END                 AS NAME
     , A.SEX_UPON_INTAKE   AS SEX_UPON_INTAKE
  FROM ANIMAL_INS A
 ORDER BY ANIMAL_ID