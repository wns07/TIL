-- 카테고리 별 상품 개수 구하기(Lev2) : String, Date

SELECT SUBSTR(A.PRODUCT_CODE, 0, 2) AS CATEGORY
     , COUNT(A.PRODUCT_ID)          AS PRODUCTS
  FROM PRODUCT A
 GROUP BY SUBSTR(A.PRODUCT_CODE, 0, 2)
 ORDER BY CATEGORY