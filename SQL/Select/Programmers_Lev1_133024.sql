-- 인기있는 아이스크림(Lev1) : SELECT

SELECT FLAVOR
  FROM FIRST_HALF A
 ORDER BY A.TOTAL_ORDER DESC, A.SHIPMENT_ID