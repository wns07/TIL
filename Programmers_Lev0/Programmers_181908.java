package solve_Lev0;

public class Programmers_181908 {
	public static void main(String[] args) {
		String my_string = "banana";
//		String is_suffix = "ana";		// 1
//		String is_suffix = "nan";		// 0
//		String is_suffix = "wxyz";		// 0
		String is_suffix = "abanana";	// 0
		
		System.out.println(solution(my_string, is_suffix));
	}

    public static int solution(String my_string, String is_suffix) {		// 접미사인지 확인하기
        int answer = 0;
        
        if(my_string.endsWith(is_suffix)) {
        	answer = 1;
        }
        
        return answer;
    }
}
