package lesson7or13;

public class Tovar {
    // 1 - объявление переменных (характеристики данного типа)
    String name;
    private int id;
    private int fullPrice;
    private int salePrice;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
}
