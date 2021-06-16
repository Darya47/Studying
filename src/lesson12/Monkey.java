package lesson12;

public class Monkey implements ZooAnimal{

    @Override
    public void Voice() {
        System.out.println("YYYYYYYYAAAyyyyyyaaaa yyyyaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Обезьянка прыгает");
    }

    @Override
    public void run() {
        System.out.println("Обезьянка бегает");
    }
}
