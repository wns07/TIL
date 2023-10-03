package Programmers_Lev0;

public class Programmers_181880 {
	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 1, 14};
//		int[] num_list = {10};
		
		System.out.println(solution(num_list));
	}

    public static int solution(int[] num_list) {			// 1로 만들기
        int answer = 0;
        
        for(int i=0; i<num_list.length; i++) {
        	int num = num_list[i];
        	
        	while(num > 1) {
        		if(num%2 == 0) {
        			num /= 2;
        			answer++;
        		} else {
        			num -= 1;
        		}
        	}
//        	answer++;
        	System.out.println(i + " : " + answer);
        }
        return answer;
    }
}
