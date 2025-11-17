import java.util.Scanner;
public class count2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the countdown values");
        int a= sc.nextInt();
        for(int i=a; i>0;i--){
             System.out.println("countdown: "+i); 
        }
        sc.close();
    }
}