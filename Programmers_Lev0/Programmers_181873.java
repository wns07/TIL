package Programmers_Lev0;

public class Programmers_181873 {
	public static void main(String[] args) {		// 특정한 문자를 대문자로 바꾸기
		String my_string = "programmers";
		String alp = "p";
		
		System.out.println(solution(my_string, alp));
	}

    public static String solution(String my_string, String alp) {
        String answer = "";
        String[] s = my_string.split("");
        
        for(int i=0; i<s.length; i++) {
        	if(s[i].equals(alp)) {
        		answer += s[i].toUpperCase();
        	} else {
        		answer += s[i];
        	}
        }
        
        return answer;
    }
}
