class DiscountedFeeFixed {
    public static void main(String[] args) {

        // Fixed values
        double fee = 125000;
        double discountPercent = 10;

        // Computations
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        // Output
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);
    }
}

