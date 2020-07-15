package lesson1.task3;

import lesson1.task3.fruits.Apple;
import lesson1.task3.fruits.Orange;

public class Main {
    public static void main(String[] args) {

        Box<Orange> orangeBox1 = new Box<>("orangeBox1");
        Box<Orange> orangeBox2 = new Box<>("orangeBox2");
        Box<Apple> appleBox1 = new Box<>("appleBox1");
        Box<Apple> appleBox2 = new Box<>("appleBox2");

        for (int i = 0; i < 5; i++) {
            int idOrange = i * 3;
            int idApple = i * 4;
            orangeBox1.addFruit(new Orange(idOrange));
            orangeBox2.addFruit(new Orange(idOrange + 1));
            orangeBox2.addFruit(new Orange(idOrange + 2));
            appleBox1.addFruit(new Apple(idApple));
            appleBox2.addFruit(new Apple(idApple+ 1));
            appleBox2.addFruit(new Apple(idApple + 2));
            appleBox2.addFruit(new Apple(idApple + 3));
        }

        System.out.println("appleBox1 = " + appleBox1.getWeight());
        System.out.println("appleBox2 = " + appleBox2.getWeight());
        System.out.println("orangeBox1 = " + orangeBox1.getWeight());
        System.out.println("orangeBox2 = " + orangeBox2.getWeight());
        System.out.println();

        System.out.printf("appleBox1 == orangeBox1 - %b\n", appleBox1.compare(orangeBox1));
        System.out.printf("appleBox2 == orangeBox2 - %b\n", appleBox2.compare(orangeBox2));
        System.out.println();

        System.out.println(orangeBox1);
        System.out.println(orangeBox2);
        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println();

        orangeBox1.transferToBox(orangeBox2);

        System.out.println(orangeBox1);
        System.out.println(orangeBox2);

    }
}
