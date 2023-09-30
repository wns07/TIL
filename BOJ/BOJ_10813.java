package BOJ;
import java.util.Scanner;

public class BOJ_10813 {        // 1차원 배열 > 공 바꾸기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 바구니 수
        int m = sc.nextInt();       // 변경 수
        int[] balls = new int[n];

        for(int i=0; i<balls.length; i++) {
            balls[i] = (i+1);
        }

        for(int i=0; i<m; i++) {
            int idx1 = sc.nextInt() - 1;
            int idx2 = sc.nextInt() - 1;

            if(idx1 == idx2) {
                continue;
            }

            int num1 = balls[idx1];
            int num2 = balls[idx2];

            balls[idx1] = num2;
            balls[idx2] = num1;

            System.out.println();
            for(int j=0; j<balls.length; j++) {
                System.out.print(balls[j] + " ");
            }
            System.out.println();
        }
        sc.close();

        for(int i=0; i<balls.length; i++) {
            System.out.print(balls[i] + " ");
        }
    }
}
