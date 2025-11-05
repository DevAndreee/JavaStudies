
In Java, the toString() method is inherited from the Object class and provides
a string representation of an object. By default, it returns a memory reference,
which is not useful for human-readable output.

Overriding toString() in subclasses allows you to customize how object data 
is displayed — this is one of the most common and practical uses of method overriding.


class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() from Object class
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age); // calls Person constructor
        this.salary = salary;
    }

    // Overriding toString() again for Employee-specific data
    @Override
    public String toString() {
        // You can call super.toString() to include parent details
        return "Employee{" + super.toString() + ", salary=" + salary + "}";
    }
}

public class InheritanceToString {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Employee e1 = new Employee("Bob", 40, 5500.0);

        System.out.println(p1); // Implicit call to p1.toString()
        System.out.println(e1); // Implicit call to e1.toString()

        // Note: println() automatically calls the object's toString() method.
    }
}


===== EXPLANATION =====

1. The toString() method:
   - Defined in java.lang.Object, which is the root of all classes.
   - Returns a String representation of the object.
   - Default output looks like: ClassName@MemoryAddress
     Example: Person@5e91993f

2. Why override it:
   ✅ To make object output human-readable.
   ✅ To help with debugging and logging.
   ✅ To clearly describe the object’s state.

3. How overriding works:
   - Subclass replaces (overrides) the parent’s implementation.
   - You can use super.toString() to include parent class info.
   - The method signature must match exactly:
     `public String toString()`

4. Execution behavior:
   - When System.out.println(obj) is called, Java automatically calls obj.toString().
   - If not overridden, Object’s default version runs.
   - If overridden, your custom version runs instead.

---

📌 QUICK REFERENCE:
toString() default → returns memory reference (Class@Hashcode)
@override           → customizes object string output
super.toString()    → reuses parent’s version
println(obj)        → automatically calls obj.toString()

---

⚠️ COMMON MISTAKES:
- Forgetting to annotate with @Override → no compile error, but easy to miss typos
- Returning null or using incorrect string formatting → causes NullPointerException or messy output
- Not calling super.toString() when subclass needs parent details
- Using print(obj.toString()) manually — unnecessary, println() already calls it
- Changing toString() signature (e.g., adding parameters) → not an override anymore

---

Learn more:
🔗 https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#toString--
(Section: "Class Object - Method toString()")
