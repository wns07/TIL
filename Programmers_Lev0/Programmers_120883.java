package Programmers_Lev0;

public class Programmers_120883 {
    public static void main(String[] args) {
        // String[] id_pw = {"meosseugi", "1234"};
        // String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        // String[] id_pw = {"programmer01", "15789"};
        // String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        String[] id_pw = {"rabbit04", "98761"};
        String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};

        System.out.println(solution(id_pw, db));
    }

    public static String solution(String[] id_pw, String[][] db) {      // 로그인 성공?
        String answer = "";

        for(int i=0; i<db.length; i++) {
            if( id_pw[0].equals(db[i][0]) ) {
                if(id_pw[1].equals(db[i][1])) {
                    answer += "login";
                    break;
                } else {
                    answer += "wrong pw";
                    break;
                }
            }
        }

        if(answer.length() == 0) {
            answer += "fail";
        }
        
        return answer;
    }
}
