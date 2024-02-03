package Programmers_Lev0;

public class Programmers_181932 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";

        System.out.println(solution(code));
    }

    public static String solution(String code) {            // 코드 처리하기
        String answer = "";
        String[] codeValue = code.split("");
        int mode = 0;

        for(int i=0; i<codeValue.length; i++) {
            if(codeValue[i].equals("1")) {
                mode = (mode == 0) ? 1 : 0;
            } else {
                System.out.println(i + " : " + mode + " : " + codeValue[i]);

                if((mode == 0) && (i%2 == 0)) {
                    answer += codeValue[i];
                } else if((mode== 1) && (i%2 == 1)) {
                    answer += codeValue[i];
                }
            }
        }

        if(answer.length() == 0) {
            answer = "EMPTY";
        }

        return answer;
    }
}
