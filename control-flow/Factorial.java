import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the value");
        long a = sc.nextInt();
        long b =1;
        while(a>0){
            b=b*a;
            a--;

        }
         System.out.println("factorial : "+b);
         sc.close();
    }
}