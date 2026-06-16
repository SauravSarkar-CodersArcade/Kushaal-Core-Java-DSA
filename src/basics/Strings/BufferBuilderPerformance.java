package basics.Strings;
public class BufferBuilderPerformance {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        long startTime = System.currentTimeMillis(); // 10:00 AM
        for (int i=1; i<100000000; i++){
            builder.append(" Programming");
        }
        System.out.println("Builder time: " +
                (System.currentTimeMillis() - startTime) + "ms"); // 11:00 AM
        startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Java");
        for (int i=1; i<100000000; i++){
            buffer.append(" Programming");
        }
        System.out.println("Buffer time: " +
                (System.currentTimeMillis() - startTime) + "ms"); // 12:00 PM
    }
}
