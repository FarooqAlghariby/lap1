
// Write a program that prints the sum of the first ten positive integers, 1 + 2 + … + 10.
public class Exercise2 {
    public static void main(String[] args) {
        int i,sum=0;
        for( i=1;i<=10;i++)
            sum+=i;
        System.out.println(sum);
    }
}
