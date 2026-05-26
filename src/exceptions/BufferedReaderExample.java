package exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        String str;
        // try with resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();
            System.out.println(str);
            // This close() is not required
            // br.close(); // How do we know that it is not needed => Automatically [JVM]
            // BufferedReader -> Reader -> Closeable -> AutoCloseable
        }
    }
}
