-- 주문량이 많은 아이스크림들 조회하기(Lev4) : Join

WITH TMP_TBL0 AS (
SELECT FLAVOR           AS FLAVOR
     , SUM(TOTAL_ORDER) AS TOTAL_ORDER
  FROM (
            SELECT *
            FROM FIRST_HALF A
            
            UNION ALL

            SELECT *
            FROM JULY A
       )
 GROUP BY FLAVOR
 ORDER BY TOTAL_ORDER DESC
)

SELECT A.FLAVOR   AS FLAVOR
  FROM TMP_TBL0 A
 WHERE ROWNUM < 4