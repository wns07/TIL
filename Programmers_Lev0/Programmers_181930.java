package solve_Lev0;

public class Programmers_181930 {					// 신기한 문제풀이법이 있음
	public static void main(String[] args) {
//		int a = 2;
//		int b = 6;
//		int c = 1;		// 9
		
		int a = 5;
		int b = 3;
		int c = 3;		// 473
		
		System.out.println(solution(a, b, c));
	}

    public static int solution(int a, int b, int c) {		// 주사위 게임 2
        int answer = 0;
        
        if( (a!=b) && (b!=c) && (a!=c) ) {
        	answer = a+b+c;
        } else if ( (a==b) && (b==c) && (a==c) ) {
        	answer += (a+b+c);
        	answer *= (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        	answer *= (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        } else {
        	answer += (a+b+c);
        	answer *= (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }
        
        return answer;
    }
}
