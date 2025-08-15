class ProfitCalculation {
    public static void main(String[] args) {

        // Fixed values
        double costPrice = 129;
        double sellingPrice = 191;

        // Computations
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Output (single print, multiline)
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
