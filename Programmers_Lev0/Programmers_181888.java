package Programmers_Lev0;

public class Programmers_181888 {
	public static void main(String[] args) {		// n개 간격의 원소들
//		int[] num_list = {4, 2, 6, 1, 7, 6};
//		int n = 2;
		
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 4;
		
		System.out.println(solution(num_list, n));
	}
	
    public static int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[(int) Math.ceil((double)num_list.length/n)];
        
        int index = 0;
        for(int i=0; i<num_list.length; i+=n) {
        	answer[index++] = num_list[i];
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
