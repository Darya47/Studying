package lesson7or13;

public class Otlichnik extends Student{

    @Override
    public void printPerinetrTreug(int a, int b, int c) {
        if ((a+b<c) || (c+b<a) || (a+c<b)){
            System.out.println(" Это не треугольник");
            return;
        }
        System.out.println(a+b+c);
    }
}
