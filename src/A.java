public class A {

    private final int x;
    private final int y;
    private final int z;

    private final int a;
    private final int b;
    private final int c;

    public A(int x, int y, int z, int a, int b, int c) {
        this.x = x;
        this.y = y;
        this.z = z;

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int method1() {
        return x + y;
    }

    public int method2() {
        return z * 2;
    }

    public int method3() {
        return a + b + c;
    }
}