public class Student extends Person {
    private static int nextStudentId = 1;
    private int studentId;

    public Student(String name, int age) {
        super(name, age);
        this.studentId = nextStudentId++;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }
}