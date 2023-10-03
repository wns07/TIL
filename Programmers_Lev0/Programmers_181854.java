package Programmers_Lev0;

public class Programmers_181854 {
	public static void main(String[] args) {
		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		
		System.out.println(solution(arr, n));
	}

    public static int[] solution(int[] arr, int n) {	// 배열의 길이에 따라 다른 연산하기
        int[] answer = {};
        answer = arr;
        
        if(arr.length%2 == 1) {
        	for(int i=0; i<arr.length; i++) {
        		if(i%2 == 0) {
        			answer[i] += n;
        		}
        	}
        } else {
        	for(int i=0; i<arr.length; i++) {
        		if(i%2 == 1) {
        			answer[i] += n;
        		}
        	}
        }
        
        return answer;
    }
}
