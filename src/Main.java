public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice(101, "Alan García", 200.0);

        Printer.printInvoiceSummary(invoice);

        invoice.applyDiscountAndUpdateTax(10);

        System.out.println("\n--- After Discount ---");
        Printer.printDiscountDetails(invoice);
    }
}
