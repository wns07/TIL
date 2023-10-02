package solve_Lev0;

public class Programmers_181871 {
	public static void main(String[] args) {
		String myString = "banana";
		String pat = "ana";
		
//		String myString = "aaaa";
//		String pat = "aa";
		
		System.out.println(solution(myString, pat));
	}

    public static int solution(String myString, String pat) {		// 문자열이 몇 번 등장하는지 세기
        int answer = 0;
        
        for(int i=0; i<myString.length()-(pat.length()-1); i++) {
        	String s = myString.substring(i, i+pat.length());
        	
        	if(s.equals(pat)) {
        		answer++;
        	}
        	System.out.println(i + " : " + s);
        }
        
        System.out.println();
        System.out.println(myString.length());
        System.out.println(myString.substring(0, 3));
        
        return answer;
    }
}
