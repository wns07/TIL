package Programmers_HighScoreKit.Hash;

import java.util.HashSet;

public class Programmers_Lev1_1845 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};              // 2
        // int[] nums = {3, 3, 3, 2, 2, 4};     // 3
        // int[] nums = {3, 3, 3, 2, 2, 2};     // 2

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {        // 포켓몬 : 가질 수 있는 포켓몬 종류수
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        int size = set.size();      // 중복제거한 포켓몬 종류
        int len = nums.length / 2;  // 포켓몬 뽑는 수

        answer = (size>=len) ? len : size;
        
        return answer;
    }
}
