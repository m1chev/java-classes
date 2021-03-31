package constructors;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.sum(15, 25);
        System.out.println(sum);

        int sub = calculator.subtract(33, 11);
        System.out.println(sub);

        int mul = calculator.multiply(28, 11);
        System.out.println(mul);

        int dev = calculator.devide(308, 11);
        System.out.println(dev);

    }
}
