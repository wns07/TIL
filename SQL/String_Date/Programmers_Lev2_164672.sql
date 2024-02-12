-- 조건에 부합하는 중고거래 상태 조회하기(Lev2) : String, Date

-- 코드를 입력하세요
SELECT A.BOARD_ID                      AS BOARD_ID
     , A.WRITER_ID                     AS WRITER_ID
     , A.TITLE                         AS TITLE
     , A.PRICE                         AS PRICE
     , CASE WHEN A.STATUS = 'SALE'     THEN '판매중'
            WHEN A.STATUS = 'RESERVED' THEN '예약중'
            WHEN A.STATUS = 'DONE'     THEN '거래완료'
       END                             AS STATUS
  FROM USED_GOODS_BOARD A
 WHERE TO_CHAR(A.CREATED_DATE, 'YYYYMMDD') = '20221005'
 ORDER BY BOARD_ID DESC