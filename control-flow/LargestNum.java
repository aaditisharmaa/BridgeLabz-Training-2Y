import java.util.Scanner;
public class LargestNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        System.out.println("enter number 3");
        int c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("Is the first number the largest? yes\n " +
            " Is the second number the largest? no\n" +
            "Is the third number the largest? no ");

        }
        else if (b > a && b > c) {
            System.out.println("Is the first number the largest? no\n" +
            "Is the second number the largest? yes\n" +
            "Is the third number the largest? no");
        }
        else {
            System.out.println("Is the first number the largest? no\n" +
            "Is the second number the largest? no\n" +
            "Is the third number the largest? yes");        

        }
    
        sc.close();
    }
}

   