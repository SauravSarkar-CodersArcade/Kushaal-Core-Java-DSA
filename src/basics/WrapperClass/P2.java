package basics.WrapperClass;
public class P2 {
    public static void main(String[] args) {
        // Integer Parsed Value [-128 to 127]
        Integer a = 100;
        Integer b = 100;
        System.out.println((a == b) ? "Equal" : "Not Equal");
        Integer c = -128;
        Integer d = -128;
        System.out.println((c == d) ? "Equal" : "Not Equal");
        Integer e = 127;
        Integer f = 127;
        System.out.println((e == f) ? "Equal" : "Not Equal");
        Integer g = 128;
        Integer h = 128;
        System.out.println((g == h) ? "Equal" : "Not Equal");
    }
}
