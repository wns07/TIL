package Programmers_Lev0;

public class Programmers_181886 {
	public static void main(String[] args) {
//		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern"};
		
		System.out.println(solution(names));
	}

    public static String[] solution(String[] names) {		// 5명씩
        String[] answer = {};
        int len = (names.length%5==0) ? names.length/5 : names.length/5 + 1;
        answer = new String[len];
        
        len = 0;
        for(int i=0; i<names.length; i+=5) {
        	answer[len++] = names[i];
        }
        
        for(int i=0; i<answer.length; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
