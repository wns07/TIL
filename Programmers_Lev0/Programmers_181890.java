package Programmers_Lev0;

public class Programmers_181890 {
    public static void main(String[] args) {
        String[] str_list = {"u", "u", "l", "r"};
        // String[] str_list = {"l"};
        // String[] str_list = {"r", "u", "l", "r"};
        // String[] str_list = {"u", "u", "r", "l", "a"};
        
        System.out.println(solution(str_list));
    }

    public static String[] solution(String[] str_list) {        // 왼쪽 오른쪽
        String[] answer = {};
        int idx = -1;
        String direction = "";

        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l") || str_list[i].equals("r")) {
                if(str_list[i].equals("l")) {
                    idx = i;
                    direction = "left";
                    break;
                } else if(str_list[i].equals("r")) {
                    idx = i;
                    direction = "right";
                    break;
                }
            }
        }

        System.out.println(idx + " : " + direction);

        if(direction.equals("left")) {
            answer = new String[idx];

            for(int k=0; k<idx; k++) {
                answer[k] = str_list[k];
            }
        } else if(direction.equals("right")) {
            int temp_idx = 0;
            answer = new String[str_list.length-idx-1];

            for(int k=idx+1; k<str_list.length; k++) {
                // System.out.println(k + " : " + str_list[k]);
                answer[temp_idx++] = str_list[k];
            }

        }

        for(int i=0; i<answer.length; i++) {
            System.out.println(i + " : " + answer[i]);
        }

        return answer;
    }
}
