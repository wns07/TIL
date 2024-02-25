package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11399 {                                  // ATM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 사람의 수
        int[] time = new int[n];
        int answer = 0;

        for(int i=0; i<time.length; i++) {
            time[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(time);

        for(int i=0; i<time.length; i++) {
            answer += (n * time[i]);
            n--;
        }

        System.out.println(answer);
    }
}
