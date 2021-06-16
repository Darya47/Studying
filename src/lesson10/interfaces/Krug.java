package lesson10.interfaces;

import java.util.Objects;

public class Krug implements Figura{
    private double radius;

    public Krug() {
    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Krug)) return false;
        Krug krug = (Krug) o;
        return Double.compare(krug.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double ploshad() {
        return Math.PI * (radius * radius);
    }

}
