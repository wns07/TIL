package Programmers_Lev0;
import java.util.ArrayList;

public class Programmers_181918 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        System.out.println(solution(arr));
    }

    public static int[] solution(int[] arr) {           // 배열 만들기 4
        int[] stk = {};
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        while(i<arr.length) {
            if(list.size() > 0) {
                if(list.get(list.size()-1) < arr[i]) {
                    list.add(arr[i]);
                    i++;
                } else {
                    list.remove(list.size()-1);
                }
            } else {
                list.add(arr[i]);
                i++;
            }
        }

        System.out.println(list);

        stk = new int[list.size()];
        for(int j=0; j<stk.length; j++) {
            stk[j] = list.get(j);
        }

        return stk;
    }
}
