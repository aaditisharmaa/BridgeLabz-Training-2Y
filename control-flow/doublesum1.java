import java.util.Scanner;
public class doublesum1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        double total = 0.0;
        double a= sc.nextDouble();
        while(true){         
             if (a<=0){
                
            break;}
            total += a;
            System.out.println("enter next number");
            double b = sc.nextDouble();  

            a=b;
        
        }
         System.out.println("total :" +total); 


        
        sc.close();
    }
}