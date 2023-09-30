package BOJ;
import java.util.Scanner;

public class BOJ_9086 {     // 문자열 > 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[][] str = new String[t][2];

        for(int i=0; i<t; i++) {
            String s1 = sc.next();
            String[] temp = s1.split("");
            str[i][0] = temp[0];
            str[i][1] = temp[temp.length-1];
        }
        sc.close();

        for(int i=0; i<str.length; i++) {
            for(int j=0; j<str[i].length; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
}
