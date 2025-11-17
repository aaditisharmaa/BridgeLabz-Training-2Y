import java.util.Scanner;
public class num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        if(a>0){
             System.out.println("positive");
            
        }
        else if(a<0){
             System.out.println("negative");
        }
        else {
             System.out.println("zero");


        }
        sc.close();
    }
}