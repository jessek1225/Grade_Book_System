import gradebook.Course;
import gradebook.Student;


public class Main {
    public static void main(String[] args) {
        try {
            // Create a course
            Course mathClass = new Course("Math 101");

            // Create some students
            Student student1 = new Student("1", "Goku");
            Student student2 = new Student("2", "Naruto");
            Student student3 = new Student("3", "Ichigo");
            Student student4 = new Student("4", "Sukuna");  // Fixed ID to be unique
            Student student5 = new Student("5", "Gojo");    // Fixed spelling
            Student student6 = new Student("6", "Thorfinn"); // Fixed spelling
            Student student7 = new Student("7", "Levi");    // Fixed variable name

            // Add all students to the course
            mathClass.addStudent(student1);
            mathClass.addStudent(student2);
            mathClass.addStudent(student3);
            mathClass.addStudent(student4);
            mathClass.addStudent(student5);
            mathClass.addStudent(student6);
            mathClass.addStudent(student7);

            // Add grades for all students
            mathClass.addGrade("1", 85);  // Goku's grades
            mathClass.addGrade("1", 90);
            mathClass.addGrade("1", 88);

            mathClass.addGrade("2", 92);  // Naruto's grades
            mathClass.addGrade("2", 95);
            mathClass.addGrade("2", 98);

            mathClass.addGrade("3", 78);  // Ichigo's grades
            mathClass.addGrade("3", 82);
            mathClass.addGrade("3", 85);

            mathClass.addGrade("4", 100); // Sukuna's grades
            mathClass.addGrade("4", 100);
            mathClass.addGrade("4", 100);

            mathClass.addGrade("5", 95);  // Gojo's grades
            mathClass.addGrade("5", 98);
            mathClass.addGrade("5", 96);

            mathClass.addGrade("6", 88);  // Thorfinn's grades
            mathClass.addGrade("6", 85);
            mathClass.addGrade("6", 87);

            mathClass.addGrade("7", 93);  // Levi's grades
            mathClass.addGrade("7", 95);
            mathClass.addGrade("7", 94);

            // Print the grades
            mathClass.printGradeReport();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}