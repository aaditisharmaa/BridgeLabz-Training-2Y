class PenDistribution {
    public static void main(String[] args) {

        // Fixed values
        int totalPens = 14;
        int totalStudents = 3;

        // Computations
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
