package gradebook;

public class Student {
    private String id;
    private String name;
    private double[] grades;
    private int gradeCount;
    private static final int MAX_GRADES = 10;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new double[MAX_GRADES];
        this.gradeCount = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        if (gradeCount >= MAX_GRADES) {
            throw new IllegalArgumentException("Cannot add more grades");
        }
        grades[gradeCount] = grade;
        gradeCount++;
    }

    public double getAverage() {
        if (gradeCount == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return sum / gradeCount;
    }

    public void printGrades() {
        System.out.print(name + "'s grades: ");
        for (int i = 0; i < gradeCount; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }
}