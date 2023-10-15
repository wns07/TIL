package Programmers_Lev0;
import java.util.ArrayList;

public class Programmers_181859 {
    public static void main(String[] args) {
        // int[] arr = {0, 1, 1, 1, 0};
        int[] arr = {0, 1, 0, 1, 0};
        // int[] arr = {0, 1, 1, 0};

        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {       // 배열 만들기 6
        int[] answer = {};
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while ( i < arr.length ) {
            if(list.size() > 0) {
                if(list.get(list.size()-1) == arr[i]) {
                    list.remove(list.size()-1);
                    i++;
                } else {
                    list.add(arr[i]);
                    i++;
                }
            } else {
                list.add(arr[i]);
                i++;
            }
        }

        if(list.size() == 0) {
            answer = new int[]{-1};
            System.out.println(answer[0]);
        } else {
            answer = new int[list.size()];
            for(int j=0; j<answer.length; j++) {
                answer[j] = list.get(j);
            }
        }

        return answer;
    }
}
