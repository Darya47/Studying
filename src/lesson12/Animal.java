package lesson12;

public class Animal {

    private int age;
    private int id;
    private String name;
    private String poroda;
    public Animal() {

}
public Animal (int age,String name, String poroda) {
        this.age = age;
        this.name = name;
        this.poroda = poroda;
  }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
    public void printVoice () {
        System.out.println("Pppppppp");

    }
}

