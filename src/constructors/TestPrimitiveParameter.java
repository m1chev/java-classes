package constructors;

public class TestPrimitiveParameter {
    public static void main(String[] args) {
        int x = 3;
        int p = passMethod(x);

        System.out.println("The value of x is: " + x);
        System.out.println("The value of p is: " + p);
    }

    static int passMethod(int p) {
        p = 10;
        return p;
    }
}
