public class Invoice {
    private int invoiceNumber;
    private String customerName;
    private double totalAmount;
    private double taxAmount;

    public Invoice(int invoiceNumber, String customerName, double totalAmount) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.taxAmount = totalAmount * 0.15;
    }

    public void printInvoiceDetails() {
        System.out.println("Invoice Details:");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Amount with Tax: " + (totalAmount + taxAmount));
    }

    public double calculateTaxAmount() {
        return totalAmount * 0.15;
    }

    public double calculateTotalAmountWithTax() {
        return totalAmount + taxAmount;
    }

    public void updateCustomerName(String newName) {
        customerName = newName;
    }

    public void applyDiscount(double discountPercentage) {
        totalAmount = totalAmount - (totalAmount * discountPercentage / 100);
        taxAmount = totalAmount * 0.15;
    }

    public void printDiscountDetails() {
        System.out.println("Discount Applied: " + totalAmount);
        System.out.println("New Tax Amount: " + taxAmount);
        System.out.println("Amount After Discount: " + (totalAmount + taxAmount));
    }
}