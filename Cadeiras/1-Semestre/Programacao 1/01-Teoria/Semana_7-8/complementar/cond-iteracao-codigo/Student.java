class Student {
    private String studentName;
    private int regNo;
    private Double gpa;

    Student(String s, int i, Double d) {
        this.studentName = s;
        this.regNo = i;
        this.gpa = d;
    }



    public static void main(String[] args) {
        Student s1 = new Student("Justin", 101, 8.81);
        Student s2 = new Student("Jessica", 102, 9.11);
        System.out.println(s1);
        System.out.println(s2);
    }
}


