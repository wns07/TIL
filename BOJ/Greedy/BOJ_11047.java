package BOJ.Greedy;

import java.util.Scanner;

public class BOJ_11047 {                                // 동전 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 동전 종류 수
        int k = sc.nextInt();       // 가치의 합
        int answer = 0;

        int[] coin = new int[n];    // 동전 종류

        for(int i=n-1; i>=0; i--) {
            coin[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<coin.length; i++) {
            if(k/coin[i] == 0) {
                continue;
            } else {
                answer += k/coin[i];

                k -= (coin[i] * (k/coin[i]));
            }
        }

        System.out.println(answer);
    }
}
