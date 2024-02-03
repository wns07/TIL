package Programmers_Lev0;
import java.util.ArrayList;

public class Programmers_181921 {
    public static void main(String[] args) {
        // int l = 5;          // [5, 50, 55, 500, 505, 550, 555]
        // // int r = 55;
        // int r = 555;

        // int l = 10;         // [-1]
        // int r = 20;

        int l = 5;         // [-1]
        int r = 6;

        System.out.println(solution(l, r));
    }

    public static int[] solution(int l, int r) {        // 배열 만들기 2
        int[] answer = {};                              // 2진법으로 푼 멋진 풀이도 있음
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=l; i<=r; i+=5) {
            String s = String.valueOf(i);
            String[] str = s.split("");
            boolean b = false;

            for(int j=0; j<str.length; j++) {
                if( !(str[j].equals("0") || str[j].equals("5") ) ) {
                    b = true;
                }
            }

            if(!b) {
                list.add(i);
            }
        }

        if(list.size() > 0) {
            answer = new int[list.size()];

            for(int i=0; i<answer.length; i++) {
                answer[i] = list.get(i);
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        // 확인
        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();

        return answer;
    }
}
