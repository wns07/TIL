package Programmers_Lev0;

public class Programmers_181855 {
    public static void main(String[] args) {
        String[] strArr = {"a","bc","d","efg","hi"};

        System.out.println(solution(strArr));
    }

    public static int solution(String[] strArr) {           // 문자열 묶기
        int answer = 0;
        int[] result = new int[30];

        for(int i=0; i<strArr.length; i++) {
            result[strArr[i].length()-1]++;
        }

        for(int i=0; i<result.length; i++) {
            if(answer < result[i]) {
                answer = result[i];
            }
            // System.out.println(i + " : " + result[i]);
        }

        return answer;
    }
}
