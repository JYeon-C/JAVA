import javax.swing.*;
import java.awt.*;
// paintComponent를 가지고 그림을 그리기 가능

public abstract class Hamburger extends JPanel { // JPanel 상속
    String description = "Hamburger";

    abstract void setDescription(String description);

     public String getDescription() { // 추가 된 정보를 보여주는 getDescription
         return description;
     }

    public abstract double cost(); // double형 추상 메소드 cost 정의
    public abstract void paintComponent(Graphics g); // Graphic g를 인자로 받는 paintComponent 추상 메소드 정의
}
