package Programmers_Lev0;

public class Programmers_181862 {
    public static void main(String[] args) {
        String myStr = "baconlettucetomato";       // ["onlettu", "etom", "to"]
        // String myStr = "abcd";                     // ["d"]
        // String myStr = "cabab";                    // ["EMPTY"]

        System.out.println(solution(myStr));
    }

    public static String[] solution(String myStr) {     // 세 개의 구분자
        String[] answer = {};
        String[] tmp = myStr.split("a|b|c");
        int len = 0;
        int idx = 0;

        for(int i=0; i<tmp.length; i++) {
            if(tmp[i].length() > 0) {
                len++;
            }
        }
        answer = new String[len];

        if(len > 0) {
            for(int i=0; i<tmp.length; i++) {
                if(tmp[i].length() > 0) {
                    answer[idx++] = tmp[i];
                }
            }
        } else {
            answer = new String[]{"EMPTY"};
        }

        for(int i=0; i<answer.length; i++) {
            System.out.println(i + " : " + answer[i]);
        }
        return answer;
    }
}
