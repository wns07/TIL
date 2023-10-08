package Programmers_Lev0;

public class Programmers_181922 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        System.out.println(solution(arr, queries));
    }

    // 0  1  2  3  4
    // 0, 1, 2, 4, 3 : 초기값
    // 1, 2, 3, 5, 4
    // 2, 2, 4, 5, 4
    // 3, 2, 4, 6, 4
    public static int[] solution(int[] arr, int[][] queries) {          // 수열과 구간 쿼리 4
        int[] answer = {};

        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            System.out.println(s + " : " + e + " : " + k);

            for(int j=s; j<=e; j++) {
                if(j%k == 0) {
                    arr[j] += 1;
                }
            }

            printResult(arr);
            System.out.println();

            answer = new int[arr.length];
            for(int j=0; j<arr.length; j++) {
                answer[j] = arr[j];
            }
        }

        return answer;
    }

    public static void printResult(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
