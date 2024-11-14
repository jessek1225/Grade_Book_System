package gradebook;

public class Course {
    private String courseName;
    private Student[] students;
    private int studentCount;
    private static final int MAX_STUDENTS = 30;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount >= MAX_STUDENTS) {
            throw new IllegalArgumentException("Class is full");
        }
        students[studentCount] = student;
        studentCount++;
    }

    public void addGrade(String studentId, double grade) {
        Student student = findStudent(studentId);
        if (student != null) {
            student.addGrade(grade);
        } else {
            throw new IllegalArgumentException("Student not found");
        }
    }

    private Student findStudent(String studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId().equals(studentId)) {
                return students[i];
            }
        }
        return null;
    }

    public double getClassAverage() {
        if (studentCount == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < studentCount; i++) {
            sum += students[i].getAverage();
        }
        return sum / studentCount;
    }

    public void printGradeReport() {
        System.out.println("\nGrade Report for " + courseName);
        System.out.println("Class Average: " + String.format("%.2f", getClassAverage()));
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < studentCount; i++) {
            students[i].printGrades();
            System.out.println("Average: " + String.format("%.2f", students[i].getAverage()));
            System.out.println();
        }
    }
}