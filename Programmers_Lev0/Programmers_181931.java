package Programmers_Lev0;

public class Programmers_181931 {
	public static void main(String[] args) {
		int a = 3;
		int d = 4;
		boolean[] included = {true, false, false, true, true};
		
		System.out.println(solution(a, d, included));
	}

    public static int solution(int a, int d, boolean[] included) {		// 등차수열의 특정한 항만 더하기
        int answer = 0;
        
        for(int i=0; i<included.length; i++) {
        	if(included[i]) {
        		int num = a + ( d * i );
        		answer += num;
        	}
        }
        
        return answer;
    }
}
