package Programmers_Lev0;

public class Programmers_181902 {
	public static void main(String[] args) {
		String my_string = "Programmers";
		
		System.out.println(solution(my_string));
	}
	
	// 더 깔끔하게 풀 수 있다...
	
	// A B C D E F G H I J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
	// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
    public static int[] solution(String my_string) {		// 문자 개수 세기
        int[] answer = {};
        String[] s = my_string.split("");
        
        int a1 = 'A';
        int b1 = 'Z';
        int c1 = 'a';
        int d1 = 'z';
        int len = (b1-a1+1) + (d1-c1+1);
        System.out.println("크기 : " + len);
        answer = new int[len];
        System.out.println("A : " + a1);
        System.out.println("Z : " + b1);
        System.out.println("a : " + c1);
        System.out.println("z : " + d1);
        System.out.println("=============");
        
        for(int i=0; i<s.length; i++) {
        	System.out.println(s[i]);
        }
        
        char c = s[0].charAt(0);		// String -> char
        int n = c;
        System.out.println("P : " + n);
        
        if(n-'a' >= 0) {
        	System.out.println("소문자 : " + (n-'a'));
        } else {
        	System.out.println("대문자 : " + (n-'A'));
        }

        System.out.println("=============");
        for(int i=0; i<s.length; i++) {
        	char temp = s[i].charAt(0);
        	int num = temp;
        	int index = 0;
        	
        	if(num - 'a' >= 0) {		// 소문자
        		index = num - 'a';
        		answer[index+26] += 1;
        	} else {					// 대문자
        		index = num - 'A';
        		System.out.println(index);
        		answer[index] += 1;
        	}
        }
        System.out.println("=============");
        
        for(int i=0; i<answer.length; i++) {
        	System.out.print(answer[i] + ", ");
        }
        System.out.println();

        return answer;
    }
}
