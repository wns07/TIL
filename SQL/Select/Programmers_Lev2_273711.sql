-- 업그레이드 된 아이템 구하기(Lev2) : SELECT

SELECT B.ITEM_ID     AS ITEM_ID
     , B.ITEM_NAME   AS ITEM_NAME
     , B.RARITY      AS RARITY
  FROM ITEM_TREE A
     , ITEM_INFO B
 WHERE A.ITEM_ID = B.ITEM_ID
   AND A.PARENT_ITEM_ID IN ( SELECT X.ITEM_ID
                               FROM ITEM_INFO X
                              WHERE X.RARITY = 'RARE' )
 ORDER BY ITEM_ID DESC