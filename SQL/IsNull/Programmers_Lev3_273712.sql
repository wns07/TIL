-- 업그레이드 할 수 없는 아이템 구하기(Lev3) : IS NULL

SELECT A.ITEM_ID      AS ITEM_ID
     , A.ITEM_NAME    AS ITEM_NAME
     , A.RARITY       AS RARITY
  FROM ITEM_INFO A
 WHERE NOT EXISTS ( SELECT 'X'
                      FROM ITEM_TREE X
                     WHERE X.PARENT_ITEM_ID = A.ITEM_ID )
 ORDER BY A.ITEM_ID DESC

-- 다른사람 풀이 : 문제 유형이 IS NULL 
SELECT ITEM_ID
     , ITEM_NAME
     , RARITY
  FROM ITEM_INFO
 WHERE ITEM_ID NOT IN ( SELECT PARENT_ITEM_ID
                          FROM ITEM_TREE 
                         WHERE PARENT_ITEM_ID IS NOT NULL )
ORDER BY ITEM_ID DESC