package Eagerinitialization; // 동일한 Thread에 safe하게 같은 인스턴스를 생성

public class Singleton {
    private static Singleton inst = new Singleton(); // null이 아닌 new Singleton
    private Singleton() {
        System.out.println("Eager Initialization singleton constructor");
    }

    public static Singleton getInstance() {
        return inst;
    }

    public void print() {
        System.out.println("Eager Initialization singleton instance hashcode" + inst.hashCode());
    }
}
