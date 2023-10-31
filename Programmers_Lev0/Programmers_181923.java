package Programmers_Lev0;

public class Programmers_181923 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};         // [3, 4, -1]
        // int[] arr = {0, 1, 2, 3, 4};            // [3, 3, -1]
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        
        System.out.println(solution(arr, queries));
    }

    public static int[] solution(int[] arr, int[][] queries) {      // 수열과 구간 쿼리 2
        int[] answer = {};                                          // Math.min(인자1, 인자2) 사용하면 편함
        answer = new int[queries.length];

        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int num = 1000001;

            for(int j=s; j<=e; j++) {
                if(arr[j] > k) {
                    if(num > arr[j]) {
                        num = arr[j];
                    }
                }
            }
            if(num == 1000001) {
                num = -1;
            }

            System.out.println(num);

            answer[i] = num;
        }

        return answer;
    }
}
