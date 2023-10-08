package Programmers_Lev0;

public class Programmers_181829 {
    public static void main(String[] args) {
        int[][] board = new int[][] { {0, 1, 2}
                                    , {1, 2, 3}
                                    , {2, 3, 4}
                                    , {3, 4, 5} };
        int k = 2;

        System.out.println(solution(board, k));
    }
    public static int solution(int[][] board, int k) {         // 이차원 배열 대각선 순회하기
        int answer = 0;

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[i].length; j++) {
                if(i + j <= k) {                            // 문제 잘 읽기
                    // System.out.println(board[i][j]);
                    answer += board[i][j];
                }
                // System.out.print(board[i][j] + " ");
            }
            // System.out.println();
        }
        return answer;
    }
}
