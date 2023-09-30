package BOJ;
import java.util.Scanner;

public class BOJ_10988 {        // 심화1 > 팰린드롬인지 확인하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String s1 = new StringBuffer(s).toString();
        String s2 = new StringBuffer(s).reverse().toString();

        if(s1.equals(s2)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}