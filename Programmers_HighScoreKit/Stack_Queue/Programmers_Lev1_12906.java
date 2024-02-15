package Programmers_HighScoreKit.Stack_Queue;

import java.util.ArrayList;

public class Programmers_Lev1_12906 {
    public static void main(String[] args) {
        // int[] arr = {1,1,3,3,0,1,1};              // 1,3,0,1
        int[] arr = {4, 4, 4, 3, 3};              // 4, 3

        System.out.println(solution(arr));
    }

    public static int[] solution(int []arr) {       // 같은 숫자는 싫어 : 중복제거(직전값 중복시) + 순서유지
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i=1; i<arr.length; i++) {
            if(list.get(list.size()-1) != arr[i]) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
