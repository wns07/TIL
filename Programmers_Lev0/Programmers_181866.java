package solve_Lev0;
import java.util.*;

public class Programmers_181866 {
	public static void main(String[] args) {
//		String myString = "axbxcxdx";
//		String myString = "dxccxbbbxaaaa";
		String myString = "dxccxbbbxxaaaa";
		
		System.out.println(solution(myString));
	}

    public static String[] solution(String myString) {		// 문자열 잘라서 정렬하기
        String[] answer = {};
        String[] temp = myString.split("x");
        
        int len = 0;
        for(int i=0; i<temp.length; i++) {
        	if(temp[i].length() > 0) {
        		len++;
        	}
//        	System.out.println(temp[i]);
        }
        answer = new String[len];
        
        int len1 = 0;
        for(int i=0; i<temp.length; i++) {
        	if(temp[i].length() > 0) {
        		answer[len1++] = temp[i];
        	}
        }
        Arrays.sort(answer);
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
