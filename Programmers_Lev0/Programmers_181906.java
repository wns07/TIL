package solve_Lev0;

public class Programmers_181906 {
	public static void main(String[] args) {			// 접두사인지 확인하기
		String my_string = "banana";
//		String is_prefix = "ban";
		String is_prefix = "nan";
		
		System.out.println(solution(my_string, is_prefix));
	}
	
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        if(my_string.startsWith(is_prefix)) {
        	answer = 1;
        }
        
        return answer;
    }
}
