package Programmers_Lev0;

public class Programmers_181861 {
	public static void main(String[] args) {		// 배열의 원소만큼 추가하기
		int[] arr = {5, 1, 4};
		
		System.out.println(solution(arr));
	}

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int len = 0;
        for(int i=0; i<arr.length; i++) {
        	len += arr[i];
        }
        answer = new int[len];
        
        int index = 0;
        for(int i=0; i<arr.length; i++) {
        	for(int j=0; j<arr[i]; j++) {
        		answer[index++] = arr[i];
        	}
        }
        
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        
        return answer;
    }
}
