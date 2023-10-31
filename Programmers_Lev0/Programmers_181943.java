package Programmers_Lev0;

public class Programmers_181943 {
    public static void main(String[] args) {
        // String my_string = "He11oWor1d";
        // String overwrite_string = "lloWorl";
        // int s = 2;

        String my_string = "Program29b8UYP";
        String overwrite_string = "merS123";
        int s = 7;

        System.out.println(solution(my_string, overwrite_string, s));
    }

    public static String solution(String my_string, String overwrite_string, int s) {       // 문자열 겹쳐쓰기
        String answer = "";

        answer += my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s+overwrite_string.length());
        
        return answer;
    }
}
