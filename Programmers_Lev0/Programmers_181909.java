package Programmers_Lev0;
import java.util.*;

public class Programmers_181909 {
	public static void main(String[] args) {
		String my_string = "banana";
		
		System.out.println(solution(my_string));
	}

    public static String[] solution(String my_string) {		// 접미사 배열
        String[] answer = {};
        answer = new String[my_string.length()];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = my_string.substring(my_string.length()-i-1, my_string.length());
        }
        
        Arrays.sort(answer);
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        
        return answer;
    }
}
