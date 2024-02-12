-- 자동차 대여 기록에서 장기/단기 대여 구분하기(Lev1) : String, Date
-- 당일 대여

-- 코드를 입력하세요
SELECT A.HISTORY_ID                             AS HISTORY_ID
     , A.CAR_ID                                 AS CAR_ID
     , TO_CHAR(A.START_DATE, 'YYYY-MM-DD')      AS START_DATE
     , TO_CHAR(A.END_DATE  , 'YYYY-MM-DD')      AS END_DATE
     , CASE WHEN A.END_DATE - A.START_DATE + 1 >= 30 THEN '장기 대여'
            ELSE '단기 대여'
       END                                      AS RENT_TYPE
  FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
 WHERE 1=1
 -- 둘 다 가능
--   AND A.START_DATE BETWEEN TO_DATE('20220901', 'YYYYMMDD') AND TO_DATE('20220930', 'YYYYMMDD')
   AND TO_CHAR(A.START_DATE, 'YYYYMM') = '202209'
 ORDER BY HISTORY_ID DESC