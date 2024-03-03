package BOJ.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10817 {
    public static void main(String[] args) {        // 정렬 > 세 수
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for(int i=0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}
