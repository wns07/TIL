package Programmers_Lev0;

public class Programmers_181913 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";       // programmers
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        System.out.println(solution(my_string, queries));
    }

    //          rermgorpsam
    // [2, 3] : remrgorpsam
    // [0, 7] : progrmersam
    // [5, 9] : prograsremm
    // [6, 10]: programmers
    public static String solution(String my_string, int[][] queries) {      // 문자열 여러 번 뒤집기
        String answer = "";
        String temp = my_string;

        for(int i=0; i<queries.length; i++) {
            int start = queries[i][0];
            int end   = queries[i][1];

            StringBuilder sb = new StringBuilder(temp.substring(start, end+1)).reverse();

            temp =   temp.substring(0, start)
                   + sb
                   + temp.substring(end+1, temp.length());
        }

        answer = temp;

        return answer;
    }
}
