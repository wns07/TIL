package solve_Lev0;

public class Programmers_181882 {
	public static void main(String[] args) {		// 조건에 맞게 수열 변환하기 1
		int[] arr = {1, 2, 3, 100, 99, 98};
		
		System.out.println(solution(arr));
	}

    public static int[] solution(int[] arr) {
        int[] answer = {};
        answer = new int[arr.length];
        
        for(int i=0; i<answer.length; i++) {
        	int temp = arr[i];
        	if((temp>=50) && (temp%2 == 0)) {
        		answer[i] = arr[i] / 2;
        	} else if((temp<50) && (temp%2 == 1)) {
        		answer[i] = arr[i] * 2;
        	} else {
        		answer[i] = arr[i];
        	}
        }
        
        return answer;
    }
}
