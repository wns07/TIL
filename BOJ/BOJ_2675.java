package BOJ;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2675 {     // 문자열 > 문자열 반복
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<t; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            String[] temp = s.split("");
            String result = "";

            for(int j=0; j<temp.length; j++) {
                for(int k=0; k<r; k++) {
                    result += temp[j];
                }
            }

            list.add(result);
        }
        sc.close();
        
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
