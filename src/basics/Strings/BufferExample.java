package basics.Strings;
public class BufferExample {
    public void stringInsert(){
        StringBuffer buffer = new StringBuffer("JA");
        System.out.println("Old String: " + buffer); // JA
        buffer.insert(1, "AV");
        System.out.println("New String: " + buffer); // JAVA
    }
    public void stringAppend(){
        StringBuffer buffer = new StringBuffer("Core");
        System.out.println("Old String: " + buffer); // Core
        buffer.append(" Java");
        System.out.println("New String: " + buffer); // Core Java
    }
    public void stringReverse(){
        StringBuffer buffer = new StringBuffer("laahsuK");
        System.out.println("Old String: " + buffer); // laahsuK
        buffer.reverse();
        System.out.println("New String: " + buffer); // Kushaal
    }
    public static void main(String[] args) {
        new BufferExample().stringInsert();
        new BufferExample().stringAppend();
        new BufferExample().stringReverse();
    }
}
