package solve_Lev0;

public class Programmers_181905 {
	public static void main(String[] args) {
//		String my_string = "Progra21Sremm3";
//		int s = 6;
//		int e = 12;
		
		String my_string = "Stanley1yelnatS";
		int s = 4;
		int e = 10;
		
		System.out.println(solution(my_string, s, e));
	}
	
	// 나처럼 한 사람 없음...
	public static String solution(String my_string, int s, int e) {		// 문자열 뒤집기
        String answer = "";
        
        for(int i=0; i<s; i++) {
        	answer += my_string.charAt(i);
        	System.out.println(my_string.charAt(i));
        }
        System.out.println("===============");
        for(int i=e; i>=s; i--) {		// 12 11
        	answer += my_string.charAt(i);
        	System.out.println(my_string.charAt(i));
        }
        System.out.println("===============");
        for(int i=e+1; i<my_string.length(); i++) {
        	answer += my_string.charAt(i);
        	System.out.println(my_string.charAt(i));
        }
        
        return answer;
    }
}
