package Practicum;

class Student {
    int studentID;
    String Studentname;
    String department;

    Student(int studentID, String name, String dept) {
        this.studentID = studentID;
        this.Studentname = name;
        this.department = dept;
    }
    void displayStudentDetails() {
        if (studentID <= 0) {
            System.out.println("Invalid Student ID");
        } else {
            System.out.println("Student ID = " + studentID);
        }
        if (Studentname == null || Studentname.isEmpty()) {
            System.out.println("Empty Student Name");
        } else {
            System.out.println("Name = " + Studentname);
        }
        System.out.println("Dept = " + department);
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
    void displayUGDetails(int semester, double cgpa) {
     if (semester < 1 || semester > 8) {
        System.out.println("Invalid Semester");
     }
     else {
           System.out.println("Semester = " + semester);
     }
     if (cgpa < 0 || cgpa > 10) {
        System.out.println("Invalid CGPA");
     }
     else {
         System.out.println("CGPA = " + String.format("%.2f", cgpa));
     }
    }
}
class PostGraduateStudent extends Student {
    String specialization;
    String researchTopic;

    PostGraduateStudent(int studentID, String name, String dept, String specialization, String researchTopic) {
        super(studentID, name, dept);
        this.specialization = specialization;
        this.researchTopic = researchTopic;
    }
    void displayPGDetails(String specialization, String researchTopic) {
        System.out.println("Specialization = " + specialization);
  
        if (researchTopic == null || researchTopic.isEmpty()) {
        System.out.println("Empty Research Topic");
        }
        else {
        System.out.println("Research Topic = " + researchTopic);
       }
    }
    public static void main(String[] args) {
        UndergraduateStudent u1 = new UndergraduateStudent(101, "Ravi", "CSE", 5, 8.75);
        u1.displayStudentDetails();
        u1.displayUGDetails(u1.semester, u1.cgpa); System.out.println();

        PostGraduateStudent p1 = new PostGraduateStudent(201, "Anita", "ECE", "AI", "Computer Vision");
        p1.displayStudentDetails();
        p1.displayPGDetails(p1.specialization, p1.researchTopic); System.out.println();

        Student s1 = new Student(102, "Kiran", "ISE");
        s1.displayStudentDetails(); System.out.println();

        u1.displayUGDetails(7,9.10);
        p1.displayPGDetails("Data Science", "NLP"); System.out.println();

        Student s2 = new Student(-10, "","NOT PROVIDED");
        s2.displayStudentDetails(); System.out.println();

        u1.displayUGDetails(10, 11.5);
        p1.displayPGDetails("NOT PROVIDED", "");

    }
}