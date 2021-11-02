package LazyInitialization; // double checked locking 방식
// 동일한 인스턴스를 넘겨준다. 시간은 대폭 감소.
// Eager은 static을 쓰기 때문에 리소스 퍼포먼스 면에선 좀 떨어짐

public class Singleton {
    private static volatile Singleton inst = null; // 인스턴스가 volatile
    private Singleton() {
        System.out.println("Lazy Initialization singleton constructor");
    }
    public static Singleton getInstance() {
        if(inst == null) { // if문 내에 synchronized block 삽입
            synchronized (Singleton.class){ // Singleton.class 삽입
                if(inst == null) { // 인스턴스가 null이면, new Singleton
                    inst = new Singleton();
                }
            }
        }
        return inst;
    }
    public void print() {
        System.out.println("Lazy Initialization singleton instance hashcode" + inst.hashCode());
    }
}
