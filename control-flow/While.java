import java.util.Scanner;
public class While{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int d =( a*(a+1)/2);
         System.out.println("result from formula: "+d);
        int sum = 0;
        while(a>0){
            sum += a;
            a--;

        }
         System.out.println("result from while loop: "+sum);
        
        if(sum == d){
             System.out.println("the results from both method is same");

        }
        else{
             System.out.println("the result is not same");
        }
        sc.close();
    }
}