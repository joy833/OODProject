class Teacher extends Person {
    private String qualification;

    public Teacher(String name, int age, String qualification) {
        super(name, age);
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return super.toString() + ", Qualification: " + qualification;
    }
}