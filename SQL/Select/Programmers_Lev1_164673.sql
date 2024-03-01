-- 조건에 부합하는 중고거래 댓글 조회하기(Lev1) : SELECT

SELECT A.TITLE                               AS TITLE
     , A.BOARD_ID                            AS BOARD_ID
     , B.REPLY_ID                            AS REPLY_ID
     , B.WRITER_ID                           AS WRITER_ID
     , B.CONTENTS                            AS CONTENTS
     , TO_CHAR(B.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
  FROM USED_GOODS_BOARD A
     , USED_GOODS_REPLY B
 WHERE A.BOARD_ID = B.BOARD_ID
   AND TO_CHAR(A.CREATED_DATE, 'YYYYMM') = '202210'
 ORDER BY CREATED_DATE, TITLE