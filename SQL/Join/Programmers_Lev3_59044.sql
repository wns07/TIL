-- 오랜 기간 보호한 동물(1)(Lev3) : Join

SELECT A.*
 FROM (
        SELECT A.NAME      AS NAME
             , A.DATETIME  AS DATETIME
          FROM ANIMAL_INS A
         WHERE NOT EXISTS ( SELECT 'X'
                              FROM ANIMAL_OUTS X
                             WHERE A.ANIMAL_ID = X.ANIMAL_ID )
         ORDER BY A.DATETIME
      ) A
 WHERE ROWNUM <= 3