package solve_Lev0;

public class Programmers_181878 {
	public static void main(String[] args) {			// 원하는 문자열 찾기
		String myString = "AbCdEfG";
		String pat = "aBc";
		
		System.out.println(solution(myString, pat));
	}

    public static int solution(String myString, String pat) {
        int answer = 0;

        if(myString.toUpperCase().contains(pat.toUpperCase())) {
        	answer = 1;
        }
        
        return answer;
    }
}
