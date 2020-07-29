package lesson5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;

public class Car implements Runnable {
    private static final AtomicBoolean WIN = new AtomicBoolean(true);
    private static int CARS_COUNT;


    static {
        CARS_COUNT = 0;
    }


    private final Race race;
    private final int speed;
    private final String name;
    private final CyclicBarrier barrier;
//    private final ArrayBlockingQueue<Stage> stages;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier barrier) {
        this.race = race;
        this.speed = speed;
        this.barrier = barrier;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            barrier.await();

            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            if (WIN.get()) {
                System.out.println(this.name + " WIN!!!");
                WIN.set(false);
            }

            barrier.await();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
