package lesson13;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("qqq");
        set.add("rrrr");
        set.add("eeee");
        set.add("www");
        set.add("rrrr");
        set.add("rrrr");

        System.out.println(set);
    }
}
