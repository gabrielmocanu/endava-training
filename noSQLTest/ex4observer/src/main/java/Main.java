public class Main {

    public static void main(String[] args) {
        Subject s = new Subject();

        s.addListener(() -> System.out.println("Alo"));

        s.event();
    }
}
