-- 흉부외과 또는 일반외과 의사 목록 출력하기(Lev1) : SELECT

SELECT A.DR_NAME                         AS DR_NAME
     , A.DR_ID                           AS DR_ID
     , A.MCDP_CD                         AS MCDP_CD
     , TO_CHAR(A.HIRE_YMD, 'YYYY-MM-DD') AS HIRE_YMD
  FROM DOCTOR A
 WHERE A.MCDP_CD IN ('CS', 'GS')
 ORDER BY A.HIRE_YMD DESC, DR_NAME