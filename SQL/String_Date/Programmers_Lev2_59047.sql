-- 이름에 el이 들어가는 동물 찾기(Lev2) : String, Date
-- 대문자 : UPPER(컬럼명)
-- 소문자 : LOWER(컬럼명)

SELECT A.ANIMAL_ID    AS ANIMAL_ID
     , A.NAME         AS NAME
  FROM ANIMAL_INS A
 WHERE UPPER(A.NAME) LIKE '%EL%'
   AND A.ANIMAL_TYPE = 'Dog'
 ORDER BY A.NAME