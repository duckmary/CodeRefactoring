public class Invoice {

    private int invoiceNumber;
    private String customerName;
    private double subtotal;

    private TaxCalculator taxCalculator;

    public Invoice(int invoiceNumber, String customerName, double subtotal, TaxCalculator taxCalculator) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.subtotal = subtotal;
        this.taxCalculator = taxCalculator;
    }

    // --- Cálculos ---
    public double getTax() {
        return taxCalculator.calculateTax(subtotal);
    }

    public double getTotalWithTax() {
        return subtotal + getTax();
    }

    // --- Actualizaciones ---
    public void updateCustomerName(String newName) {
        this.customerName = newName;
    }

    public void applyDiscount(double discountPercentage) {
        double discountAmount = subtotal * (discountPercentage / 100);
        subtotal -= discountAmount;
    }

    // --- Presentación ---
    public void printInvoiceDetails(Printer printer) {
        printer.printHeader("Invoice Details");
        printer.printLine("Invoice Number", invoiceNumber);
        printer.printLine("Customer Name", customerName);
        printer.printLine("Subtotal", subtotal);
        printer.printLine("Tax", getTax());
        printer.printLine("Total with Tax", getTotalWithTax());
        printer.printSeparator();
    }

    public void printDiscountSummary(Printer printer, double discountPercentage) {
        printer.printHeader("Discount Summary");
        printer.printLine("Discount Applied (%)", discountPercentage);
        printer.printLine("New Subtotal", subtotal);
        printer.printLine("New Tax", getTax());
        printer.printLine("Total After Discount", getTotalWithTax());
        printer.printSeparator();
    }
}
