import java.util.Scanner;
public class SumNaturalNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the natural number");
        int a = sc.nextInt();
        if (a >0){
            System.out.println("the sum of " + a + "natural number is " + a * (a+1) / 2 );
        }
        else {
            System.out.println("The number "+ a + " is not a natural number");

        }
    sc.close();
    


    }
}