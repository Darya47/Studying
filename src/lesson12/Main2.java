package lesson12;

public class Main2 {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        ZooAnimal [] animals = new ZooAnimal[4];
        animals[0] = tiger1;
        animals[1] = monkey1;
        animals[2] = tiger2;
        animals[3] = monkey2;
        for (ZooAnimal currentAnimal:animals) {
            currentAnimal.Voice();
        }
    }
}
