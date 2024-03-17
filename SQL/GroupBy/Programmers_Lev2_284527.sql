-- 조건에 맞는 사원 정보 조회하기(Lev2) : GROUP BY
-- MySQL 로 풀었음 ( ORACLE 채점 없음 )

WITH TMP_TBL0 AS (
SELECT A.EMP_NO   AS EMP_NO
     , SUM(SCORE) AS SCORE_SUM
  FROM HR_GRADE A
 GROUP BY A.EMP_NO
 ORDER BY SCORE_SUM DESC
 LIMIT 1
)

SELECT A.SCORE_SUM AS SCORE
     , A.EMP_NO    AS EMP_NO
     , B.EMP_NAME  AS EMP_NAME
     , B.POSITION  AS POSITION
     , B.EMAIL     AS EMAIL
  FROM TMP_TBL0 A
     , HR_EMPLOYEES B
 WHERE A.EMP_NO = B.EMP_NO