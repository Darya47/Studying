package lesson7or13;

public class Main {
    public static void main(String[] args) {
        Tovar chainik1 = new Tovar();
        Tovar chainik2 = new Tovar();
        chainik1.setId(456);
        chainik2.setId(123);

        chainik1.setName("linova");
        chainik2.setName("bosh");

        int idChainik = chainik2.getId();
        System.out.println(idChainik);

        Pen pen = new Pen();
        pen.setName("Шариковая ручка");

    }
}
