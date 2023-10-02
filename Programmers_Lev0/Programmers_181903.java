package solve_Lev0;

public class Programmers_181903 {
	public static void main(String[] args) {
		int q = 3;
		int r = 1;
		String code = "qjnwezgrpirldywt";
		
		System.out.println(solution(q, r, code));
	}
	
    public static String solution(int q, int r, String code) {		// qr code
        String answer = "";
        String[] s = code.split("");
        
        for(int i=0; i<s.length; i++) {
        	if(i%q == r) {
        		answer += s[i];
        	}
        }
        
        return answer;
    }

}
