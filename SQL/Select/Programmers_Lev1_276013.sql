-- Python 개발자 찾기(Lev1) : SELECT

SELECT A.ID          AS ID
     , A.EMAIL       AS EMAIL
     , A.FIRST_NAME  AS FIRST_NAME
     , A.LAST_NAME   AS LAST_NAME
  FROM DEVELOPER_INFOS A
 WHERE ( A.SKILL_1 = 'Python'
         OR
         A.SKILL_2 = 'Python'
         OR
         A.SKILL_3 = 'Python' )
 ORDER BY ID