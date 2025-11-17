import java.util.Scanner;
public class natural{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int a= sc.nextInt();
    if (a>0){
    int sum = a*(a+1)/2;
    System.out.println("The sum of " +a+ " natural numbers is " +sum);
    }else {
    System.out.println("The numbers is not a natural number " );

    }
    sc.close();





}
}