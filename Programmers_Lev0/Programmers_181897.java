package solve_Lev0;
import java.util.*;

public class Programmers_181897 {
	public static void main(String[] args) {
//		int n = 3;		// [2,3,4,5,6]
		int n = 4;		// [2,4,6]
		
		int[] slicer = {1, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(solution(n, slicer, num_list));
	}

    public static int[] solution(int n, int[] slicer, int[] num_list) {		// 리스트 자르기
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        if(n == 1) {
        	for(int i=0; i<=slicer[1]; i++) {
        		list.add(num_list[i]);
        	}
        } else if(n == 2) {
        	for(int i=slicer[0]; i<num_list.length; i++) {
        		list.add(num_list[i]);
        	}
        } else if(n == 3) {
        	for(int i=slicer[0]; i<=slicer[1]; i++) {
        		list.add(num_list[i]);
        	}
        } else if(n == 4) {
        	for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]) {
        		list.add(num_list[i]);
        	}
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
