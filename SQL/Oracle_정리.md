# Oracle 함수

## 1. NVL ( A(값), B(지정값) )
* 정의 : A 가 NULL 이 아닐 때 A, NULL 일 때 B 출력
* 예시
```
-- CODE 가 NULL 이 아니면 CODE, NULL 이면 0 으로 표시
SELECT NVL ( CODE, 0 )
  FROM DUAL
```

## 2. NVL2 ( A(값), B(지정값1), C(지정값2) )
* 정의 : A 가 NULL 이 아닐 때 B, NULL 일 때 C 출력
* 예시
```
-- CODE 가 NULL 이 아니면 'Y', NULL 이면 'N' 출력
SELECT NVL2 ( CODE, 'Y', 'N')
  FROM DUAL
```

## 3. DECODE ( A(컬럼), B(조건1), C(결과1), D(조건2), E(결과2), ...)
* 정의 : IF-ELSE, CASE WHEN 과 비슷한 기능
* 예시
```
-- GENDER='M' 이면 '남자', GENDER='F'이면 '여자', 그 외 '기타
SELECT DECODE ( GENDER, 'M', '남자', 'F', '여자', '기타' )
  FROM DUAL
```

## 4. 날짜에 하루 더하기
* 예시
```
-- 출력 : 20230301
TO_DATE('20230228', 'YYYYMMDD') + 1
```

## 5. ADD_MONTHS ( '날짜', '숫자' )
* 정의 : 월을 빼거나 더함 ( 년도와 월만 변경, 일은 변경되지 않음 )
* 예시
```
-- 출력1 : 20230208
ADD_MONTHS ( TO_DATE('20230308', 'YYYYMMDD'), -1 )

-- 출력2 : 20230408
ADD_MONTHS ( TO_DATE('20230308', 'YYYYMMDD'), 1 )

-- 출력3 : 202302228 -> 2월은 31일이 존재하지 않음
ADD_MONTHS ( TO_DATE('20230331', 'YYYYMMDD'), -1 )

-- 출력4 : 20230430 -> 4월은 31일이 존재하지 않음
ADD_MONTHS ( TO_DATE('20230331', 'YYYYMMDD'), 1 )
```


## 6. LAST_DAY ( '날짜' )
* 정의 : 입력한 날짜의 마지막 날짜를 가져옴
* 예시
```
-- 출력1 : 20230331
LAST_DAY ( TO_DATE('202303', 'YYYYMM') )

-- 출력2 : 20230228
LAST_DAY ( TO_DATE('20230215' ,'YYYYMMDD') )
```
