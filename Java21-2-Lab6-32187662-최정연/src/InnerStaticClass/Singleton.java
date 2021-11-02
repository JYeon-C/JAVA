package InnerStaticClass; // 동일한 hashcode를 넘겨주고, 속도는 더 느림.

public class Singleton {
    private static class SingletonHolder{ // Singleton 인스턴스를 만들기 위한 static class를 생성
        private static final Singleton inst = new Singleton(); // 만들면서 인스턴스를 상수로 만들음
    }

    private Singleton() {
        System.out.println("Inner StaticClass singleton constructor");
    }
    public static Singleton getInstance() {
        return SingletonHolder.inst; // SingletonHolder의 instance를 return
    }
    public void print() { // SingletonHolder.inst.hashCode() 출력
        System.out.println("Inner StaticClass singleton instance hashcode" + SingletonHolder.inst.hashCode());
    }
}
