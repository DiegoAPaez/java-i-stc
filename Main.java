public class Main {

    record Person(String name, int age){}

    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        
        Person p = new Person(name, age);
        System.out.println(p.toString());
    }
}
