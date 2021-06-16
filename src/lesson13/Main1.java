package lesson13;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(9);
        numbers.add(9);
        numbers.add(9);
        numbers.add(9);

        // 1 - for (для тех, где есть индексы)
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // 2 - for each (для всех коллекций - где есть индексы или нет)
        for (Integer num:numbers) {
            System.out.println(num);
        }

        // 3 - с помощью итератора (очень похож на первый способ, но он тоже для всех коллекций - где есть индексы и где их нет)
        for (Iterator<Integer> iter = numbers.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
