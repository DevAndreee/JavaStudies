/*
 Access Modifier: private

 The "private" modifier restricts access to the attribute, method, or constructor
 only within the class where it is declared.

 Main rules:
 - Private attributes/methods are invisible outside the class.
 - Good for ENCAPSULATION: hiding the internal details of a class.
 - Access is usually done through "getters" and "setters" (public methods).

 Example: most attributes in real-world classes are private,
 and we expose them through methods to control how they are accessed/modified.

 When to use?
 - To protect sensitive data.
 - To ensure that an attribute is not directly manipulated from outside.
*/

package POO.AccessModifiers;

public class AccessModifiersPrivate {

    // Private attribute → cannot be accessed outside this class
    private String secret = "This is private!";

    // Public getter → controlled access
    public String getSecret() {
        return secret;
    }

    // Public setter → allows controlled modification
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public static void main(String[] args) {
        AccessModifiers_Private obj = new AccessModifiers_Private();

        // System.out.println(obj.secret); // ❌ Compilation error (private access)

        // Correct way → through getter and setter
        System.out.println("Before: " + obj.getSecret());

        obj.setSecret("New controlled value");
        System.out.println("After: " + obj.getSecret());
    }
}