import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3]; 
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            marks[i][0] = getValidMarks(sc, "Physics");
            marks[i][1] = getValidMarks(sc, "Chemistry");
            marks[i][2] = getValidMarks(sc, "Maths");
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
            grade[i] = calculateGrade(percentage[i]);
        }
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-8s%n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-8s%n",
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        sc.close();
    }
    private static int getValidMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.print(subject + " marks (0-100): ");
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) break;
            System.out.println("Invalid! Marks must be between 0 and 100.");
        }
        return marks;
    }
    private static String calculateGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }
}
