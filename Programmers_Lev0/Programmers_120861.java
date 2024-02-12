package Programmers_Lev0;

public class Programmers_120861 {
    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};     // [2, 1]

        // String[] keyinput = {"down", "down", "down", "down", "down"};
        // int[] board = {7, 9};     // [0, -4]

        System.out.println(solution(keyinput, board));
    }

    public static int[] solution(String[] keyinput, int[] board) {      // 캐릭터의 좌표
        int[] answer = {};
        answer = new int[2];

        int maxWidth = board[0]/2;
        int maxHeight = board[1]/2;

        System.out.println(maxWidth + " : " + maxHeight);

        for(int i=0; i<keyinput.length; i++) {
            String key = keyinput[i];

            if(key.equals("up")) {
                if(maxHeight >= (answer[1] + 1)) {
                    answer[1] += 1;
                }
            } else if(key.equals("down")) {
                if(maxHeight*-1 <= (answer[1] - 1)) {
                    answer[1] -= 1;
                }
            } else if(key.equals("right")) {
                if(maxWidth >= (answer[0] + 1)) {
                    answer[0] += 1;
                }
            } else if(key.equals("left")) {
                if(maxWidth*-1 <= (answer[0] - 1)) {
                    answer[0] -= 1;
                }
            }

            System.out.println(i + " : " + key + " : [" + answer[0] + ", " + answer[1] + "]");
        }

        System.out.println(answer[0] + " : " + answer[1]);

        return answer;
    }
}
