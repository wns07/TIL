package solve_Lev0;
import java.util.*;

public class Programmers_181853 {
	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		
		System.out.println(solution(num_list));
	}

    public static int[] solution(int[] num_list) {		// 뒤에서 5등까지 : Arrays.sort()
        int[] answer = {};
        answer = new int[5];
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<num_list.length; i++) {
        	list.add(num_list[i]);
        }
        Collections.sort(list);
        for(int i=0; i<5; i++) {
        	System.out.println(list.get(i));
//        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
