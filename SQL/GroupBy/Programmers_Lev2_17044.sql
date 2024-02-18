-- 진료과별 총 예약 횟수 출력하기(Lev2) : GROUP BY

SELECT A.MCDP_CD        AS "진료과코드"
     , COUNT(A.APNT_NO) AS "5월예약건수"
  FROM APPOINTMENT A
 WHERE TO_CHAR(A.APNT_YMD, 'YYYYMM') = '202205'
 GROUP BY A.MCDP_CD
 ORDER BY "5월예약건수", "진료과코드"