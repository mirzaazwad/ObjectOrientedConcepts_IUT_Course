package SimpleGenericCalculator;

public interface Operation<T extends Number>{
    public T add(T num1,T num2);
    public T subtract(T num1,T num2);
    public T multiply(T num1,T num2);
    public T divide(T num1,T num2);
}
