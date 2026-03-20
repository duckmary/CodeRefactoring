public class Printer {

    public void printHeader(String title) {
        System.out.println("=== " + title + " ===");
    }

    public void printLine(String label, Object value) {
        System.out.println(label + ": " + value);
    }

    public void printSeparator() {
        System.out.println("------------------------------");
    }
}

