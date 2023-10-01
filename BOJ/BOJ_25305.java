package BOJ;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_25305 {
    public static void main(String[] args) {        // 정렬 > 커트라인
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // 응시자 수
        int k = sc.nextInt();       // 상받는사람 수
        int[] stu = new int[n];

        for(int i=0; i<n; i++) {
            stu[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(stu);

        System.out.println(stu[n-k]);
    }
}
