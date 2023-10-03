package Programmers_Lev0;

public class Programmers_181942 {
	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		
		System.out.println(solution(str1, str2));
	}

    public static String solution(String str1, String str2) {		// 문자열 섞기
        String answer = "";
        int len = str1.length() + str2.length();
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0; i<len; i++) {
        	if(i%2 == 0) {
        		answer += str1.charAt(cnt1++);
        	} else {
        		answer += str2.charAt(cnt2++);
        	}
        }
        
        return answer;
    }
}
