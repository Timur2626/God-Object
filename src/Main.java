public class Main {

    public static void main(String[] args) {
        A original = new A(10, 20, 5, 1, 2, 3);

        A1 first = new A1(10, 20);
        A2 second = new A2(5);
        A3 third = new A3(1, 2, 3);

        System.out.println("method1: " + first.method1());
        System.out.println("method2: " + second.method2());
        System.out.println("method3: " + third.method3());
    }
}