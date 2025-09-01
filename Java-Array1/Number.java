import java.util.Scanner;

public class Number{
    public static void main(String[]args){
        Scanner dn = new Scanner(System.in);
        int[] num = new int[5];// array bnaya h
        System.out.println("enter 5 numbers");
        for (int i=0 ; i <5 ; i++)
        {
            num[i]= dn.nextInt();


        }
        for (int i=0 ; i< num.length; i++){
            if(num[i]>0){
                if (num[i]%2==0){
                    System.out.println(num[i] + "is positive and even");
                }
                else{
                    System.out.println(num[i] + "is positive and odd");
                }
                    
            }
            else if(num[i]<0){
                System.out.println(num[i] + "is negative ");
            }
            else {
                System.out.println(num[i] + "is zero");
            }
        }

        // }
        dn.close();
    }
}
