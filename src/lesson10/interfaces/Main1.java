package lesson10.interfaces;

public class Main1 {
    public static void main(String[] args) {
        FractionNumberImpl drob1 = new FractionNumberImpl(1,5);
        FractionNumberImpl drob2 = new FractionNumberImpl(3,5);

        FractionNumberOperationImpl calculator = new FractionNumberOperationImpl();
        FractionNumber resultAdd = calculator.add(drob1,drob2);
        System.out.println(resultAdd);

    }
}
