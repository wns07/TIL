package BOJ.Greedy;

import java.util.Scanner;

public class BOJ_2839 {                                 // 설탕배달
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int answer = -1;
        int count = n / 5;

        for(int i=count; i>=0; i--) {
            int sugar = n;
            int sugar5 = (5 * i);

            if((sugar - sugar5) % 3 == 0) {
                answer = i + ((sugar - sugar5) / 3);
                break;
            }
        }

        System.out.println(answer);
    }
}
