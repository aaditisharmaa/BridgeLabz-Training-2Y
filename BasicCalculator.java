import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Take user inputs
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform operations
        double additionResult = number1 + number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult = number1 / number2;

        // Display results
        System.out.println("The addition, subtraction, multiplication, and division value of two numbers " 
            + number1 + " and " + number2 + " is " 
            + additionResult + ", " + subtractionResult + ", " 
            + multiplicationResult + ", " + divisionResult);
        
        input.close();
    }
}
