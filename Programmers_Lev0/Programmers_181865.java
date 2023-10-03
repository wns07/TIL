package Programmers_Lev0;

public class Programmers_181865 {
	public static void main(String[] args) {
		String binomial = "43 + 12";
		
		System.out.println(solution(binomial));
	}

    public static int solution(String binomial) {		// 간단한 식 계산하기
        int answer = 0;
        String[] s = binomial.split(" ");
        int a = Integer.parseInt(s[0]);
        String op = s[1];
        int b = Integer.parseInt(s[2]);
        
        if(op.equals("+")) {
        	answer = a + b;
        } else if(op.equals("-")) {
        	answer = a - b;
        } else if(op.equals("*")) {
        	answer = a * b;
        }
        
        return answer;
    }
}
