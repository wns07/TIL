package solve_Lev0;

public class Programmers_181838 {
	public static void main(String[] args) {
//		int[] date1 = {2021, 12, 28};
//		int[] date2 = {2021, 12, 29};
		
		int[] date1 = {1024, 10, 24};
		int[] date2 = {1024, 10, 24};
		
		System.out.println(solution(date1, date2));
	}

    public static int solution(int[] date1, int[] date2) {		// 날짜 비교하기
        int answer = 0;
        
        if(date1[0] < date2[0]) {
        	answer = 1;
        } else if (date1[0] > date2[0]) {
        	answer = 0;
        } else {
        	if(date1[1] < date2[1]) {
        		answer = 1;
        	} else if(date1[1] > date2[1]) {
        		answer = 0;
        	} else {
        		if(date1[2] < date2[2]) {
        			answer = 1;
        		}
        	}
        }
        
        return answer;
    }
}
