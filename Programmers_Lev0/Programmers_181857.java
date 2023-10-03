package Programmers_Lev0;

public class Programmers_181857 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};		// [1,2,3,4,5,6,0,0]
//		int[] arr = {58, 172, 746, 89};		// [58, 172, 746, 89]
		
		System.out.println(solution(arr));
	}

    public static int[] solution(int[] arr) {		// 배열의 길이를 2의 거듭제곱으로 만들기
        int[] answer = {};
        int len = 0;
        int cnt = 0;
        
        while(len<arr.length) {
        	System.out.println("거듭제곱 전 : " + len);
        	len = (int) Math.pow(2, cnt++);
        }
        
        answer = new int[len];
        for(int i=0; i<arr.length; i++) {
        	answer[i] = arr[i];
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.print(answer[i] + " ");
        }
        
        return answer;
    }
}
