package lesson7or13;

public class Main3 {
    public static void main(String[] args) {
        Tour tour1 = new Tour("Восток", 14, 140000, "Самолет", 5);
        Tour tour2 = new Tour("Запад", 10, 14000, "Автобус", 4);
        Tour tour3 = new Tour("Север", 5, 10000, "Автобус", 3);
        Tour tour4 = new Tour("Юг", 9, 90000, "Самолет", 5);
        Tour tour5 = new Tour("Италия", 8, 80000, "Самолет", 5);

        Tour[] tours = new Tour[5];
        tours[0] = tour1;
        tours[1] = tour2;
        tours[2] = tour3;
        tours[3] = tour4;
        tours[4] = tour5;

        for (int i = 0; i < tours.length; i++) {
            tours[i].printInfo();
        }
    }
}
