package solve_Lev0;

public class Programmers_181891 {
	public static void main(String[] args) {
//		int[] num_list = {2, 1, 6};
//		int n = 1;
		
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		
		System.out.println(solution(num_list, n));
	}

    public static int[] solution(int[] num_list, int n) {		// 순서 바꾸기
        int[] answer = {};
        answer = new int[num_list.length];
        int cnt = 0;
        
        for(int i=n; i<num_list.length; i++) {
        	answer[cnt++] = num_list[i];
        }
        
        for(int i=0; i<n; i++) {
        	answer[cnt++] = num_list[i];
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
