 Inheritance is one of the pillars of Object-Oriented Programming (OOP).
// It allows a class (called "child" or "subclass")
// to inherit attributes and methods from another class (called "parent" or "superclass").


class Person {
    protected String name;  // "protected" allows access within the class and also by subclasses.
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

// Now we create a subclass called Employee that inherits from Person.
class Employee extends Person {
    private double salary;

    // The subclass constructor can (and should) call the superclass constructor using "super()".
    public Employee(String name, int age, double salary) {
        super(name, age);  // calls the constructor of the "Person" class
        this.salary = salary;
    }

    // The subclass can have its own methods and attributes
    public void work() {
        System.out.println(name + " is working.");
    }

    // It can also override methods from the superclass
    @Override
    public void introduce() {
        // super.introduce() calls the original version of the method from the superclass.
        super.introduce();
        System.out.println("My salary is $" + salary);
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        p1.introduce();

        System.out.println("----------------");

        Employee e1 = new Employee("Mary", 28, 3500.0);
        e1.introduce();  // overridden method
        e1.work();
    }
}


===== EXPLANATION =====

1. 'extends' → defines that one class inherits from another.
   Example: "class Employee extends Person" means Employee is a Person.

2. 'super' → used to access members from the superclass:
   - super() → calls the superclass constructor.
   - super.method() → calls a method from the superclass.

3. 'protected' → gives access to attributes for:
   - the class itself;
   - subclasses (even if they are in another package).

4. '@Override' → indicates that the method is being rewritten in the subclass.
   This is essential to avoid mistakes and make the code clearer.

5. Inheritance helps to:
   - reuse code;
   - keep the project organized;
   - create “is-a” relationships (e.g., Employee is a Person).

Research:
https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
(Section: "Subclassing and Inheritance")

