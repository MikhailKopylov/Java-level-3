package lesson1.task3;

import lesson1.task3.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    List<T> boxFruit;
    private final String name;

    public Box(String name) {
        this.boxFruit = new ArrayList<>();
        this.name = name;
    }

    public void addFruit(T fruit) {
        boxFruit.add(fruit);
    }

    public float getWeight() {
        return boxFruit.size() * boxFruit.get(0).getWeightFruit();
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.00001;
    }

    public void transferToBox(Box<T> box) {
        for (int i = boxFruit.size() - 1; i >= 0; i--) {
            box.addFruit(boxFruit.remove(i));
        }
    }

    @Override
    public String toString() {
        return "Box " + name +" {" + boxFruit + '}';
    }
}
