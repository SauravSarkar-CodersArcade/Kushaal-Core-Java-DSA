package basics.Strings;
public class StringPool {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        // ⚠️Even though == compares addresses, heap gives same address to s1 & s2
        System.out.println(s1 == s2); // ℹ️Here we are comparing addresses
        String s3 = new String("Java");
        System.out.println(s1 == s3); // ℹ️Here we are comparing references | objects
        System.out.println(s1.equals(s3)); // ℹ️Here again values are compared
        String message = "Order Confirmed"; // Obj1
        message += " - ID 101"; // Obj2
        System.out.println(message);
        message += " - ID 102"; // Obj3
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message); // Immutabte [Can't be changed]
        // Everytime we do any operation, a new object is created in the heap [SCP]
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
/**
 * 🟢 s1 & s2 share same object in heap
 * 🟢 new String() creates new object inside heap [SCP]
 * 🟢 == compares references
 * 🟢 .equals() compares values
 */
