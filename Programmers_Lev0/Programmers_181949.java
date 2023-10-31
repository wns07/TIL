package Programmers_Lev0;

public class Programmers_181949 {
    public static void main(String[] args) {            // 대소문자 바꿔서 출력하기
        String s = "aBcDeFg";
        // String s = "aAzZ";
        String answer = "";

        // a~z : 97 ~ 122
        // A~Z : 65 ~  90
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int n = c;

            if(n<=90) {
                n += 32;
            } else {
                n -= 32;
            }
            
            char cc = (char)n;
            answer += Character.toString(cc);

            System.out.println(c + " : " + cc);
        }

        System.out.println(answer);
    }
}
