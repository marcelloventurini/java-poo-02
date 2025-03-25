import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = scanner.nextLine();

        System.out.print("First grade: ");
        student.firstGrade = scanner.nextDouble();

        System.out.print("Second grade: ");
        student.secondGrade = scanner.nextDouble();

        System.out.print("Third grade: ");
        student.thirdGrade = scanner.nextDouble();

        student.calculateFinalGrade();
        student.showFinalResult();

        scanner.close();
    }
}
