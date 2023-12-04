import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Class> classes;
    private List<Subject> subjects;
    private Map<Integer, Map<Integer, Float>> studentResults; // Map<studentId, Map<subjectId, result>>

    public School() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
        subjects = new ArrayList<>();
        studentResults = new HashMap<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Teacher added successfully!");
    }

    public void addStudent(Student student) {
        students.add(student);
        studentResults.put(student.getStudentId(), new HashMap<>());
        System.out.println("Student added successfully!");
    }

    public void addClass(Class schoolClass) {
        classes.add(schoolClass);
        System.out.println("Class added successfully!");
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
        System.out.println("Subject added successfully!");
    }

    public void addResult(int studentId, int subjectId, float result) {
        Map<Integer, Float> subjectResults = studentResults.get(studentId);
        if (subjectResults != null) {
            subjectResults.put(subjectId, result);
            System.out.println("Result added successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void displayTeachers() {
        System.out.println("List of Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayClasses() {
        System.out.println("List of Classes:");
        for (Class schoolClass : classes) {
            System.out.println(schoolClass);
        }
    }

    public void displaySubjects() {
        System.out.println("List of Subjects:");
        for (Subject subject : subjects) {
            System.out.println(subject);
        }
    }

    public void displayResults(int studentId) {
        Map<Integer, Float> subjectResults = studentResults.get(studentId);
        if (subjectResults != null && !subjectResults.isEmpty()) {
            System.out.println("Results for Student with ID " + studentId + ":");
            for (Map.Entry<Integer, Float> entry : subjectResults.entrySet()) {
                int subjectId = entry.getKey();
                float result = entry.getValue();
                System.out.println("Subject ID: " + subjectId + ", Result: " + result);
            }
        } else {
            System.out.println("No results found for Student with ID " + studentId);
        }
    }
}

