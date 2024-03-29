-- 재구매가 일어난 상품과 회원 리스트 구하기(Lev2) : SELECT

-- 첫번째 : 이게 정답, HAVING 절을 0으로 해서 오답나와서 두번째로 함..
SELECT USER_ID       AS USER_ID
     , PRODUCT_ID    AS PRODUCT_ID
  FROM ONLINE_SALE A
 GROUP BY USER_ID, PRODUCT_ID
 HAVING COUNT(PRODUCT_ID) > 1
 ORDER BY USER_ID, PRODUCT_ID DESC

-- 두번째
SELECT USER_ID       AS USER_ID
     , PRODUCT_ID    AS PRODUCT_ID
  FROM ONLINE_SALE A
 WHERE A.USER_ID IN ( SELECT X.USER_ID
                        FROM ONLINE_SALE X
                       GROUP BY X.USER_ID
                       HAVING COUNT(USER_ID) > 1 )
 GROUP BY USER_ID, PRODUCT_ID
 HAVING COUNT(PRODUCT_ID) > 1
 ORDER BY USER_ID, PRODUCT_ID DESC