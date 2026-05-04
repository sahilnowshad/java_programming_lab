import java.util.*;

class Student {
    String name;
    int rollNo;
    int[] marks;
    int total;
    double percentage;
    String grade;
    List<Integer> failedSubjects = new ArrayList<>();

    // Constructor
    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        calculateResult();
    }

    // Calculate total, percentage, grade, failures
    void calculateResult() {
        total = 0;
        failedSubjects.clear();

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
            if (marks[i] < 40) {
                failedSubjects.add(i + 1); // subject number
            }
        }

        percentage = (double) total / marks.length;

        // Assign grade
        if (percentage >= 80)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 50)
            grade = "C";
        else if (percentage >= 40)
            grade = "D";
        else
            grade = "F";
    }

    // Display student details
    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        if (failedSubjects.isEmpty()) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Failed Subjects: " + failedSubjects);
        }
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        Student[] students = new Student[n];

        // Input data
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            sc.nextLine(); // clear buffer
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            int[] marks = new int[subjects];

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            students[i] = new Student(name, roll, marks);
        }

        // Sort students by percentage (for ranking)
        Arrays.sort(students, (a, b) -> Double.compare(b.percentage, a.percentage));

        // Display results with rank
        System.out.println("\n===== STUDENT RESULTS =====");

        for (int i = 0; i < students.length; i++) {
            System.out.println("\nRank: " + (i + 1));
            students[i].display();
        }

        sc.close();
    }
}