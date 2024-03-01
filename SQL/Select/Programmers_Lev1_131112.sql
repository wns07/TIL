-- 강원도에 위치한 생산공장 목록 출력하기(Lev1) : SELECT

SELECT A.FACTORY_ID     AS FACTORY_ID
     , A.FACTORY_NAME   AS FACTORY_NAME
     , A.ADDRESS        AS ADDRESS
  FROM FOOD_FACTORY A
 WHERE A.ADDRESS LIKE '강원도%'
 ORDER BY FACTORY_ID 