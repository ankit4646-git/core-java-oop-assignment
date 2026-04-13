public class AjCollegeStudent extends AjStudent {
    private String campus; // Renamed variable

    public AjCollegeStudent(int ajid, String ajname, int[] ajscores, String campus) {
        // Passing arguments to parent constructor
        super(ajid, ajname, ajscores);
        this.campus = campus;
    }

    public void displayStudentInfo() {
        // Using a formatted approach for a cleaner look
        super.displayStudentInfo();
        System.out.printf("College: %s%n", this.campus);
    }
}
