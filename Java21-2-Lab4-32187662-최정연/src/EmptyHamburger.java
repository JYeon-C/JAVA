import java.awt.*;

public class EmptyHamburger extends Hamburger{
    public EmptyHamburger() {
        description = "EmptyHamburger";
    }

    @Override
    void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double cost() {
        return 0;
    }
    @Override
    public void paintComponent(Graphics g) {

    }
}
