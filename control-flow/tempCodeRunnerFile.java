import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the value");
        int a = sc.nextInt();
        int b =1;
        while(a>0){
            b=b*a;
            a--;

        }
         System.out.println("factorial : "+b);
         sc.close();
    }
}