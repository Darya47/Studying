package lesson13;

import java.util.Comparator;
import java.util.TreeSet;

public class TovarUtils {
    public static TreeSet<Tovar> sortByName(TreeSet<Tovar> tovars){
        TreeSet<Tovar> sorted = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if (o1.getName() != o2.getName()){
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.getPrice() != o2.getPrice()){
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.getRate() != o2.getRate()){
                    return Double.compare(o1.getRate(),o2.getRate());
                }
                return 0;
            }
        });
        sorted.addAll(tovars);
        return sorted;
    }
}
