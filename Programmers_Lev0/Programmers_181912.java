package Programmers_Lev0;
import java.util.*;

public class Programmers_181912 {
	public static void main(String[] args) {
		String[] intStrs = {"0123456789","9876543210","9999999999999"};
		int k = 50000;
		int s = 5;
		int l = 5;
		
		System.out.println(solution(intStrs, k, s, l));
	}

    public static int[] solution(String[] intStrs, int k, int s, int l) {		// 배열 만들기 5
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++) {
        	int n = Integer.parseInt(intStrs[i].substring(s, s+l));
        	if(n>k) {
        		list.add(n);
        	}
        }
        
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
