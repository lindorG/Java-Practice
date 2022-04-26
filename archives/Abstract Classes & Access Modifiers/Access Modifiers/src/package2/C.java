package package2;
import package1.*;

// If class C were "private", class A would not be able to create an instance of class A
// If we were to remove all access modifiers, class C would only be visible to classes in the same package

public class C {

    // Code below is visible to anything in package1 because the "public" keyword
    public String publicMessage = "This is public";
    protected String protectedMessage = "This is proteceted";

    // Protected messages are accessible to a different class in a different package
    // as long as that class is a subclass is a subclass of whatever class contains
    // this protected member
    String defaultMessage = "This is the default";

    private String privateMessage = "This is private";
    // Something that is private is only visible to the class that contains itself
}
