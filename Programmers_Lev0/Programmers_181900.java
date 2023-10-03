package Programmers_Lev0;

public class Programmers_181900 {
	public static void main(String[] args) {
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		
		System.out.println(solution(my_string, indices));
	}

    public static String solution(String my_string, int[] indices) {		// 글자 지우기
        String answer = "";
        String[] temp = my_string.split("");
        
    	for(int i=0; i<indices.length; i++) {
    		temp[indices[i]] = "";
    	}
    	
    	for(int i=0; i<temp.length; i++) {
    		answer += temp[i];
    	}
        
        return answer;
    }
}
