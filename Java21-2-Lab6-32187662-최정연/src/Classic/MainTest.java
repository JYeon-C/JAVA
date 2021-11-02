package Classic;

import java.time.Duration;
import java.time.Instant;

public class MainTest {
    static final int numThread = 5; // number of Tread 5개 생성
    public static void main(String[] args) {
        Instant startTime = Instant.now(); // 시작 시간 startTime
        Thread[] th = new Thread[numThread]; // Thread를 생성하기 위한 Array 생성
        for(int i = 0; i<numThread; i++) { // for loop를 돌면서 Thread 생성
            th[i] = new Thread(new Runnable() { // 각각의 객체를 생성. Runnable 객체를 무명 메소드로 생성

                @Override
                public void run() { // run내부에 Singleton 인스턴스 생성
                    Singleton inst = Singleton.getInstance(); // private이니 new Singleton불가능
                    inst.print(); // instance를 print하여 Hashcode를 확인
                    // Integer클래스 사용
                    // toHexString사용 : 인스턴스에 있는 hashcode를 사용
                    System.out.println(Integer.toHexString(System.identityHashCode(inst)));
                }
            });
            th[i].start(); // Tread 시작
        }

        for(Thread t : th) { // 모든 Thread들이 끝날 때까지 join을 해주는 것
            try {
                t.join(); // 모든 Thread를 join
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Instant endTime = Instant.now(); // 끝나는 시간 endTime
        long elapseTime = Duration.between(startTime, endTime).toMillis(); // elapseTime 계산
        System.out.println(elapseTime + "ms");
    }
}
