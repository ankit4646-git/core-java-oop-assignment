public class AjProductBilling {
    // Basic billing for a single product entry
    public double calculateBill(double p1) {
        return (double) p1;
    }

    // Summing two product costs for a combined total
    public double calculateBill(double p1, double p2) {
        // Utilizing simple addition to merge two values
        double total = p1 + p2;
        return total;
    }

    // Aggregating three product price points
    public double calculateBill(double p1, double p2, double p3) {
        // Leverages previous logic by calling the 2-parameter version first
        return calculateBill(p1, p2) + p3;
    }

    // Applying percentage-based reductions to a final total
    public double calculateBill(double total, int discountPercentage) {
        // Calculates the reduction amount using a decimal multiplier
        double reduction = total * (discountPercentage / 100.0);
        return total - reduction;
    }
}
