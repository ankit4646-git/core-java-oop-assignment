public class AjEmployee {
    int empId;
    String empName;
    double salary;
    // Common organization identifier shared across all instances
    static String companyName;

    // Static block to initialize the shared company constant
    static {
        companyName = "Institute of Technology";
    }

    // Constructor to map local parameters to class fields
    public AjEmployee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Output method to print the formatted employee record
    public void displayEmployee() {
        StringBuilder output = new StringBuilder("----- Employee Details -----\n");
        output.append(String.format("ID: %d | Name: %s | Salary: %.2f | Company: %s",
                      empId, empName, salary, companyName));
 
        System.out.println(output.toString());
    }
}