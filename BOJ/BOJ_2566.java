package BOJ;
import java.util.Scanner;

public class BOJ_2566 {
    public static void main(String[] args) {        // 2차원 배열 > 최대값 : 완료
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int row = 0;
        int column = 0;

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
                // System.out.print(arr[i][j] + " ");
            }
            // System.out.println();
        }
        System.out.println(max);
        System.out.println((row+1) + " " + (column+1));
    }
}
