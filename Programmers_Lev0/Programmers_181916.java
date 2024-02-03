package Programmers_Lev0;
import java.util.Arrays;

public class Programmers_181916 {
    public static void main(String[] args) {
        // int a = 2;          // 2222
        // int b = 2;
        // int c = 2;
        // int d = 2;

        // int a = 4;      // 1681
        // int b = 1;
        // int c = 4;
        // int d = 4;

        // int a = 6;      // 27
        // int b = 3;
        // int c = 3;
        // int d = 6;

        // int a = 2;      // 30
        // int b = 5;
        // int c = 2;
        // int d = 6;

        int a = 6;      // 2
        int b = 4;
        int c = 2;
        int d = 5;

        System.out.println(solution(a, b, c, d));
    }

    public static int solution(int a, int b, int c, int d) {       // 주사위 게임 3
        int answer = 0;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        int a1 = arr[0];
        int b1 = arr[1];
        int c1 = arr[2];
        int d1 = arr[3];

        // System.out.println(a1 + " : " + b1 + " : " + c1 + " : " + d1);

        if((a1 == b1) && (a1 == c1) == (a1 == d1) && (b1 == c1) && (b1 == d1) && (c1 == d1)) {        // 다 같음
            answer = 1111 * a1;
        } else if ((a1 != b1) && (b1 == c1) && (b1 == d1) && (c1 == d1)) {      // 1개 다름(맨앞)
            answer = (int)Math.pow(( 10*b1 + a1 ), 2);
        } else if ((c1!=d1) && ((a1 == b1) && (a1 == c1) && (b1 == c1))) {      // 1개 다름(맨뒤)
            answer = (int)Math.pow((10*a1+d1), 2);
        } else if ((a1 == b1) && (c1 == d1) && ( a1 != c1)) {        // 2개 다름 ( 2개 같음 )
            answer = (a1+c1) * Math.abs(a1-c1);
        } else if ((a1 == c1) && (b1 == d1) && (a1 != b1)) {         // 2개 다름 ( 2개 같음 )
            answer = (a1+b1) * Math.abs(a1-b1);
        } else if ((a1 != b1) && (b1 != c1) && (c1 != d1) && (a1 != d1)) {     // 4개 다름
            answer = a1;
        } else if ((a1 == b1) && (b1 != c1) && (c1 != d1)) {
            answer = c1 * d1;
        } else if ((b1 == c1) && (a1 != b1) && (a1 != d1)) {
            answer = a1 * d1;
        } else if ((c1 == d1) && (a1 != b1) && (a1 != c1)) {
            answer = a1 * b1;
        }

        return answer;
    }
}
