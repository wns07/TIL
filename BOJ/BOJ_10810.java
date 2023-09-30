package BOJ;
import java.util.Scanner;

public class BOJ_10810 {        // 1차원 배열 > 공 넣기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 바구니 수
        int m = sc.nextInt();       // 입력받는 줄
        int[] basket = new int[n];

        for(int i=0; i<m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();

            for(int j=start; j<=end; j++) {
                basket[j-1] = num;
            }
        }
        sc.close();

        for(int i=0; i<basket.length; i++) {
            System.out.print(basket[i] + " ");
        }

        System.out.println();
    }
}
