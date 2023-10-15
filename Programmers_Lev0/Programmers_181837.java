package Programmers_Lev0;

public class Programmers_181837 {
    public static void main(String[] args) {
        // String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};     // 19000
        String[] order = {"americanoice", "americano", "iceamericano"};     // 13500
        
        System.out.println(solution(order));
    }

    public static int solution(String[] order) {            // 커피 심부름
        int answer = 0;

        for(int i=0; i<order.length; i++) {
            if(order[i].contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }

        return answer;
    }
}
