package Programmers_HighScoreKit.Exhaustive_Search;

public class Programmers_Lev1_42840 {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};        // 1
        // int[] answers = {1, 3, 2, 4, 2};        // 1, 2, 3

        System.out.println(solution(answers));
    }

    public static int[] solution(int[] answers) {       // 모의고사 : 다른사람 풀이도 대부분 비슷함
        int[] answer = {};
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        int maxScore = 0;
        int cnt = 0;

        for(int i=0; i<answers.length; i++) {
            // System.out.println(i + " : " + pattern1.length + " // " + i%pattern1.length);
            if(answers[i] == pattern1[(i%pattern1.length)]) {
                answer1++;
            }
            if(answers[i] == pattern2[(i%pattern2.length)]) {
                answer2++;
            }
            if(answers[i] == pattern3[(i%pattern3.length)]) {
                answer3++;
            }
        }

        maxScore = Math.max(answer1, Math.max(answer2, answer3));

        System.out.println(answer1 + " : " + answer2 + " : " + answer3);
        System.out.println(maxScore);

        if(maxScore == answer1) {
            cnt++;
        }

        if(maxScore == answer2) {
            cnt++;
        }

        if(maxScore == answer3) {
            cnt++;
        }

        answer = new int[cnt];
        int index = 0;

        if(maxScore == answer1) {
            answer[index++] = 1;
        }

        if(maxScore == answer2) {
            answer[index++] = 2;
        }

        if(maxScore == answer3) {
            answer[index++] = 3;
        }
        
        return answer;
    }
}
