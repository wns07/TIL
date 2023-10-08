package Programmers_Lev0;
import java.util.ArrayList;

public class Programmers_181860 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        
        System.out.println(solution(arr, flag));
    }

    public static int[] solution(int[] arr, boolean[] flag) {       // 빈 배열에 추가, 삭제하기
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<flag.length; i++) {
            if(flag[i]) {
                for(int j=0; j<arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for(int j=0; j<arr[i]; j++) {
                    list.remove(list.size()-1);
                }
            }
        }

        // System.out.println(list);

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
