package Programmers_Lev0;

public class Programmers_181875 {
	public static void main(String[] args) {		// 배열에서 문자열 대소문자 변환하기
		String[] strArr = {"AAA","BBB","CCC","DDD"};
		
		System.out.println(solution(strArr));
	}

    public static String[] solution(String[] strArr) {
        String[] answer = {};
        answer = new String[strArr.length];
        
        for(int i=0; i<strArr.length; i++) {
        	if(i%2 == 1) {
        		answer[i] = strArr[i].toUpperCase();
        	} else {
        		answer[i] = strArr[i].toLowerCase();
        	}
        }
        
        return answer;
    }
}
