import java.util.Scanner;
public class Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b&&a>c){
            System.out.println("Is the first number the largest? yes");

        }
        else if (b>a&&b>c){
            System.out.println("Is the second number the largest? yes");

        }
        else {
            System.out.println("Is the third number the largest? yes");

        }
        sc.close();



    }
}