import java.util.Scanner;
public class Factorial1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the value");
        long a = sc.nextInt();
        long b =1;
        for(long i=a ; i>0 ;i--){
            b=b*i;
            

        }
         System.out.println("factorial : "+b);
         sc.close();
    }
}