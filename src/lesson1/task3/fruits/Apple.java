package lesson1.task3.fruits;

public class Apple extends Fruit {
    public static final float WEIGHT_APPLE =1.0f;

    public Apple(int id) {
        super(id);
    }


    @Override
    public float getWeightFruit() {
        return WEIGHT_APPLE;
    }

    @Override
    public String toString() {
        return "Apple " + getId();
    }

}
