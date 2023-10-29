# TIL
## 1. vscode Terminal 입력
 가. cd .vscode  
 나. rm -rf launch.json  
 다. Run and Debug > 톱니바퀴모양 > create launch.json 클릭  
 라. 입력하고자 하는 파일에 추가
  - "console": "integratedTerminal"

## 2. 풀이 참조
### 가. BOJ
- 10811  
### 나. Programmers
- 120840 : 오버플로우
- 181872 : lastIndexOf
- 181881 : Arrays.equals(배열1, 배열2), Arrays.copyOf(배열, 길이)
- 181913 : StringBuffer(멀티쓰레드 환경 내 동기화)
<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
StringBuilder(단일쓰레드 환경) 의 reverse 메소드
- 181890 : Arrays.copyOfRange(원본배열, 복사시작인덱스, 복사끝인덱스)

## 3. Linux 명령어
### 1. rm(remove)
 - 설명 : 파일이나 디렉토리 삭제
 - rm [옵션] [삭제할 디렉토리/옵션]
 - 옵션( 옵션(Long옵션) )  
   가. -r(--recursive) : 디렉토리 내부 모든 내용 삭제(디렉토리 삭제 시 필수)  
   나. -f(--force) : 강제로 파일이나 디렉토리 삭제 + 대상이 없는 경우 메세지 출력 안함
 - 예시  
  가. 여러 개 한꺼번에 삭제 : rm test1.txt, test2.txt  
  나. 현재 위치 모든 파일 삭제 : rm -rf *  
  다. 현재 위치의 .txt 로 끝나는 모든 파일 삭제 : rm *.txt

### 2. mkdir(make directory)
 - 설명 : 디렉토리 생성

### 3. pwd(print working directory)
 - 설명 : 현재 작업중인 디렉토리 절대경로 출력

### 4. mv(move)
 - 설명 : 파일이나 디렉토리 이동
 - mv [옵션] [이동할 파일] [이동될 파일]