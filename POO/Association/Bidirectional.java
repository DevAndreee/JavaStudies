// Bidirectional Association
// A Student has a Teacher and the Teacher has several Students

public class TeacherBidirectional {
    String name;
    StudentBidirectional[] students;
    TeacherBidirectional(String name) {
        this.name = name;
    }
    void setStudents(StudentBidirectional[] students) {
        this.students = students;
    }
    void listStudents() {
        System.out.println("Students of teacher " + name + ":");
        for (StudentBidirectional student : students) {
            System.out.println("- " + student.name);
        }
    }
}

class StudentBidirectional {
    String name;
    TeacherBidirectional teacher;
    StudentBidirectional(String name, TeacherBidirectional teacher) {
        this.name = name;
        this.teacher = teacher;
    }
    void showTeacher() {
        System.out.println(name + " has teacher " + teacher.name);
    }
}

class TestBidirectional {
    public static void main(String[] args) {
        TeacherBidirectional teacher = new TeacherBidirectional("Mark");
        StudentBidirectional[] students = {
            new StudentBidirectional("Paula", teacher),
            new StudentBidirectional("Rafael", teacher)
        };
        teacher.setStudents(students);
        teacher.listStudents();
        students[0].showTeacher();
        students[1].showTeacher();
    }
}
// File: Bidirectional.java
