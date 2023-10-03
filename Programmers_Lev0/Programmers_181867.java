package Programmers_Lev0;
import java.util.ArrayList;

public class Programmers_181867 {
    public static void main(String[] args) {
        String myString = "oxooxoxxox";     // o x oo x o xx o x
                                            // 1,  2,   1, 0, 1, 0
        // String myString = "xabcxdefxghi";  // x  abc x def x ghi
                                            // 0, 3,    3,    3

        System.out.println(solution(myString));
    }

    public static int[] solution(String myString) {         // x 사이의 개수
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        // System.out.println("첫번째 : " + myString.charAt(0));
        // System.out.println("마지막 : " + myString.charAt(myString.length()-1));

        // System.out.println("전체 : " + myString);
        String[] s = myString.split("x");

        for(int i=0; i<s.length; i++) {
            list.add(s[i].length());
        }

        if(myString.charAt(myString.length()-1) == 'x') {
            list.add(0);
        }
        // System.out.println(list);

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

        return answer;
    }
}
