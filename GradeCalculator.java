import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.println("Enter marks obtained in Subject 1 (out of 100): ");
        int subject1Marks = scanner.nextInt();

        System.out.println("Enter marks obtained in Subject 2 (out of 100): ");
        int subject2Marks = scanner.nextInt();

        // Calculate Total Marks
        int totalMarks = subject1Marks + subject2Marks;

        // Calculate Average Percentage
        int totalSubjects = 2; // Assuming two subjects for this example
        double averagePercentage = (double) totalMarks / totalSubjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
