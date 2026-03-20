public class Printer {

    public static void printInvoiceSummary(Invoice invoice) {
        printHeader();
        printCustomerDetails(invoice);
        printAmountDetails(invoice);
    }

    public static void printDiscountDetails(Invoice invoice) {
        System.out.println(String.format("New Subtotal After Discount: %.2f", invoice.getSubtotal()));
        System.out.println(String.format("New Tax Amount: %.2f", invoice.getTax()));
        System.out.println(String.format("Total After Discount: %.2f", invoice.getTotalAmountWithTax()));
    }

    private static void printHeader() {
        System.out.println("===== Invoice Summary =====");
    }

    private static void printCustomerDetails(Invoice invoice) {
        System.out.println(String.format("Invoice Number: %d", invoice.getInvoiceNumber()));
        System.out.println(String.format("Customer Name: %s", invoice.getCustomerName()));
    }

    private static void printAmountDetails(Invoice invoice) {
        System.out.println(String.format("Subtotal: %.2f", invoice.getSubtotal()));
        System.out.println(String.format("Tax: %.2f", invoice.getTax()));
        System.out.println(String.format("Total with Tax: %.2f", invoice.getTotalAmountWithTax()));
    }
}
