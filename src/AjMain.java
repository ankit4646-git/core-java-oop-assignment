import java.util.Scanner;

public class AjMain {
    public static void main(String[] args) {
        // Initialize the scanner for console input capture
        Scanner sc = new Scanner(System.in);

        // Printing a double-lined header for a more official system look
        System.out.println("====================================================");
        System.out.println("      ACADEMIC & PRODUCT MANAGEMENT SYSTEM          ");
        System.out.println("====================================================");

        // Section 1: Core Student Enrollment
        System.out.println("\n[SECTION 1: STUDENT DATA ACQUISITION]");
        System.out.print("Input Roll Identifier: ");
        int roll = sc.nextInt();
        sc.nextLine(); // Flush buffer
 
        System.out.print("Input Full Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("--- Subject Grading Input ---");
        int count = 0;
        while (count < 5) {
            System.out.printf("Marks for Paper %d: ", (count + 1));
            marks[count] = sc.nextInt();
            count++;
        }

        // Object instantiation and profile generation
        AjStudent s1 = new AjStudent(roll, name, marks);
        s1.displayStudentInfo();
        s1.displayMarks();
        System.out.printf("Computed Academic Average: %.2f%n", s1.calculateAverage());

        // Section 2: Inheritance & Institutional Details
        System.out.println("\n[SECTION 2: HIGHER EDUCATION MODULE]");
        sc.nextLine();
        System.out.print("Current Campus/College Name: ");
        String clg = sc.nextLine();

        // Demonstrating polymorphic behavior through a specialized object
        AjCollegeStudent cs1 = new AjCollegeStudent(roll + 1, name + " (Junior)", marks, clg);
        cs1.displayStudentInfo();

        // Section 3: Professional/Employee Records
        System.out.println("\n[SECTION 3: WORKFORCE MANAGEMENT]");
        System.out.print("Staff ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Legal Name: ");
        String empName = sc.nextLine();
        System.out.print("Monthly Remuneration: ");
        double salary = sc.nextDouble();

        AjEmployee e1 = new AjEmployee(empId, empName, salary);
        e1.displayEmployee();

        // Section 4: Inventory & Financial Transactions
        System.out.println("\n[SECTION 4: POINT OF SALE - ITEM ENTRY]");
        sc.nextLine();

        // Processing three distinct product entries
        System.out.print("Item A Label: ");
        String p1Name = sc.nextLine();
        System.out.print("Price Unit: ");
        double p1Price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Item B Label: ");
        String p2Name = sc.nextLine();
        System.out.print("Price Unit: ");
        double p2Price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Item C Label: ");
        String p3Name = sc.nextLine();
        System.out.print("Price Unit: ");
        double p3Price = sc.nextDouble();

        // Map data to encapsulated Product objects
        AjProduct prod1 = new AjProduct(1, p1Name, p1Price);
        AjProduct prod2 = new AjProduct(2, p2Name, p2Price);
        AjProduct prod3 = new AjProduct(3, p3Name, p3Price);

        // Execute billing logic via overloaded calculator
        AjProductBilling billing = new AjProductBilling();
        double total = billing.calculateBill(prod1.getPrice(), prod2.getPrice(), prod3.getPrice());

        // Display final financial audit
        System.out.println("\n**************** FINAL RECEIPT ****************");
        System.out.println("Subtotal (3 Items): " + String.format("%.2f", total));

        // Applying promotional logic
        double discountedPrice = billing.calculateBill(total, 10);
        System.out.println("Adjusted Net (10% Discount): " + discountedPrice);
        System.out.println("***********************************************");

        // System Meta-data
        System.out.println("\n[SYSTEM LOG]: Live instances of Student records: " + AjStudent.ajStudentCount);

        sc.close();
        System.out.println("\nProcess completed. Connection closed.");
    }
}