package Programmers_Lev0;

public class Programmers_181934 {
    public static void main(String[] args) {
        // String ineq = "<";
        // String eq = "=";
        // int n = 20;
        // int m = 50;

        String ineq = ">";
        String eq = "!";
        int n = 41;
        int m = 78;

        System.out.println(solution(ineq, eq, n, m));
    }

    public static int solution(String ineq, String eq, int n, int m) {      // 조건 문자열
        int answer = 0;

        if(ineq.equals(">") && eq.equals("=")) {
            if(n >= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals("<") && eq.equals("=")) {
            if(n <= m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals(">") && eq.equals("!")) {
            if(n > m) {
                answer = 1;
            } else {
                answer = 0;
            }
        } else if(ineq.equals("<") && eq.equals("!")) {
            if(n < m) {
                answer = 1;
            } else {
                answer = 0;
            }
        }

        return answer;
    }
}
