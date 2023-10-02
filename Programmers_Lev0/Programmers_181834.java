package solve_Lev0;

public class Programmers_181834 {
	public static void main(String[] args) {
		String myString = "abcdevwxyz";
		
		System.out.println(solution(myString));
	}

    public static String solution(String myString) {		// l로 만들기
        String answer = "";
        char[] c = myString.toCharArray();
        
        for(int i=0; i<c.length; i++) {
        	if(c[i] < 'l') {
        		c[i] = 'l';
        	}
        }
        
        for(int i=0; i<c.length; i++) {
        	answer += String.valueOf(c[i]);
        }
        
        return answer;
    }
}
