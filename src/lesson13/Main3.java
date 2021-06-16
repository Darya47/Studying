package lesson13;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(2.5,2,"Золото",5);
        Coin coin2 = new Coin(2.5,2,"Золото",5);
        Coin coin3 = new Coin(2,10,"Серебро",10);
        Coin coin4 = new Coin(5,5,"Бронза",25);
        Coin coin5 = new Coin(5,2,"Серебро",25);
        Coin coin6 = new Coin(4,2,"Золото",5);

        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o1.getNominal() != o2.getNominal()){
                    return - o1.getNominal() - o2.getNominal();
                }
                if (o1.getDiamentr() != o2.getDiamentr()){
                    return - Double.compare(o1.getDiamentr(),o2.getDiamentr());
                }
                if (o1.getVes() != o2.getVes()){
                    return - Double.compare(o1.getVes(),o2.getVes());
                }
                if (o1.getMetall() != o2.getMetall()){
                    return - o1.getMetall().compareTo(o2.getMetall());
                }
                return 0;
            }
        });
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin c:coins) {
            System.out.println(c);
        }
    }
}
