import java.util.Arrays;

public class AjStudent {
    int ajRollNo;
    String ajName;
    int[] ajMarks;
    static int ajStudentCount = 0;

    // Constructor
    public AjStudent(int rollNo, String name, int[] marks) {
        ajRollNo = rollNo;
        ajName = name;
        ajMarks = marks;
        ajStudentCount++;
    }

    public void displayStudentInfo() {
        // Using a single formatted string block instead of multiple printlns
        String info = String.format("----- Student Details -----\n" +
                                    "Roll No: %d\n" +
                                    "Original Name: %s\n" +
                                    "Uppercase: %s\n" +
                                    "Lowercase: %s\n" +
                                    "Name Length: %d",
                                    ajRollNo, ajName, ajName.toUpperCase(),
                                    ajName.toLowerCase(), ajName.length());
        System.out.println(info);
    }

    public void displayMarks() {
        System.out.print("Marks: ");
        // Using a traditional for loop instead of enhanced for loop
        for (int i = 0; i < ajMarks.length; i++) {
            System.out.print(ajMarks[i] + " ");
        }
        System.out.println();
    }

    public double calculateAverage() {
        // Using Java Streams for a modern, functional approach to the same math
        return Arrays.stream(ajMarks).average().orElse(0.0);
    }
}
