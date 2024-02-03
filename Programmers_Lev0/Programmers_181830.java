package Programmers_Lev0;
import java.util.Arrays;

public class Programmers_181830 {
    public static void main(String[] args) {
        // int[][] arr = { {572, 22, 37}
        //               , {287, 726, 384}
        //               , {85, 137, 292}
        //               , {487, 13, 876} };
        int[][] arr = { {57, 192, 534, 2}
                      , {9, 345, 192, 999} };
        // int[][] arr = {{1, 2}, {3, 4}};
        
        System.out.println(solution(arr));
    }

    public static int[][] solution(int[][] arr) {       // 정사각형으로 만들기
        int[][] answer = {};

        if(arr.length > arr[0].length) {        // 행의 수가 많음
            int len = arr.length;
            answer = new int[len][len];

            for(int i=0; i<answer.length; i++) {
                // System.out.println(Arrays.toString(arr[i]));
                
                answer[i] = Arrays.copyOf(arr[i], len);

                // for(int j=0; j<answer[i].length; j++) {
                //     System.out.print(answer[i][j] + " ");
                // }
                // System.out.println();
            }
            // System.out.println();

        } else if (arr.length < arr[0].length) {   // 열의 수가 많음
            int len = arr[0].length;
            answer = new int[len][len];

            for(int i=0; i<arr.length; i++) {
                // System.out.println(Arrays.toString(arr[i]));
                answer[i] = Arrays.copyOf(arr[i], len);
            }
            // System.out.println();
        } else {
            answer = arr;
        }

        // System.out.println("===========");
        // for(int i=0; i<answer.length; i++) {
        //     for(int j=0; j<answer[i].length; j++) {
        //         System.out.print(answer[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        return answer;
    }
}
