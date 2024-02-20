-- DATETIME에서 DATE로 형 변환(Lev2) : String, Date

SELECT A.ANIMAL_ID
     , A.NAME
     , TO_CHAR(A.DATETIME, 'YYYY-MM-DD') AS "날짜"
  FROM ANIMAL_INS A
 ORDER BY A.ANIMAL_ID