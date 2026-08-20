class Student {
    int studentID;
    String name;
    String dept;

    Student(int studentID, String name, String dept) {
        this.studentID = studentID;
        this.name = name;
        this.dept = dept;
    }

    void displayStudentDetails() {
        System.out.println("Student ID = " + studentID);
        System.out.println("Name = " + name);
        System.out.println("Dept = " + dept);
    }
}
class UndergraduateStudent extends Student {
    int semester;
    double cgpa;

    UndergraduateStudent(int studentID, String name, String dept, int semester, double cgpa) {
        super(studentID, name, dept);
        this.semester = semester;
        this.cgpa = cgpa;
    }

    void displayUndergraduateDetails() {
        displayStudentDetails();
        System.out.println("Semester = " + semester);
        System.out.println("CGPA = " + String.format("%.2f", cgpa));
    }
}

public class PostgraduateStudent extends Student {
    String specialization;
    String researchTopic;

    PostgraduateStudent(int studentID, String name, String dept, String specialization, String researchTopic) {
        super(studentID, name, dept);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }

    void displayPostgraduateDetails() {
        displayStudentDetails();
        System.out.println("Specialization = " + specialization);
        System.out.println("Research Topic = " + researchTopic);
    }

    public static void main(String[] args) {
        UndergraduateStudent u1 = new UndergraduateStudent(101, "Ravi", "CSE", 5, 8.75);
        u1.displayUndergraduateDetails();

        PostgraduateStudent p1 = new PostgraduateStudent(201, "Anita", "ECE", "AI", "Computer Vision");
        p1.displayPostgraduateDetails();

        Student s1 = new Student(102, "Kiran", "ISE");
        s1.displayStudentDetails();

        UndergraduateStudent u2 = new UndergraduateStudent(103, "Student", "CSE", 7, 9.10);
        System.out.println("Semester = " + u2.semester);
        System.out.println("CGPA = " + String.format("%.2f", u2.cgpa));
    }
}