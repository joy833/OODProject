class Subject {
    private static int nextSubjectId = 1;
    private int subjectId;
    private String subjectName;

    public Subject(String subjectName) {
        this.subjectId = nextSubjectId++;
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    @Override
    public String toString() {
        return "Subject Name: " + subjectName + ", Subject ID: " + subjectId;
    }
}