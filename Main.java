public class Main {

    record Person(String name, int age){}

    public static void main(String[] args) throws Exception {
        String name;
        int age;
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            name = sc.nextLine();
            age = Integer.parseInt(sc.nextLine());
        }
        
        Person p = new Person(name, age);
        System.out.println(p.toString());
    }
}
