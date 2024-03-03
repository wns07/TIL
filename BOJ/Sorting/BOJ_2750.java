package BOJ.Sorting;

import java.util.Arrays;
import java.util.Scanner;

// 수의 갯수 - 1 이상 1000 이하
// 수      - 절대값이 1000 보다 작거나 같은 정수
public class BOJ_2750 {
    public static void main(String[] args) {            // 정렬 > 수 정렬하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
