package solve_Lev0;

public class Programmers_181868 {
	public static void main(String[] args) {		// 공백으로 구분하기 2 : 정규식
//		String my_string = "i    love  you";
		String my_string = "    programmers  ";
		
		System.out.println(solution(my_string));
	}

    public static String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string.trim().replaceAll("\\s+", " ").split(" ");
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i] + " ");
        }
        return answer;
    }
}
