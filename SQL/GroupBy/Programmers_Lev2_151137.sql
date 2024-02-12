-- 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기(Lev 2) : group by

-- 정답
SELECT CAR_TYPE      AS CAR_TYPE
     , COUNT(CAR_ID) AS CARS
  FROM CAR_RENTAL_COMPANY_CAR A
 WHERE ( A.OPTIONS LIKE '%통풍시트%'
         OR
         A.OPTIONS LIKE '%열선시트%'
         OR
         A.OPTIONS LIKE '%가죽시트%'
       )
 GROUP BY CAR_TYPE
 ORDER BY CAR_TYPE