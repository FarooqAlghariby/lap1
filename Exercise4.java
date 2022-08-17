//Write a program that prints the balance of an account after the first, second, and third year.
      //  The account has an initial balance of $1,000 and earns 5 percent interest per year.
public class Exercise4 {
    public static void main(String[] args) {
        int x1=0,x2=0,x3=0;
        System.out.println("the balance after the first year is :\n");
        x1=1000+(50/1000*1000);
        System.out.println(x1);
        System.out.println("the balance after the second year is :\n");
        x2=x1+(50/x1*1000);
        System.out.println(x2);
        System.out.println("the balance after the third year is :\n");
        x3=x2+((50/x2)*1000);
        System.out.println(x3);



    }
}
