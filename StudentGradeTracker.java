import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];

        System.out.println("Enter 5 student grades:");
        for (int i = 0; i < 5; i++) {
            grades[i] = scanner.nextInt();
        }

        int highest = getHighestGrade(grades);
        int lowest = getLowestGrade(grades);
        double average = getAverageGrade(grades);

        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.printf("Average Grade: %.2f", average);

        scanner.close();
    }

    private static int getHighestGrade(int[] grades) {
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    private static int getLowestGrade(int[] grades) {
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    private static double getAverageGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}
