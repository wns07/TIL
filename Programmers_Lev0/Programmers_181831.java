package Programmers_Lev0;

public class Programmers_181831 {
	public static void main(String[] args) {
//		int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};			// 1
		int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
		
		System.out.println(solution(arr));
	}

    public static int solution(int[][] arr) {		// 특별한 이차원 배열 2
        int answer = 1;
        int chk = 1;
        
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i].length; j++) {
        		if(arr[i][j] != arr[j][i]) {
        			answer = 0;
        			chk = 0;
        			break;
        		}
        	}
        	if(chk == 0) {
        		break;
        	}
        }
        
        return answer;
    }
}
