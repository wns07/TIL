package solve_Lev0;

public class Programmers_181874 {
	public static void main(String[] args) {
		String myString = "abstract algebra";		// AbstrAct AlgebrA
//		String myString = "PrOgRaMmErS";			// progrAmmers
		
		System.out.println(solution(myString));
	}

    public static String solution(String myString) {		// A 강조하기
    														// myString.replace('a', 'A')
        String answer = "";
        myString = myString.toLowerCase();
        String[] s = myString.split("");
        
        for(int i=0; i<s.length; i++) {
        	if(s[i].equals("a")) {
        		s[i] = "A";
        	}
        	answer += s[i];
        }
        
        
        return answer;
    }
}
