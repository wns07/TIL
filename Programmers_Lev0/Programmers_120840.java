package Programmers_Lev0;
import java.math.BigInteger;

public class Programmers_120840 {
    public static void main(String[] args) {
        // int balls = 3;
        // int share = 2;      // 3

        // int balls = 5;
        // int share = 3;      // 10

        int balls = 30;
        int share = 10;      // 30045015

        // System.out.println(factorial3(10));

        System.out.println(solution(balls, share));
    }

    public static int solution(int balls, int share) {          // 구슬을 나누는 경우의 수
        int answer = 0;
        BigInteger bi = new BigInteger("1");

        // 1번
        BigInteger bi1 = new BigInteger("1");
        for(int i=1; i<=balls; i++) {
            bi1 = bi1.multiply(new BigInteger(String.valueOf(i)));
        }

        // 2번
        BigInteger bi2 = new BigInteger("1");
        for(int i=1; i<=balls-share; i++) {
            bi2 = bi2.multiply(new BigInteger(String.valueOf(i)));
        }

        // 3번
        BigInteger bi3 = new BigInteger("1");
        for(int i=1; i<=share; i++) {
            bi3 = bi3.multiply(new BigInteger(String.valueOf(i)));
        }

        bi = bi1.divide(bi2.multiply(bi3));
        answer = bi.intValue();

        return answer;
    }

    public static int factorial (int num) {     // 1. 반복문
        int result = 1;

        for(int i=1; i<=num; i++) {
            result *= i;
        }

        return result;
    }

    public static int factorial2(int num) {     // 2. 재귀
        if(num <= 1) {
            return 1;
        } else {
            return num * factorial2(num -1);
        }
    }

    public static int factorial3(int n) {
        int result = 0;
        BigInteger bi = new BigInteger("1");

        for(int i=1; i<=n; i++) {
            bi = bi.multiply(new BigInteger(String.valueOf(i)));
            System.out.println(i + " : " + bi);
        }

        result = bi.intValue();
        System.out.println(result);

        return result;
    }
}
