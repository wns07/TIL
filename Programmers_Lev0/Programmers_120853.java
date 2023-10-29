package Programmers_Lev0;

public class Programmers_120853 {
    public static void main(String[] args) {
        // String s = "1 2 Z 3";       // 4
        // String s = "10 20 30 40";       // 100
        String s = "10 Z 20 Z 1";       // 1
        
        System.out.println(solution(s));
    }


    public static int solution(String s) {      // 컨트롤 제트
        int answer = 0;
        String[] str = s.split(" ");
        String temp = "";

        for(int i=0; i<str.length; i++) {
            System.out.print(str[i] + " ");

            if(!str[i].equals("Z")) {
                answer += Integer.parseInt(str[i]);
                temp = str[i];
            } else {
                answer -= Integer.parseInt(temp);
            }
        }
        
        return answer;
    }
}
