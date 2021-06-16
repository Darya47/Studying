package lesson10;

import java.util.Objects;

public class Phone {
    private double diagonal;
    private String processor;
    private int yeadro;
    private String model;
    private String proizvoditel;

    public Phone() {
    }

    public Phone(double diagonal, String processor, int yeadro, String model, String proizvoditel) {
        this.diagonal = diagonal;
        this.processor = processor;
        this.yeadro = yeadro;
        this.model = model;
        this.proizvoditel = proizvoditel;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getYeadro() {
        return yeadro;
    }

    public void setYeadro(int yeadro) {
        this.yeadro = yeadro;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    @Override
    public String toString() {
        return proizvoditel + " "+model+" "+yeadro+" ядер, диагональ "+diagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.getDiagonal(), getDiagonal()) == 0 && getYeadro() == phone.getYeadro() && Objects.equals(getProcessor(), phone.getProcessor()) && Objects.equals(getModel(), phone.getModel()) && Objects.equals(getProizvoditel(), phone.getProizvoditel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDiagonal(), getProcessor(), getYeadro(), getModel(), getProizvoditel());
    }
}
