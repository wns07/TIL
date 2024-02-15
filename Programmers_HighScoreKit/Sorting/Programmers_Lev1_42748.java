package Programmers_HighScoreKit.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_Lev1_42748 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution(arr, commands));
    }

    public static int[] solution(int[] array, int[][] commands) {       // k번째 수 : Arrays.copyOfRange 사용하면 편함
        int[] answer = {};
        answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int index = commands[i][2];
            // System.out.println(start + " : " + end + " : " + index);

            for(int j=start; j<end+1; j++) {
                list.add(array[j-1]);
            }
            Collections.sort(list);
            answer[i] = list.get(index-1);
            // System.out.println(list);
            // System.out.println();

            list.clear();
        }

        // for(int i=0; i<answer.length; i++) {
        //     System.out.println(answer[i]);
        // }

        return answer;
    }
}
