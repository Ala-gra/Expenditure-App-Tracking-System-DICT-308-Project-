Module: Invoice & Receipt Handling
This command-line interface (CLI) Java program enables users to:

 Generate an invoice for a client with amount and item details

 Print a payment receipt after accepting payment

 Handle invalid input gracefully with helpful prompts

 Display recommended input formats to reduce user error


Features
 Robust input validation (e.g., numeric checks)

 Clear example prompts to guide user input

 Graceful exception handling for unexpected issues

 Simple, menu-driven interface for quick access

Usage
 Compile
javac InvoiceReceiptHandler.java

Run
java InvoiceReceiptHandler

 Invoice & Receipt Handler 
1. Generate Invoice
2. Print Receipt
3. Exit
Enter your choice (1-3): 1

Generating Invoice 
Enter client name (e.g., John Doe): Alice Brown
Enter item description (e.g., Website Design): Logo Creation
Enter amount (e.g., 250.50): 300.00

 INVOICE 
Client     : Alice Brown
Item       : Logo Creation
Amount     : $300.00
Status     : UNPAID

Notes
Input formats are suggested next to prompts (e.g., 250.00) to improve usability.

Decimal formatting is applied to amounts ($xx.xx) for cleaner output.

If invalid data is entered (e.g., letters instead of numbers), users are asked to try again without crashing the program.


 Future Enhancements (Optional Ideas)
Save invoices and receipts to a file

Assign invoice/receipt numbers

Add a payment status tracker

Export data to CSV