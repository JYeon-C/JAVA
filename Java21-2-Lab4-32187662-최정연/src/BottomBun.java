import javax.swing.*;
import java.awt.*;

public class BottomBun extends Hamburger{
    Image image;

    public BottomBun() {
        super();
        description = "Bottom Bun";
        ImageIcon bottomIcon = new ImageIcon("C:\\Users\\rogiw\\Desktop\\HW4-image\\BottomBun.png");
        image = bottomIcon.getImage();
    }

    @Override
    void setDescription(String description) {
        this.description = description;

    }

    @Override
    public double cost() {
        return 1000.0;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g; // Graphics2D 객체로 형 변환
        g2.drawImage(image,200,350,230,200,this);

    }
}
