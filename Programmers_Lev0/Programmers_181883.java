package Programmers_Lev0;

public class Programmers_181883 {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
		
		System.out.println(solution(arr, queries));
	}

    public static int[] solution(int[] arr, int[][] queries) {		// 수열과 구간 쿼리 1
        int[] answer = {};
        answer = new int[arr.length];
        
        for(int i=0; i<queries.length; i++) {
        	int idx1 = queries[i][0];
        	int idx2 = queries[i][1];
        	
        	for(int j=idx1; j<=idx2; j++) {
        		arr[j] += 1;
        	}
        }
        
        for(int i=0; i<arr.length; i++) {
        	answer[i] = arr[i];
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.print(answer[i] + " ");
        }
        
        return answer;
    }
}
