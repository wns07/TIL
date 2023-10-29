package Template;

public class MaxValue {
    public static void main(String[] args) {
        // 1. int(정수형) : 4byte(32bit)
        System.out.println(Integer.MAX_VALUE);      //  2,147,483,647 =  2^31-1
        System.out.println(Integer.MIN_VALUE);      // -2,147,483,648 = -2^31

        // 2. long(정수형) : 8byte
        System.out.println(Long.MAX_VALUE);     //  9,223,372,036,854,775,807
        System.out.println(Long.MIN_VALUE);     // -9,223,372,036,854,775,808
    }
}
