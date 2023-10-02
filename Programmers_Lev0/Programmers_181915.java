package solve_Lev0;

public class Programmers_181915 {
	public static void main(String[] args) {		// 글자 이어 붙여 문자열 만들기
		String my_string = "cvsgiorszzzmrpaqpe";
		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		
		System.out.println(solution(my_string, index_list));
	}

    public static String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] s = my_string.split("");
        
        for(int i=0; i<index_list.length; i++) {
        	answer += s[index_list[i]];
        }
        
        return answer;
    }
}
