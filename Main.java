import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long count = br.lines()
            .filter(line -> !line.trim().isEmpty())
            .count();

        System.out.println(count);
    }
}
