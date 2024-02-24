-- 중복 제거하기(Lev2) : Sum, Max, Min

-- 첫번째 : DISTINCT 기억이 안났음...
SELECT COUNT(COUNT) AS COUNT
  FROM (
            SELECT NAME       AS NAME
                , COUNT(NAME) AS COUNT
            FROM ANIMAL_INS A
            WHERE A.NAME IS NOT NULL
            GROUP BY NAME
       )
;

-- 두번째
SELECT COUNT(DISTINCT A.NAME) AS COUNT
  FROM ANIMAL_INS A