package Programmers_Lev0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Programmers_181851 {
    public static void main(String[] args) {
        // int[] rank = {3, 7, 2, 5, 4, 6, 1};     // 20403
        // boolean[] attendance = {false, true, true, true, true, false, false};

        // int[] rank = {1, 2, 3};     // 102
        // boolean[] attendance = {true, true, true};

        int[] rank = {6, 1, 5, 2, 3, 4};     // 50200
        boolean[] attendance = {true, false, true, false, false, true};

        System.out.println(solution(rank, attendance));
    }

    public static int solution(int[] rank, boolean[] attendance) {      // 전국 대회 선발 고사
        int answer = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0; i<attendance.length; i++) {
            if(attendance[i]) {
                list.add(rank[i]);
                hash.put(rank[i], i);
            }
        }

        Collections.sort(list);

        a = hash.get(list.get(0));
        b = hash.get(list.get(1));
        c = hash.get(list.get(2));

        // System.out.println(list);
        // System.out.println(hash);

        answer = (10000 * a) + (100 * b) + c;

        return answer;
    }
}
