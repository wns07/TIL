package solve_Lev0;

public class Programmers_181864 {
	public static void main(String[] args) {		// 문자열 바꿔서 찾기
		String myString = "ABBAA";
		String pat = "AABB";
		
		System.out.println(solution(myString, pat));
	}

    public static int solution(String myString, String pat) {
        int answer = 0;
        String[] s = myString.split("");
        String temp = "";
        
        for(int i=0; i<s.length; i++) {
        	if(s[i].equals("A")) {
        		s[i] = "B";
        	} else if(s[i].equals("B")) {
        		s[i] = "A";
        	}
        	
        	temp += s[i];
        }
        
        if(temp.contains(pat)) {
        	answer = 1;
        }
        
        return answer;
    }
}
