package Programmers_HighScoreKit.Greedy;

import java.util.HashSet;

public class Programmers_Lev1_42862 {
    public static void main(String[] args) {        // 체육복 : Set 또는 배열로 풀기
        // 첫번째 케이스 : 5
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        // 두번째 케이스 : 4
        // int n = 5;
        // int[] lost = {2, 4};
        // int[] reserve = {3};

        // 세번째 케이스 : 2
        // int n = 3;
        // int[] lost = {3};
        // int[] reserve = {1};

        // 네번째케이스 : 3
        // int n = 4;
        // int[] lost = {2, 3};
        // int[] reserve = {3, 4};

        // 다섯번째케이스 : 5
        // int n = 5;
        // int[] lost = {4, 2};
        // int[] reserve = {3, 5};

        System.out.println(solution(n, lost, reserve));
    }

    // 1. Set 활용
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 1. Set 만들기
        HashSet<Integer> reserveSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();
        for(int i : reserve) {
            reserveSet.add(i);
        }
        for(int i : lost) {
            if(reserveSet.contains(i)) {        // 여분있는 사람이 체육복 잃어버렸을 때
                reserveSet.remove(i);
            } else {
                lostSet.add(i);
            }
        }

        // 2. 여분을 기준으로 앞뒤 확인 후 체육복 빌려줌
        for(int i : reserveSet) {
            if(lostSet.contains(i-1)) {
                lostSet.remove(i-1);
            } else if(lostSet.contains(i+1)) {
                lostSet.remove(i+1);
            }
        }

        // 3. 전체학생 수 - lostSet에 남은 학생 수 빼기
        answer = n - lostSet.size();

        return answer;
    }

    // 2. 배열 활용
    public static int solution2(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 1. 배열 생성 후 reserve, lost 정보 반영
        int[] stu = new int[n+2];

        for(int i : reserve) {
            stu[i]++;
        }
        for(int i : lost) {
            stu[i]--;
        }

        // 2. 여분을 기준으로 앞뒤 확인 후 체육복 빌려줌
        for(int i=1; i<=n; i++) {
            if(stu[i] == 1) {
                if(stu[i-1] == -1) {
                    stu[i-1]++;
                    stu[i]--;
                } else if (stu[i+1] == -1) {
                    stu[i+1]++;
                    stu[i]--;
                }
            }
        }

        // 3. 학생 수 계산
        for(int i=1; i<=n; i++) {
            if(stu[i] >= 0) {
                answer++;
            }
        }

        return answer;
    }

    // 정확성 : 83.3/100 - 다른 케이스(5,7,18,20,24) 왜 틀린지 모르겠음 -> 위에꺼 두개로 생각하자
    public static int solution3(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] stu = new boolean[n];
        boolean[] chk = new boolean[reserve.length];

        for(int i=0; i<stu.length; i++) {
            stu[i] = true;
        }
        for(int i=0; i<lost.length; i++) {
            stu[lost[i]-1] = false;
        }

        // 빌려주기
        for(int i=0; i<reserve.length; i++) {
            int idx = reserve[i]-1;
            System.out.println("idx : " + idx + " || " + stu[idx] + " : " + chk[i] + "\n");

            // 여벌 체육복을 가져온 학생이 체육복을 도난당함 : 못빌려줌
            if(!stu[idx] && !chk[i]) {
                stu[idx] = true;
                chk[i] = true;
                continue;
            }

            if(idx-1 >= 0) {
                if(!stu[idx-1] && !chk[i]) {
                    stu[idx-1] = true;
                    chk[i] = true;
                    continue;
                }
            }

            if(idx+1 < n) {
                if(!stu[idx+1] && !chk[i]) {
                    stu[idx+1] = true;
                    chk[i] = true;
                    continue;
                }
            }
        }

        // 확인
        for(int i=0; i<stu.length; i++) {
            System.out.print(stu[i] + " ");

            if(stu[i]) {
                answer++;
            }

            if(i == stu.length-1) {
                System.out.println();
            }
        }

        return answer;
    }
}
