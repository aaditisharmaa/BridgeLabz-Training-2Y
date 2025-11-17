import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the value");
        long a = sc.nextInt();
        for(long i =1 ;i<=a ; i++){
            if(i%2==0){
                 System.out.println(i+" is even");
            }
            else{
                 System.out.println(i+" isodd");

            }
        }
        sc.close();
    }
}