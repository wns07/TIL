-- 조건에 맞는 도서와 저자 리스트 출력하기(Lev2) : Join

SELECT A.BOOK_ID                               AS BOOK_ID
     , B.AUTHOR_NAME                           AS AUTHOR_NAME
     , TO_CHAR(A.PUBLISHED_DATE, 'YYYY-MM-DD') AS PUBLISHED_DATE
  FROM BOOK   A
     , AUTHOR B
 WHERE A.AUTHOR_ID = B.AUTHOR_ID
   AND A.CATEGORY = '경제'
 ORDER BY PUBLISHED_DATE