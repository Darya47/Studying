package lesson13;

import java.util.Comparator;
import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private double diamentr;
    private double ves;
    private String metall;
    private int nominal;

    public Coin() {
    }

    public Coin(double diamentr, double ves, String metall, int nominal) {
        this.diamentr = diamentr;
        this.ves = ves;
        this.metall = metall;
        this.nominal = nominal;
    }

    public double getDiamentr() {
        return diamentr;
    }

    public void setDiamentr(double diamentr) {
        this.diamentr = diamentr;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diamentr=" + diamentr +
                ", ves=" + ves +
                ", metall='" + metall + '\'' +
                ", nominal=" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;
        Coin coin = (Coin) o;
        return Double.compare(coin.getDiamentr(), getDiamentr()) == 0 && Double.compare(coin.getVes(), getVes()) == 0 && getNominal() == coin.getNominal() && Objects.equals(getMetall(), coin.getMetall());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiamentr(), getVes(), getMetall(), getNominal());
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getMetall() != o.getMetall()){
            return - this.getMetall().compareTo(o.getMetall());
        }
        if (this.getNominal() != o.getNominal()){
            return - this.getNominal() - o.getNominal();
        }
        if (this.getDiamentr() != o.getDiamentr()){
            return - Double.compare(this.getDiamentr(),o.getDiamentr());
        }
        if (this.getVes() != o.getVes()){
            return - Double.compare(this.getVes(),o.getVes());
        }

        return 0;
    }
}
