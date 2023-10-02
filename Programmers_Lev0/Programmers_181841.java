package solve_Lev0;

public class Programmers_181841 {
	public static void main(String[] args) {		// 꼬리 문자열
		String[] str_list = {"abc", "def", "ghi"};
		String ex = "ef";
		
		System.out.println(solution(str_list, ex));
	}

    public static String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(int i=0; i<str_list.length; i++) {
        	if(str_list[i].contains(ex)) {
        		str_list[i] = "";
        	}
        	answer += str_list[i];
        }
        
        return answer;
    }
}
