package lesson1.task3.fruits;

public abstract class Fruit {
    private final int id;

    public Fruit(int id) {
        this.id = id;
    }

    public abstract float getWeightFruit();

    public int getId() {
        return id;
    }
}
