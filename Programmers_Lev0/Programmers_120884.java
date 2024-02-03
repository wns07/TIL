package Programmers_Lev0;

public class Programmers_120884 {
    public static void main(String[] args) {        // 치킨쿠폰
                                                    // 서비스치킨과 남은쿠폰 분리해서 생각하지 말자... 다른사람이 한 것 보기(내껀 좋은방법 아님)
        // int chicken = 100;      // 11
        // int chicken = 1081;      // 120
        int chicken = 1999;      // 222
        
        System.out.println(solution(chicken));
    }

    // 치킨     쿠폰        서비스치킨      남은쿠폰
    // 1081    1081         108         1
    // 108     108          10          8
    // 10      10           1
    // 1       1
    // 108 + 10 + 1 + 1(1+8+1) = 120


    // 치킨     쿠폰        서비스치킨      남은쿠폰
    // 1999    1999       199          9
    // 199     199        19           9
    // 19      19         1            9
    // 1       1
    // 199 + 19 + 1 + 2(9+9+9)    
    public static int solution(int chicken) {       // 최대 서비스 치킨의 수
        int answer = -1;

        // 1. 치킨으로 서비스치킨 수 구하기
        int share = 0;      // 몫 : 서비스치킨
        int remainder = 0;  // 나머지 : 쿠폰

        while(chicken >= 10) {
            share += (chicken / 10);
            remainder += (chicken % 10);

            chicken /= 10;

            System.out.println(chicken + " // " + share + " : " + remainder);
        }

        remainder += chicken;
        System.out.println("1. 서비스치킨 : " + share + ", 남은쿠폰 : " + remainder);

        // 2. 쿠폰으로 서비스치킨 수 구하기
        int chicken1 = remainder;
        int share1 = 0;
        int remainder1 = 0;

        while(chicken1 >= 10) {
            share1 += (chicken1 / 10);
            remainder1 += (chicken1 % 10);

            chicken1 /= 10;
        }

        if(share1 + remainder1 >= 10) {
            share += 1;
        }

        System.out.println("2. 서비스치킨 : " + share + ", 남은쿠폰 : " + remainder);
        System.out.println("3. 서비스치킨 : " + share1 + ", 남은쿠폰 : " + remainder1);

        answer = (share + share1);

        return answer;
    }
}
