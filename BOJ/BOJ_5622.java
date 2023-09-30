package BOJ;
import java.util.Scanner;

public class BOJ_5622 {
    public static void main(String[] args) {        // 문자열 > 다이얼
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int time = 0;

        String[] temp = s.split("");
        for(int i=0; i<temp.length; i++) {
            String a = temp[i];

            if(a.equals("A") || a.equals("B") || a.equals("C") ) {
                time += 3;
            } else if(a.equals("D") || a.equals("E") || a.equals("F") ) {
                time += 4;
            } else if(a.equals("G") || a.equals("H") || a.equals("I") ) {
                time += 5;
            } else if(a.equals("J") || a.equals("K") || a.equals("L") ) {
                time += 6;
            } else if(a.equals("M") || a.equals("N") || a.equals("O") ) {
                time += 7;
            } else if(a.equals("P") || a.equals("Q") || a.equals("R") || a.equals("S")) {
                time += 8;
            } else if(a.equals("T") || a.equals("U") || a.equals("V") ) {
                time += 9;
            } else if(a.equals("W") || a.equals("X") || a.equals("Y") || a.equals("Z")) {
                time += 10;
            }
        }

        System.out.println(time);
    }
}
