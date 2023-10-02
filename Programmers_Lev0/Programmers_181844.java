package solve_Lev0;

public class Programmers_181844 {
	public static void main(String[] args) {
//		int[] arr = {293, 1000, 395, 678, 94};
//		int[] delete_list = {94, 777, 104, 1000, 1, 12};			// [293, 395, 678]

		int[] arr = {110, 66, 439, 785, 1};
		int[] delete_list = {377, 823, 119, 43};					// [110, 66, 439, 785, 1]

		System.out.println(solution(arr, delete_list));
	}

	// arraylist로 풀었는데 왜 틀렸는지 몰라서 배열로 다시 품
    public static int[] solution(int[] arr, int[] delete_list) {	// 배열의 원소 삭제하기 
        int[] answer = {};
        boolean[] chk = new boolean[arr.length];
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<delete_list.length; j++) {
        		if(arr[i] == delete_list[j]) {
        			chk[i] = true;
        			break;
        		}
        	}
        }
        
        int len = 0;
        for(int i=0; i<chk.length; i++) {
        	if(!chk[i]) {
        		len++;
        	}
        }
        answer = new int[len];
        
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
        	if(!chk[i]) {
        		answer[idx++] = arr[i];
        	}
        }
        
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
