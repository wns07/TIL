-- 루시와 엘라 찾기(Lev2) : String, Date

SELECT A.ANIMAL_ID        AS ANIMAL_ID
     , A.NAME             AS NAME
     , A.SEX_UPON_INTAKE  AS SEX_UPON_INTAKE
  FROM ANIMAL_INS A
 WHERE A.NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
 ORDER BY A.ANIMAL_ID