-- 가격대 별 상품 개수 구하기(Lev 2) : group by
-- 가격볌위를 group by 할 수 없을까

-- 정답이긴함...
WITH TMP_TBL0 AS (
SELECT SUBSTR ( A.PRICE / 10000, 0, 1 ) * 10000 AS PRICE_GROUP
     , A.PRODUCT_ID                             AS PRODUCT_ID
  FROM PRODUCT A
)

SELECT PRICE_GROUP       AS PRICE_GROUP
     , COUNT(PRODUCT_ID) AS PRODUCTS
  FROM TMP_TBL0
 GROUP BY PRICE_GROUP
 ORDER BY PRICE_GROUP