package solve_Lev0;

public class Programmers_181898 {
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 1};
		int idx = 1;

		System.out.println(solution(arr, idx));
	}
	
    public static int solution(int[] arr, int idx) {		// 가까운 1 찾기
        int answer = -1;
        
        for(int i=0; i<arr.length; i++) {
        	if(i>=idx && arr[i]==1) {
        		answer = i;
        		break;
        	}
        }
        
        return answer;
    }

}
