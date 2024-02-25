-- 3월에 태어난 여성 회원 목록 출력하기(Lev2) : SELECT

SELECT A.MEMBER_ID                            AS MEMBER_ID
     , A.MEMBER_NAME                          AS MEMBER_NAME
     , A.GENDER                               AS GENDER
     , TO_CHAR(A.DATE_OF_BIRTH, 'YYYY-MM-DD') AS DATE_OF_BIRTH
  FROM MEMBER_PROFILE A
 WHERE TO_CHAR(A.DATE_OF_BIRTH, 'MM') = '03'
   AND A.TLNO IS NOT NULL
   AND A.GENDER = 'W'
 ORDER BY MEMBER_ID