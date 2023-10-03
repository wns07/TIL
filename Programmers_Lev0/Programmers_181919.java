package Programmers_Lev0;

public class Programmers_181919 {
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println(solution(n));
	}

    public static int[] solution(int n) {			// 콜라츠 수열 만들기
        int[] answer = {};
        int temp = n;
        
        int cnt = 1;
        while(n != 1) {
        	if(n%2 == 0) {
        		n /= 2;
        	} else {
        		n = (3 * n) + 1;
        	}
        	cnt++;
        }
        System.out.println(cnt);
        answer = new int[cnt];
        answer[0] = temp;
        
        int count = 1;
        while(temp != 1) {
        	if(temp%2 == 0) {
        		temp /= 2;
        	} else {
        		temp = (3 * temp) + 1;
        	}
        	
        	answer[count++] = temp;
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
