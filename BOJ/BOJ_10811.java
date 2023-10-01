package BOJ;
import java.util.Scanner;

public class BOJ_10811 {            // 1차원 배열 > 바구니 뒤집기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 바구니 수
        int m = sc.nextInt();       // 입력받는 줄 : 역순으로 만든 방법 입력
        int[] basket = new int[n];  // 바구니

        // 1 2 3 4 5
        // 2 1 3 4 5 : 1 2
        // 2 1 4 3 5 : 3 4
        // 3 4 1 2 5 : 1 4
        // 3 4 1 2 5 : 2 2

        for(int i=0; i<basket.length; i++) {
            basket[i] = (i+1);
        }

        for(int i=0; i<m; i++) {
            int left = sc.nextInt()-1;
            int right = sc.nextInt()-1;

            while(left < right) {       // 이 부분을 생각못함 : 정렬 알고리즘만 생각함...
                int tmp = basket[left];
                basket[left++] = basket[right];
                basket[right--] = tmp;
            }

            // for(int k=0; k<basket.length; k++) {
            //     System.out.print(basket[k] + " ");
            // }
        }
        sc.close();

        for(int i=0; i<basket.length; i++) {
            System.out.print(basket[i] + " ");
        }

        System.out.println();
    }
}
