public class Viewer implements Operation  {
    private Operation wrapped;

    public Viewer(Operation wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = wrapped.execute(a, b);
        System.out.println("Выполнена операция: " + wrapped.getClass().getSimpleName() + " с результатом: " + result);
        return result;
    }
}
