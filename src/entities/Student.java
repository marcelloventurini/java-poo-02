package entities;

public class Student {
    public String name;
    public Double firstGrade;
    public Double secondGrade;
    public Double thirdGrade;

    public double calculateFinalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public void showFinalResult() {
        if (calculateFinalGrade() >= 60.0) {
            System.out.println("Final grade: " + calculateFinalGrade());
            System.out.println("Approved!");
        } else {
            System.out.println("Final grade: " + calculateFinalGrade());
            System.out.println("Failed.");
            System.out.println("Missing " + (60.0 - calculateFinalGrade()) + " points.");
        }
    }
}
