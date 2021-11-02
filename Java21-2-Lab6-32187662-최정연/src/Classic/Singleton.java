package Classic; // 여러 개의 쓰레드가 동시 실행 되면서 다들 인스턴스를 하나씩 생성함

public class Singleton {
    private static Singleton inst = null; // Singleton 타입 instance는 null
    private Singleton() {
        System.out.println("classic singleton constructor"); // 디폴트 생성자
    }
    public static Singleton getInstance() { // Singleton 리턴
        if(inst == null) { // 인스턴스가 null이면 인스턴스를 생성
            inst = new Singleton();
        }
        return inst; // 아니면 그냥 return
    }
    public void print() { // inst.hashCode 출력
        System.out.println("classic singleton instance hashcode" + inst.hashCode());
    }
}
