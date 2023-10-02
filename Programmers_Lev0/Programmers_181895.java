package solve_Lev0;
import java.util.*;

public class Programmers_181895 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[][] intervals = {{1, 3}, {0, 4}};
		
		System.out.println(solution(arr, intervals));
	}

    public static int[] solution(int[] arr, int[][] intervals) {		// 배열 만들기 3
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<intervals.length; i++) {
        	for(int j=intervals[i][0]; j<=intervals[i][1]; j++) {
        		list.add(arr[j]);
        	}
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
