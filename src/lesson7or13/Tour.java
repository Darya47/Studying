package lesson7or13;

public class Tour {
    private String name;
    private int day;
    private int cost;
    private String[] countries = new String[10];
    private String type;
    private int stars;

    public Tour(){

    }

    public Tour(String name, int day, int cost, String type, int stars){
        this.name = name;
        this.cost = cost;
        this.day = day;
        this.type = type;
        this.stars = stars;
    }
    public void printInfo(){
        System.out.printf("Тур: %s, %d дней, на %s, " +
                "за %d рублей, в %d звездочный отель \n", this.name, this.day, this.type, this.cost, this.stars);
    }
}
