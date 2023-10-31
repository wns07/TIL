package Programmers_Lev0;

public class Programmers_120924 {
    public static void main(String[] args) {
        // int[] common = {1, 2, 3, 4};
        // int[] common = {2, 4, 8};
        int[] common = {3, 9, 27};
        
        System.out.println(solution(common));
    }

    public static int solution(int[] common) {      // 다음에 올 숫자
        int answer = 0;
        int d1 = common[1] - common[0];
        int d2 = common[2] - common[1];

        System.out.println(d1 + " : " + d2);

        if(d1 == d2) {      // 등차수열
            answer = common[common.length-1] + d1;
        } else {            // 등비수열
            answer = common[common.length-1] * (d2/d1);
        }

        return answer;
    }
}
