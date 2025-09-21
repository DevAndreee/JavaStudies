// Array of Objects Association Example
// A Teacher has several Students (one-to-many, unidirectional)

public class Teacher {
    String name;
    Student[] students;

    Teacher(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    void listStudents() {
        System.out.println("Students of teacher " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

class TestArrayOfObjects {
    public static void main(String[] args) {
        Student[] students = { new Student("Anna"), new Student("Brian"), new Student("Charles") };
        Teacher teacher = new Teacher("John", students);
        teacher.listStudents();
    }
}
// File: ArrayOfObjects.java
