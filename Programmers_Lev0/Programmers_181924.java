package solve_Lev0;

public class Programmers_181924 {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
		
		System.out.println(solution(arr, queries));
	}

    public static int[] solution(int[] arr, int[][] queries) {		// 수열과 구간 쿼리 3
        int[] answer = {};
        answer = new int[arr.length];
        
        for(int i=0; i<queries.length; i++) {
        	int idx1 = queries[i][0];
        	int idx2 = queries[i][1];
        	
        	int temp1 = arr[idx1];
        	int temp2 = arr[idx2];
        	
        	arr[idx1] = temp2;
        	arr[idx2] = temp1;
        }
        
        for(int i=0; i<arr.length; i++) {
        	answer[i] = arr[i];
        }
        
        return answer;
    }
}
