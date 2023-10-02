package solve_Lev0;

public class Programmers_181911 {
	public static void main(String[] args) {
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		
		System.out.println(solution(my_strings, parts));
	}
	
    public static String solution(String[] my_strings, int[][] parts) {	// 부분 문자열 이어 붙여 문자열 만들기
        String answer = "";
        
        for(int i=0; i<parts.length; i++) {
        	int start = parts[i][0];
        	int end = parts[i][1];
        	
        	answer += my_strings[i].substring(start, end+1);
        }
        
        return answer;
    }
}
