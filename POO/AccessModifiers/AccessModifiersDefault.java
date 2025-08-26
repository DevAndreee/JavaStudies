/*
 Access Modifier: default (package-private)

 When no modifier is specified, Java applies the "default" (package-private) access.

 Main rules:
 - Members with default access are visible ONLY inside the same package.
 - Not accessible from classes in other packages.
 - Often used for grouping related classes that should collaborate internally,
   but without exposing details to the outside world.

 When to use?
 - When you want classes in the SAME package to share code,
   but you don’t want external packages to depend on those details.
*/

package POO.AccessModifiers;

class DefaultClass {
    String message = "Accessible only within the same package";

    void showMessage() {
        System.out.println(message);
    }
}

public class AccessModifiersDefault {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        obj.showMessage();  // ✅ Works, because we are in the same package
    }
}