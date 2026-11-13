import java.io.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LocalDate a = LocalDate.parse(br.readLine());
        LocalDate b = LocalDate.parse(br.readLine());

        long count = Math.abs(ChronoUnit.DAYS.between(a, b));
        System.out.println(count);
    }
}