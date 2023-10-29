package Programmers_Lev0;
import java.util.ArrayList;

public class Programmers_181894 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 1, 4, 5, 2, 9};      // [2, 1, 4, 5, 2]
        // int[] arr = {1, 2, 1};                  // [2]
        // int[] arr = {1, 1, 1};                  // [-1]
        int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};  // [2, 1, 2, 1, 10, 2]

        System.out.println(solution(arr));
    }
    public static int[] solution(int[] arr) {       // 2의 영역
        int[] answer = {};
        ArrayList<Integer> idx = new ArrayList<>();
        int len = 0;
        int index = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                idx.add(i);
            }
        }

        if(idx.size() > 0) {
            len = (idx.get(idx.size()-1) - idx.get(0)+1);
        }
        
        if(idx.size() > 0) {
            answer = new int[len];
            for(int i=idx.get(0); i<=idx.get(idx.size()-1); i++) {
                answer[index++] = arr[i];
            }
        } else {
            answer = new int[]{-1};
        }

        for(int i=0; i<answer.length; i++) {
            System.out.println(answer[i]);
        }

        return answer;
    }
}