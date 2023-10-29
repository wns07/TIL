package Programmers_Lev0;
import java.util.Arrays;

public class Programmers_181881 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};     // 5

        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {            // 조건에 맞게 수열 변환하기 2
        int answer = 0;
        int[] temp = new int[arr.length];

        
        while(!Arrays.equals(arr, temp)) {
            answer++;
            temp = Arrays.copyOf(arr, arr.length);
            
            for(int i=0; i<arr.length; i++) {
                if((arr[i]>50) && (arr[i]%2==0)) {
                    arr[i] /= 2;
                } else if( (arr[i] < 50) && (arr[i]%2 == 1) ) {
                    arr[i] = arr[i]*2 + 1;
                }
            }
            System.out.println(answer + " ");
            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(temp[i] + " ");
        // }
        System.out.println();

        answer -= 1;

        return answer;
    }
}
