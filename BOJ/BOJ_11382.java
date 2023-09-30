package BOJ;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_11382 {
    public static void main(String[] args) {            // 입출력과 사칙연산 > 꼬마 정민
        Scanner sc = new Scanner(System.in);

        BigInteger num1 = new BigInteger(sc.next());
        BigInteger num2 = new BigInteger(sc.next());
        BigInteger num3 = new BigInteger(sc.next());
        sc.close();

        System.out.println(num1.add(num2).add(num3));
    }
}