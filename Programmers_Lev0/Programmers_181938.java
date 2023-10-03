package Programmers_Lev0;

public class Programmers_181938 {
    public static void main(String[] args) {
        // int a = 2;          // 364
        // int b = 91;

        int a = 91;          // 364
        int b = 2;

        System.out.println(solution(a, b));

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println("1000010000");
        // System.out.println(2*10000*10000);
    }

    public static int solution(int a, int b) {      // 두 수의 연산값 비교하기
        int answer = 0;
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        int num1 = Integer.parseInt(s1+s2);
        int num2 = 2 * a * b;

        System.out.println("num1 : " + num1 + ", num2 : " + num2);
        
        if(num1 > num2) {
            answer = num1;
        } else {
            answer = num2;
        }

        return answer;
    }
}
