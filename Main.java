import java.io.*;
import java.util.function.*;

public class Main {
    public static void main(String[] a) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        // A lambda shares this method's scope, so its parameter may NOT be
        // called n — that is 'variable n is already defined'. Use x.
        // Function<Integer, Integer> f = x -> /* your expression */;
        // then print the result of applying f to n
        Function<Integer, Integer> squarePlus = x -> x * x + 1;
        System.out.println(squarePlus.apply(n));
    }
}
