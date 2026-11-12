public class Main {
    // class Pair<A, B> { ... }
    static class Pair<A, B> {
        private final A first;
        private final B second;
        
        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Ada", 36);
        System.out.println(p);
    }
}
