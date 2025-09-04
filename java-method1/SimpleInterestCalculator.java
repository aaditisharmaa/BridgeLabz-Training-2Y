import java.util.Scanner;

class SimpleInterestCalculator {
    public static double calculateSimpleInterest( double p , double r , double t){
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle , rate, time one bye one");
        double p = sc.nextDouble();
        double r = sc.nextDouble();        
        double t = sc.nextDouble();
        double SimpleInterest = calculateSimpleInterest(p ,r, t);

        System.out.println("The Simple Interest is "+ SimpleInterest + "for Principal " + p + ",Rate of Interest"+ r + "and Time " + t);
        sc.close();
    }

}