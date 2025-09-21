// Unidirectional Many-to-One Association
// Several Students reference one Teacher

public class TeacherManyToOne {
    String name;
    TeacherManyToOne(String name) {
        this.name = name;
    }
}

class StudentManyToOne {
    String name;
    TeacherManyToOne teacher;
    StudentManyToOne(String name, TeacherManyToOne teacher) {
        this.name = name;
        this.teacher = teacher;
    }
    void showTeacher() {
        System.out.println(name + " has teacher " + teacher.name);
    }
}

class TestUnidirectionalManyToOne {
    public static void main(String[] args) {
        TeacherManyToOne teacher = new TeacherManyToOne("Fernanda");
        StudentManyToOne s1 = new StudentManyToOne("John", teacher);
        StudentManyToOne s2 = new StudentManyToOne("Clara", teacher);
        s1.showTeacher();
        s2.showTeacher();
    }
}
// File: UnidirectionalManyToOne.java
