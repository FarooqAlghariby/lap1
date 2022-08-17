
// Write a program that prints the product of the first ten positive integers,
// 1 × 2 × … × 10. (Use * to indicate multiplication in Java.)

public class Exercise3 {
    public static void main(String[] args) {
        int i;
        long   sum=1;
        for( i=1;i<=10;i++)
            sum*=i;
        System.out.println(sum);

    }
}
