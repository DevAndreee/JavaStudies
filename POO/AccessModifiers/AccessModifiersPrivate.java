
A C C E S S   M O D I F I E R :   P R I V A T E
The "private" modifier restricts access only within the class where it is declared.

It’s the most restrictive access level and is essential for **encapsulation**, 
ensuring internal class data cannot be accessed or modified directly.


package POO.AccessModifiers;

public class AccessModifiersPrivate {

    private String secret = "This is private!";

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public static void main(String[] args) {
        AccessModifiersPrivate obj = new AccessModifiersPrivate();

        // System.out.println(obj.secret); // ❌ Not allowed: 'secret' is private

        System.out.println("Before: " + obj.getSecret());
        obj.setSecret("New controlled value");
        System.out.println("After: " + obj.getSecret());
    }
}


EXPLANATION:
- `private` makes attributes and methods visible **only** inside their own class.
- Used for encapsulation: hiding internal implementation from external code.
- Access to private fields is usually managed via public getters/setters.
- Promotes data safety and maintainability.

Example:
  private int age;
  public int getAge() { return age; }
  public void setAge(int age) {
      if (age >= 0) this.age = age;
  }

QUICK REFERENCE:
Syntax:
  private type variableName;
  private returnType methodName() { ... }

Visibility:
  - Same class ✅
  - Same package ❌
  - Subclasses ❌
  - External classes ❌

COMMON MISTAKES:
- Trying to access private fields directly from another class.
- Forgetting to provide getters/setters for private attributes.
- Overusing public access instead of keeping data private.

LEARN MORE:
- Encapsulation in Java: https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
- Getters and Setters Best Practices: https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html