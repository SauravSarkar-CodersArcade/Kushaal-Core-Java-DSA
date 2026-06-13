package basics.WrapperClass;
public class P1 {
    // Primitive data types are wrapped inside classes
    // These classes are called Wrapper Classes
    public static void main(String[] args) {
        int x = 10;
        Integer o1 = Integer.valueOf(x);
        // Primitive to Wrapper manually [User] [Boxing]
        int y = 10;
        // Primitive to Wrapper automatically [JVM] [Auto-Boxing]
        Integer o2 = y;
        System.out.println(o1);
        System.out.println(o2);
        Integer o3 = Integer.valueOf(50);
        // Wrapper to Primitive manually [User] [Unboxing]
        int z = o3.intValue();
        Integer o4 = Integer.valueOf(100);
        // Wrapper to Primitive automatically [JVM] [Auto-Unboxing]
        int w = o4;
        System.out.println(w);
        System.out.println(z);
        String str = "12";

        int result = Integer.parseInt(str) * 3;
        System.out.println(result);
    }
}
