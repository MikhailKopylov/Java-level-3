package lesson1.task3.fruits;

public class Orange extends Fruit {
    public static final float WEIGHT_ORANGE =1.5f;

    public Orange(int id) {
        super(id);
    }


    @Override
    public float getWeightFruit() {
        return WEIGHT_ORANGE;
    }

    @Override
    public String toString() {
        return "Orange " + getId();
    }

}
