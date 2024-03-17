-- 조건에 맞는 사용자와 총 거래금액 조회하기(Lev3) : GROUP BY

SELECT B.USER_ID     AS USER_ID
     , B.NICKNAME    AS NICKNAME
     , SUM(A.PRICE)  AS TOTAL_SALES
  FROM USED_GOODS_BOARD A
     , USED_GOODS_USER  B
 WHERE A.WRITER_ID = B.USER_ID
   AND A.STATUS = 'DONE'
 GROUP BY B.USER_ID
        , B.NICKNAME
 HAVING SUM(A.PRICE) >= 700000
 ORDER BY TOTAL_SALES