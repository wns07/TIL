package BOJ;
import java.util.Scanner;

public class BOJ_1157 {
    public static void main(String[] args) {        // 심화1 > 단어 공부
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int[] arr = new int[26];
        char[] c = s.toUpperCase().toCharArray();

        for(int i=0; i<c.length; i++) {
            int n = c[i] - 'A';
            arr[n] += 1;
        }

        // for(int i=0; i<arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        int max = 0;
        int cnt = 0;
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                cnt = 0;
                max = arr[i];
                idx = i;
            } else if(arr[i] == max) {
                cnt += 1;
            }
        }

        if(cnt > 0) {
            System.out.println("?");
        } else {
            char ch = (char)(idx + 'A');
            System.out.println(ch);
        }
    }
}
