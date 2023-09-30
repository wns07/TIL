package BOJ;
import java.util.Scanner;

public class BOJ_27866 {        // 문자열 > 문자와 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.close();

        System.out.println(s.split("")[n-1]);
    }
}