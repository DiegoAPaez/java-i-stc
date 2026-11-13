import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] a) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();

        // A String[] has no .stream() method; go through Arrays.stream:
        //     Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt)
        // Add the pipeline stages you need, finish with a terminal op, and
        // PRINT the result — a pipeline whose value is never printed
        // produces no output at all.
        int result = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt)
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .sum();
        System.out.println(result);
    }
}
