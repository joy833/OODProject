import java.util.Scanner;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();

        while (true) {
            System.out.println("\nSchool Management System Menu:");
            System.out.println("1. Add Teacher");
            System.out.println("2. Add Student");
            System.out.println("3. Add Class");
            System.out.println("4. Add Subject");
            System.out.println("5. Add Result");
            System.out.println("6. Display Teachers");
            System.out.println("7. Display Students");
            System.out.println("8. Display Classes");
            System.out.println("9. Display Subjects");
            System.out.println("10. Display Results");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTeacher(school, scanner);
                    break;
                case 2:
                    addStudent(school, scanner);
                    break;
                case 3:
                    addClass(school, scanner);
                    break;
                case 4:
                    addSubject(school, scanner);
                    break;
                case 5:
                    addResult(school, scanner);
                    break;
                case 6:
                    school.displayTeachers();
                    break;
                case 7:
                    school.displayStudents();
                    break;
                case 8:
                    school.displayClasses();
                    break;
                case 9:
                    school.displaySubjects();
                    break;
                case 10:
                    displayResults(school, scanner);
                    break;
                case 11:
                    System.out.println("Exiting the School Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTeacher(School school, Scanner scanner) {
        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Teacher Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Teacher Qualification: ");
        String qualification = scanner.nextLine();

        Teacher teacher = new Teacher(name, age, qualification);
        school.addTeacher(teacher);
    }

    private static void addStudent(School school, Scanner scanner) {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Student student = new Student(name, age);
        school.addStudent(student);
    }

    private static void addClass(School school, Scanner scanner) {
        System.out.print("Enter Class Name: ");
        String className = scanner.nextLine();
        Class schoolClass = new Class(className);
        school.addClass(schoolClass);
    }

    private static void addSubject(School school, Scanner scanner) {
        System.out.print("Enter Subject Name: ");
        String subjectName = scanner.nextLine();
        Subject subject = new Subject(subjectName);
        school.addSubject(subject);
    }

    private static void addResult(School school, Scanner scanner) {
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        System.out.print("Enter Subject ID: ");
        int subjectId = scanner.nextInt();
        System.out.print("Enter Result: ");
        float result = scanner.nextFloat();

        school.addResult(studentId, subjectId, result);
    }

    private static void displayResults(School school, Scanner scanner) {
        System.out.print("Enter Student ID to view results: ");
        int studentId = scanner.nextInt();
        school.displayResults(studentId);
    }
}
