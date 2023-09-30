package BOJ;
import java.util.Scanner;

public class BOJ_5597 {         // 1차원 배열 > 과제 안내신 분
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] chk = new boolean[30];

        for(int i=0; i<28; i++) {
            chk[sc.nextInt()-1] = true;
        }
        sc.close();

        for(int i=0; i<chk.length; i++) {
            if(!chk[i]) {
                System.out.println(i + 1);
            }
        }

    }
}
