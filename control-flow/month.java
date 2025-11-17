import java.util.Scanner;
public class month{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the date (only date not month)");
         int d = sc.nextInt();
         System.out.println("enter the  month");
         int m= sc.nextInt();
         if((d>19&&d<32)&&(m>2&&m<7)){
             System.out.println("Its a Spring Season");
         }
         else{
             System.out.println("Its not a Spring Season");
         }
         sc.close();
    }
}