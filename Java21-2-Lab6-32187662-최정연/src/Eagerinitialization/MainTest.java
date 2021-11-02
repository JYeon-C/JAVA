package Eagerinitialization;

import java.time.Duration;
import java.time.Instant;

public class MainTest {
    static final int numThread = 5;
    public static void main(String[] args) {
        Instant startTime = Instant.now();
        Thread[] th = new Thread[numThread];
        for(int i = 0; i<numThread; i++) {
            th[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton inst = Singleton.getInstance();
                    inst.print();
                    System.out.println(Integer.toHexString(System.identityHashCode(inst)));

                }
            });
            th[i].start();
        }
        for(Thread t : th) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Instant endTime = Instant.now();
        long elapseTime = Duration.between(startTime, endTime).toMillis();
        System.out.println(elapseTime + "ms");
    }
}
