package lesson10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(5.5,"Intel Core", 8,"Galaxy", "Samsung");
        Phone phone2 = new Phone(5,"Intel", 4,"Galaxy10", "Apple");
        Phone phone3 = new Phone(5,"Pentium", 4,"GalaxyA", "Nokia");
        Phone phone4 = new Phone(3.5,"Atom Seleron", 2,"GalaxyD", "Cony");
        Phone phone5 = new Phone(5.5,"Intel Core", 8,"Galaxy", "Samsung");
        Phone phone6 = new Phone(4.5,"Pentium", 16,"Galaxy12", "Samsung");
        Phone phone7 = new Phone(4,"Atom Seleron", 8,"GalaxyS", "Cony");
        Phone phone8 = new Phone(8.5,"Intel", 4,"GalaxyL", "Nokia");
        Phone phone9 = new Phone(4,"Intel Core", 2,"Galaxy14", "Samsung");
        Phone phone10 = new Phone(5.5,"Pentium", 2,"Galaxy15", "Apple");

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);
        phones.add(phone5);
        phones.add(phone6);
        phones.add(phone7);
        phones.add(phone8);
        phones.add(phone9);
        phones.add(phone10);

        PhoneUtils.printAllPhonesByProduction(phones,"Samsung");
        PhoneUtils.printTheBigestResolution(phones);
        System.out.println(phone1.equals(phone5));
        System.out.println(phone1.hashCode());
        System.out.println(phone5.hashCode());
        System.out.println(phone2.hashCode());
    }
}
