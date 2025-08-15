import java.util.Scanner;

class MaxHandshakes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Computation
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes is " + maxHandshakes);

        input.close();
    }
}
