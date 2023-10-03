package Programmers_Lev0;

public class Programmers_181917 {
	public static void main(String[] args) {
//		boolean x1 = false;
//		boolean x2 = true;
//		boolean x3 = true;
//		boolean x4 = true;
		
		boolean x1 = true;
		boolean x2 = false;
		boolean x3 = false;
		boolean x4 = false;
		
		System.out.println(solution(x1, x2, x3, x4));
	}

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {// 간단한 논리 연산
        boolean answer = true;
        
        answer = ((x1||x2) && (x3||x4));
        
        return answer;
    }
}
