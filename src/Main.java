public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 2);
        ComplexNumber b = new ComplexNumber(3, 4);

        Operation add = new Viewer(new Addition());
        Operation multiply = new Viewer(new Multiplication());
        Operation divide = new Viewer(new Division());

        add.execute(a, b);
        multiply.execute(a, b);
        divide.execute(a, b);
    }
}