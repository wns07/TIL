package Programmers_Lev0;
import java.util.*;

public class Programmers_181870 {
	public static void main(String[] args) {
		String[] strArr = {"and","notad","abcd"};
		
		System.out.println(solution(strArr));
	}

    public static String[] solution(String[] strArr) {		// ad 제거하기
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++) {
        	if(!strArr[i].contains("ad")) {
        		list.add(strArr[i]);
//        		System.out.println(strArr[i]);
        	}
//        	System.out.println(strArr[i].contains("ad"));
        }
        
        answer = new String[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
