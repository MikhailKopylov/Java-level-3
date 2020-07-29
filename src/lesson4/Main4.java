package lesson4;

public class Main4 {
    static String s = "A";
    static final Object mon = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (mon) {
                    while (!s.equals("A")) {
                        try {
                            mon.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(s);
                    s = "B";
                    mon.notify();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (mon) {
                    while (!s.equals("B")) {
                        try {
                            mon.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(s);
                    s = "C";
                    mon.notify();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                synchronized (mon) {
                    while (!s.equals("C")) {
                        try {
                            mon.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(s);
                    s = "A";
                    mon.notifyAll();
                }
            }
        }).start();
    }
}
