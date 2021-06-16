package lesson10.interfaces;

import java.util.Objects;

public class Pryamougolnik implements Figura{
    private int a;
    private int b;

    public Pryamougolnik() {
    }

    public Pryamougolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pryamougolnik)) return false;
        Pryamougolnik that = (Pryamougolnik) o;
        return getA() == that.getA() && getB() == that.getB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }

    @Override
    public double perimetr() {
        return a + a + b + b;
    }

    @Override
    public double ploshad() {
        return a*b;
    }
}
