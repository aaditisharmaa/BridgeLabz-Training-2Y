public class BankAccount {
    static String bankname ="State bank of india";
    final int accountnumber;
    String accountholdername;
    double  balance;
    static int totalaccount =0;
    
    BankAccount(String n , int a, double b){
        this.accountholdername=n;
        this.accountnumber=a;
        this.balance =b;
        totalaccount++;
    }
    static void gettotalaccount(){
        System.out.println("total account : "  + totalaccount);
    }
    void display(){
        if( this instanceof BankAccount){
            System.out.println("bank name :"+bankname+ "\n account holder :" +accountholdername+ "\n account number : "+accountnumber+ "\nbalance : "+balance);

        }
    }
    public static void main(String[]args){
        BankAccount b1 = new BankAccount("aditi",121 ,1000);
        BankAccount b2 = new BankAccount("seema",132 , 2000);
        b1.display();
        //Nb1.gettotalaccount();
        b2.display();
        b2.gettotalaccount();

    }






    
}
