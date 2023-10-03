package Programmers_Lev0;

public class Programmers_181904 {
	public static void main(String[] args) {
		String my_string = "ihrhbakrfpndopljhygc";		// ihrh bakr fpnd oplj hygc
		int m = 4;
		int c = 2;

//		String my_string = "programmers";
//		int m = 1;
//		int c = 1;

		System.out.println(solution(my_string, m, c));
	}

	// 맞추긴 했는데 로직이 지저분함... 다른사람꺼 풀이 참조하기
    public static String solution(String my_string, int m, int c) {		// 세로 읽기
        String answer = "";
        String[] temp = my_string.split("");
        int len = (temp.length%m) == 0 ? (temp.length)/m : (temp.length)/m + 1;
        
        System.out.println(len);
        
        if(m > 1) {
        	int cnt = 0;
        	System.out.println("=====================");
        	for(int i=0; i<temp.length; i++) {
        		if(i%m == 0) {
        			System.out.println();
        			cnt = 0;
        		} else {
        			cnt++;
        		}
        		
        		if(cnt == c-1) {
        			answer += temp[i];
        		}
        		System.out.println(i + " : " + temp[i] + " || " + cnt);
        	}
        	System.out.println("=====================");
        	
        } else {
        	answer += my_string;
        }
        
        return answer;
    }
}
