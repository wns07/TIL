package solve_Lev0;

public class Programmers_181885 {
	public static void main(String[] args) {
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		
		System.out.println(solution(todo_list, finished));
	}

    public static String[] solution(String[] todo_list, boolean[] finished) {		// 할 일 목록
        String[] answer = {};
        int cnt = 0;
        for(int i=0; i<finished.length; i++) {
        	if(!finished[i]) {
        		cnt++;
        	}
        }
        answer = new String[cnt];
        cnt = 0;
        
        for(int i=0; i<todo_list.length; i++) {
        	if(!finished[i]) {
        		answer[cnt++] = todo_list[i];
        	}
        }
        
        for(int i=0; i<answer.length; i++) {		// 출력 확인
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
