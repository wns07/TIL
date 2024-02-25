-- 12세 이하인 여자 환자 목록 출력하기(Lev1) : SELECT

SELECT A.PT_NAME                      AS PT_NAME
     , A.PT_NO                        AS PT_NO
     , A.GEND_CD                      AS GEND_CD
     , A.AGE                          AS AGE
     , CASE WHEN A.TLNO IS NULL THEN 'NONE'
            ELSE A.TLNO
       END                            AS TLNO
  FROM PATIENT A
 WHERE A.AGE <= 12
   AND GEND_CD = 'W'
 ORDER BY AGE DESC, PT_NAME