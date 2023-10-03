package Programmers_Lev0;
import java.util.*;

public class Programmers_181945 {
	public static void main(String[] args) {			// 문자열 돌리기
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        String[] s = a.split("");
        
        for(int i=0; i<s.length; i++) {
        	System.out.println(s[i]);
        }
	}
}
