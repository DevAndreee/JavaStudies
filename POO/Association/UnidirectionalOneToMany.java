// Unidirectional One-to-Many Association
// A School has several Students (one-to-many)

public class School {
    String name;
    StudentOneToMany[] students;

    School(String name, StudentOneToMany[] students) {
        this.name = name;
        this.students = students;
    }

    void listStudents() {
        System.out.println("Students of school " + name + ":");
        for (StudentOneToMany student : students) {
            System.out.println("- " + student.name);
        }
    }
}

class StudentOneToMany {
    String name;
    StudentOneToMany(String name) {
        this.name = name;
    }
}

class TestUnidirectionalOneToMany {
    public static void main(String[] args) {
        StudentOneToMany[] students = { new StudentOneToMany("Lucas"), new StudentOneToMany("Mary"), new StudentOneToMany("Peter") };
        School school = new School("Central School", students);
        school.listStudents();
    }
}
// File: UnidirectionalOneToMany.java
