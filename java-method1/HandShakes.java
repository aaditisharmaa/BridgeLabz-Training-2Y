import java.util.Scanner;
public class HandShakes{
    public static int NoOfHandshake(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int TotalHandshake = NoOfHandshake( n );
        System.out.println( TotalHandshake + "are  possible handshakes");
        sc.close();
    }
}