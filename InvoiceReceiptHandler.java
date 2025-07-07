import java.util.Scanner;

public class InvoiceReceiptHandler {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;

        do {
            showMenu();
            System.out.print("Enter your choice (1-3): ");

            try {
                choice = Integer.parseInt(scanner.nextLine().trim());

                switch (choice) {
                    case 1:
                        generateInvoice();
                        break;
                    case 2:
                        printReceipt();
                        break;
                    case 3:
                        System.out.println("Exiting Invoice & Receipt Handler.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value (1, 2, or 3).");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }

        } while (choice != 3);
    }

    public static void showMenu() {
        System.out.println("\n=== Invoice & Receipt Handler ===");
        System.out.println("1. Generate Invoice");
        System.out.println("2. Print Receipt");
        System.out.println("3. Exit");
    }

    public static void generateInvoice() {
        try {
            System.out.println("\n--- Generating Invoice ---");

            System.out.print("Enter client name (e.g., John Doe): ");
            String clientName = scanner.nextLine();

            System.out.print("Enter item description (e.g., Laptop Repair): ");
            String description = scanner.nextLine();

            System.out.print("Enter amount (e.g., 150.75): ");
            double amount = Double.parseDouble(scanner.nextLine().trim());

            System.out.println("\n--- INVOICE ---");
            System.out.println("Client     : " + clientName);
            System.out.println("Item       : " + description);
            System.out.printf("Amount     : $%.2f%n", amount);
            System.out.println("Status     : UNPAID");

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a valid number (e.g., 199.99).");
        } catch (Exception e) {
            System.out.println("Error generating invoice: " + e.getMessage());
        }
    }

    public static void printReceipt() {
        try {
            System.out.println("\n--- Printing Receipt ---");

            System.out.print("Enter client name (e.g., Jane Smith): ");
            String clientName = scanner.nextLine();

            System.out.print("Enter amount paid (e.g., 200.00): ");
            double amountPaid = Double.parseDouble(scanner.nextLine().trim());

            System.out.println("\n--- RECEIPT ---");
            System.out.println("Client       : " + clientName);
            System.out.printf("Amount Paid  : $%.2f%n", amountPaid);
            System.out.println("Status       : PAID");

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a valid number (e.g., 120.00).");
        } catch (Exception e) {
            System.out.println("Error printing receipt: " + e.getMessage());
        }
    }
}
