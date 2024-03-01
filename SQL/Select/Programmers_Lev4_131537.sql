-- 오프라인/온라인 판매 데이터 통합하기(Lev4) : SELECT

SELECT *
  FROM (
            SELECT TO_CHAR(A.SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE
                 , A.PRODUCT_ID                         AS PRODUCT_ID
                 , A.USER_ID                            AS USER_ID
                 , A.SALES_AMOUNT                       AS SALES_AMOUNT
              FROM ONLINE_SALE A
             WHERE TO_CHAR(A.SALES_DATE, 'YYYYMM') = '202203'
            
             UNION ALL
            
            SELECT TO_CHAR(A.SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE
                 , A.PRODUCT_ID                         AS PRODUCT_ID
                 , NULL                                 AS USER_ID
                 , A.SALES_AMOUNT                       AS SALES_AMOUNT
              FROM OFFLINE_SALE A
             WHERE TO_CHAR(A.SALES_DATE, 'YYYYMM') = '202203'
       )
 ORDER BY SALES_DATE, PRODUCT_ID, USER_ID