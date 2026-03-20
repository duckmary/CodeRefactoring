public class Invoice {

    private int invoiceNumber;
    private String customerName;
    private double subtotal;
    private double tax;

    private static final double TAX_RATE = 0.15;

    public Invoice(int invoiceNumber, String customerName, double subtotal) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.subtotal = subtotal;
        recalculateTax();
    }

    // -----------------------------
    // Getters
    // -----------------------------
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTax() {
        return tax;
    }

    public double getTotalAmountWithTax() {
        return subtotal + tax;
    }

    // -----------------------------
    // Updates
    // -----------------------------
    public void updateCustomerName(String newName) {
        this.customerName = newName;
    }

    public void applyDiscountAndUpdateTax(double discountPercentage) {
        subtotal -= subtotal * (discountPercentage / 100);
        recalculateTax();
    }

    // -----------------------------
    // Internal logic
    // -----------------------------
    private void recalculateTax() {
        this.tax = TaxCalculator.calculateTax(subtotal, TAX_RATE);
    }
}
