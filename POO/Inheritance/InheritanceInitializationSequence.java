Initialization sequence in inheritance refers to the specific order in which different 
parts of an object are initialized when you create an instance of a subclass.

Understanding this order is crucial because it affects when attributes get their values 
and when methods can safely be called. Java follows a strict and predictable sequence 
to ensure objects are always in a valid state.

class Parent {
    static int parentStaticVar = initParentStatic();
    int parentInstanceVar = initParentInstance();
    
    static {
        System.out.println("1. Parent static block");
    }
    
    {
        System.out.println("3. Parent instance block");
    }
    
    static int initParentStatic() {
        System.out.println("0. Parent static variable initialization");
        return 100;
    }
    
    int initParentInstance() {
        System.out.println("2. Parent instance variable initialization");
        return 200;
    }
    
    public Parent() {
        System.out.println("4. Parent constructor");
    }
}

class Child extends Parent {
    static int childStaticVar = initChildStatic();
    int childInstanceVar = initChildInstance();
    
    static {
        System.out.println("6. Child static block");
    }
    
    {
        System.out.println("8. Child instance block");
    }
    
    static int initChildStatic() {
        System.out.println("5. Child static variable initialization");
        return 300;
    }
    
    int initChildInstance() {
        System.out.println("7. Child instance variable initialization");
        return 400;
    }
    
    public Child() {
        // super() is implicitly called here first
        System.out.println("9. Child constructor");
    }
}

public class InheritanceInitializationSequence {
    public static void main(String[] args) {
        System.out.println("=== Creating first Child object ===");
        Child c1 = new Child();
        
        System.out.println("\n=== Creating second Child object ===");
        Child c2 = new Child();
        
        // Notice: static initialization happens only once (first object creation)
        // Instance initialization happens every time you create a new object
    }
}

===== EXPLANATION =====

1. Complete initialization sequence when creating a subclass object:
   
   PHASE 1 - Static initialization (happens only once, when class is first loaded):
   - Parent class static variables are initialized in declaration order
   - Parent class static blocks execute in declaration order
   - Child class static variables are initialized in declaration order
   - Child class static blocks execute in declaration order
   
   PHASE 2 - Instance initialization (happens every time you create an object):
   - Parent class instance variables are initialized in declaration order
   - Parent class instance blocks execute in declaration order
   - Parent class constructor body executes
   - Child class instance variables are initialized in declaration order
   - Child class instance blocks execute in declaration order
   - Child class constructor body executes

2. Why this order matters in practice:
   
   When you write code in a constructor, you need to know what has already been initialized. 
   By the time your constructor body runs, all instance variables have their initial values 
   and all instance blocks have executed. This means you can safely use these values in 
   your constructor logic. However, you cannot access instance members in static contexts 
   because static initialization happens before any object exists.

3. Static versus instance initialization timing:
   
   Static initialization happens exactly once per class, the very first time the JVM loads 
   that class into memory. This might be when you create the first object, or when you 
   access a static member, or when a subclass is loaded. After this first initialization, 
   static members keep their values for the entire program lifetime.
   
   Instance initialization happens fresh for every single object you create. Each new 
   object gets its own copy of instance variables, and those variables go through the 
   initialization sequence again. This is why in the example above, creating a second 
   Child object skips all the static initialization steps.

4. The implicit super() call and its position:
   
   Even though super() appears to be the first thing in a child constructor, instance 
   variable initialization and instance blocks actually run before the constructor body. 
   The actual sequence is: parent instance variables, parent instance blocks, parent 
   constructor, then child instance variables, child instance blocks, and finally child 
   constructor. This ensures the parent object is completely set up before the child 
   adds its own state.

5. Practical implications when designing classes:
   
   ✅ You can safely use parent attributes in child constructors because parent initialization is complete
   ✅ Instance blocks are useful for initialization code shared by multiple constructors
   ✅ Static blocks are perfect for one-time setup like loading configuration or initializing collections
   ❌ Don't rely on child class state in parent constructors because child hasn't initialized yet
   ❌ Avoid calling overridable methods in parent constructors as they might use uninitialized child state

---

📌 QUICK REFERENCE:
Static initialization  → once per class, when class first loads (parent first, then child)
Instance initialization → every object creation, in declaration order (parent first, then child)
Execution order        → static vars → static blocks → instance vars → instance blocks → constructor
super() timing         → runs after parent instance init, before child instance init

---

⚠️ COMMON MISTAKES:
- Assuming constructor runs before instance variables initialize → instance variables and blocks run first, then constructor body
- Forgetting static initialization happens only once → subsequent object creations skip all static initialization
- Calling overridable methods in parent constructor → dangerous because child's instance variables aren't initialized yet
- Mixing up the order between parent and child → always remember parent completes its phase before child begins
- Not understanding when static blocks execute → they run when class loads, which might be before you create any objects

---

Learn more:
🔗 https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
(Section: "Initializing Fields")
🔗 https://docs.oracle.com/javase/specs/jls/se17/html/jls-12.html#jls-12.5
(Section: "Creation of New Class Instances")