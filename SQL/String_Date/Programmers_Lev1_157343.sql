-- 특정 옵션이 포함된 자동차 리스트 구하기(Lev1) : String, Date

-- 코드를 입력하세요
SELECT A.CAR_ID
     , A.CAR_TYPE
     , A.DAILY_FEE
     , A.OPTIONS
  FROM CAR_RENTAL_COMPANY_CAR A
 WHERE A.OPTIONS LIKE '%네비게이션%'
 ORDER BY CAR_ID DESC