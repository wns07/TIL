package Programmers_Lev0;

public class Programmers_181925 {
	public static void main(String[] args) {
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		
		System.out.println(solution(numLog));		// "wsdawsdassw"
	}

    public static String solution(int[] numLog) {		// 수 조작하기 2
        String answer = "";
        
        for(int i=0; i<numLog.length-1; i++) {
        	int pre = numLog[i];
        	int post = numLog[i+1];
        	
        	int num = post - pre;
        	
        	if(num == 1) {
        		answer += "w";
        	} else if(num == -1) {
        		answer += "s";
        	} else if(num == 10) {
        		answer += "d";
        	} else if(num == -10) {
        		answer += "a";
        	}
        	
//        	System.out.println(pre + " : " + post);
        }
        
        return answer;
    }
}
