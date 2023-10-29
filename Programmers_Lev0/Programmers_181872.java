package Programmers_Lev0;

public class Programmers_181872 {
    public static void main(String[] args) {
        // String myString = "AbCdEFG";
        // String pat = "dE";                  // AbCdE

        String myString = "AAAAaaaa";
        String pat = "a";                  // AAAAaaaa
        
        System.out.println(solution(myString, pat));
    }

    public static String solution(String myString, String pat) {        // 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
        String answer = "";
        int n = myString.lastIndexOf(pat);

        answer = myString.substring(0, n) + pat;
        
        return answer;
    }
}
