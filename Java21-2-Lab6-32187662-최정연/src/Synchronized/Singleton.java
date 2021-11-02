package Synchronized; // 다 동일한 Singleton 인스턴스를 넘겨줌

public class Singleton {
    private static Singleton inst = null;
    private Singleton() {
        System.out.println("Threadsafe singleton constructor");
    }
    public static synchronized Singleton getInstance() { // synchronized 부분 추가
        if(inst == null) {
            inst = new Singleton();
        }
        return inst;
    }
    public void print() {
        System.out.println("Threadsafe singleton instance hashcode" + inst.hashCode());
    }
}
