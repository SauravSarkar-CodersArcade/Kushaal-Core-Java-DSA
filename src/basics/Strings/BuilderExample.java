package basics.Strings;
public class BuilderExample  {
    public void stringInsert(){
        StringBuilder builder = new StringBuilder("JA");
        System.out.println("Old String: " + builder); // JA
        builder.insert(1, "AV");
        System.out.println("New String: " + builder); // JAVA
    }
    public void stringAppend(){
        StringBuilder builder = new StringBuilder("Core");
        System.out.println("Old String: " + builder); // Core
        builder.append(" Java");
        System.out.println("New String: " + builder); // Core Java
    }
    public void stringReverse(){
        StringBuilder builder = new StringBuilder("laahsuK");
        System.out.println("Old String: " + builder); // laahsuK
        builder.reverse();
        System.out.println("New String: " + builder); // Kushaal
    }
    public static void main(String[] args) {
        new BuilderExample().stringInsert();
        new BuilderExample().stringAppend();
        new BuilderExample().stringReverse();
    }
}
