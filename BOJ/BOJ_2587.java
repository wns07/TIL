package BOJ;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2587 {
    public static void main(String[] args) {        // 정렬 > 대표값2
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();

        Arrays.sort(arr);

        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}
