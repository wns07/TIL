package BOJ;
import java.util.Scanner;

public class BOJ_2908 {         // 문자열 > 상수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int lnum = (num1 % 10) * 100 + ((num1 % 100)/10) * 10 + (num1/100);
        int rnum = (num2 % 10) * 100 + ((num2 % 100)/10) * 10 + (num2/100);

        if(lnum > rnum) {
            System.out.println(lnum);
        } else {
            System.out.println(rnum);
        }
    }
}
