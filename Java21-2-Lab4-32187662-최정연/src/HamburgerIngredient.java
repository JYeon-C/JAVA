import java.awt.*;// Image를 사용하기 위해 import

public abstract class HamburgerIngredient extends Hamburger{
    protected Hamburger hamburger; // 햄버거를 extends
    Image image; // Image를 가지고 있음

     public abstract String getDescription();
}
