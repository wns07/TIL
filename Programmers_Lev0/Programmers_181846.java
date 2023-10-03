package Programmers_Lev0;
import java.math.*;

public class Programmers_181846 {
	public static void main(String[] args) {
//		String a = "582";
//		String b = "734";		// 1316
		
		String a = "18446744073709551615";
		String b = "287346502836570928366";		// 305793246910280479981
		
		
		System.out.println(solution(a, b));
	}

    public static String solution(String a, String b) {		// 두 수의 합
        String answer = "";
        
        BigInteger a1 = new BigInteger(a);
        BigInteger a2 = new BigInteger(b);
        
//        System.out.println(a1.add(a2));
        
        answer = String.valueOf(a1.add(a2));
        
        return answer;
    }
}
