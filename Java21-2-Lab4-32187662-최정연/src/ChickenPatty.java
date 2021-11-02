import javax.swing.*;
import java.awt.*;

public class ChickenPatty extends HamburgerIngredient{
    public ChickenPatty(Hamburger hamburger) { // hamburger, image 설정
        this.hamburger = hamburger;
        ImageIcon bottomIcon = new ImageIcon("C:\\Users\\rogiw\\Desktop\\HW4-image\\ChickenPatty.png");
        image = bottomIcon.getImage();
    }
    @Override
    void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double cost() {
        return this.hamburger.cost() + 2500.0;
    }

    @Override
    public void paintComponent(Graphics g) {
        hamburger.paintComponent(g); // decorated paintComponent
        Graphics2D g2 = (Graphics2D)g; // Graphics2D 객체로 형 변환
        if(image !=null) g2.drawImage(image,200,250,270,200,this);

    }

    @Override
    public String getDescription() {
        return this.hamburger.getDescription() + " ChickenPatty";
    }
}
