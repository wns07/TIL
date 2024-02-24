-- 조건에 맞는 아이템들의 가격의 총합 구하기(Lev2) : Sum, Max, Min

SELECT SUM(A.PRICE) AS TOTAL_PRICE
  FROM ITEM_INFO A
 WHERE A.RARITY = 'LEGEND'