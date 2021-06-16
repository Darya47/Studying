package lesson10.interfaces;

public class FractionNumberOperationImpl implements FractionNumberOperation{


    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int resultDivident = a.getDividend() * b.getDivisor() +
                a.getDivisor() * b.getDividend();
        int resultDivisor = a.getDivisor() * b.getDivisor();
        FractionNumberImpl result = new FractionNumberImpl(resultDivident, resultDivisor);
        result.sokrashwnie();
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}
