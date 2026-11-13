import java.io.*;
import java.util.*;

public class Main {
    static Optional<Integer> safeParse(String s) {
        try {
            return Optional.of(Integer.valueOf(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static void main(String[] a) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        Integer parsed = safeParse(line).map(n -> n * 2).orElse(-1);
        System.out.println(parsed.toString());
    }
}
