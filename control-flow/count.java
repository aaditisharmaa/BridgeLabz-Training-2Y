import java.util.Scanner;
public class count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the countdown values");
        int a= sc.nextInt();
        while(a>0){
             System.out.println("countdown "+a);
             a--; 

        } 
        sc.close();

    }
}