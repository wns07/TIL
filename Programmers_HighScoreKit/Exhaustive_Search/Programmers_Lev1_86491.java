package Programmers_HighScoreKit.Exhaustive_Search;

public class Programmers_Lev1_86491 {
    public static void main(String[] args) {
        // int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};       // 4000
        // int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};  // 120
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};      // 133
        
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {     // 최소직사각형 : Math.Max 쓰면 깔끔함
        int answer = 0;
        int w = 0;
        int h = 0;

        for(int i=0; i<sizes.length; i++) {
            int t_width = sizes[i][0];
            int t_height = sizes[i][1];
            int temp = 0;

            // 가로>세로
            if(t_width < t_height) {
                temp = t_width;
                t_width = t_height;
                t_height = temp;
            }

            if(t_width > w) {
                w = t_width;
            }

            if(t_height > h) {
                h = t_height;
            }
        }

        answer = w * h;

        return answer;
    }
}
