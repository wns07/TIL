package Programmers_HighScoreKit.Hash;

import java.util.HashMap;

public class Programmers_Lev1_42576 {
    public static void main(String[] args) {
        // String[] participant = {"leo", "kiki", "eden"};
        // String[] completion = {"eden", "kiki"};             // leo

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};             // vinko
        
        // String[] participant = {"mislav", "stanko", "mislav", "ana"};
        // String[] completion = {"stanko", "ana", "mislav"};             // mislav

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {     // 완주하지 못한 선수
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        // 입력받기1
        // for(int i=0; i<participant.length; i++) {
        //     map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        // }

        // 입력받기2
        for(String key : participant) {
            map.put(key, map.getOrDefault(key, 0) + 1 );
        }

        System.out.println(map);

        for(String key : completion) {
            map.replace(key, map.get(key)-1);
        }

        System.out.println(map);

        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer += key;
            }
        }

        return answer;
    }
}
