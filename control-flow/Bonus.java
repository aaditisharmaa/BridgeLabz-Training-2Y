import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the salary");
        double s = sc.nextInt();
         System.out.println("enter the year");
        int y = sc.nextInt();
        if(y>5){
            s = s*5/100;

        }
         System.out.println("bonus: "+s);

      
        sc.close();
    }
}