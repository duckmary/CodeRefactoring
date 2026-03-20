public class App {

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();
        Printer printer = new Printer();

        Invoice invoice = new Invoice(1001, "Alan", 200.0, taxCalculator);

        invoice.printInvoiceDetails(printer);

        invoice.applyDiscount(10);
        invoice.printDiscountSummary(printer, 10);
    }
}
