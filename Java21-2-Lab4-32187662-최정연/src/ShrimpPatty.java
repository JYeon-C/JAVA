import javax.swing.*;
import java.awt.*;

public class ShrimpPatty extends HamburgerIngredient{
    public ShrimpPatty(Hamburger hamburger){
        this.hamburger = hamburger;
        ImageIcon bottomIcon = new ImageIcon("C:\\Users\\rogiw\\Desktop\\HW4-image\\ShrimpPatty.png");
        image = bottomIcon.getImage();
    }

    @Override
    void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double cost() {
        return this.hamburger.cost() + 2000.0;
    }

    @Override
    public void paintComponent(Graphics g) {
        hamburger.paintComponent(g); // decorated paintComponent
        Graphics2D g2 = (Graphics2D)g;
        if(image !=null) g2.drawImage(image,200,250,270,200,this);

    }

    @Override
    public String getDescription() {
        return this.hamburger.getDescription() + " ShrimpPatty";
    }
}
