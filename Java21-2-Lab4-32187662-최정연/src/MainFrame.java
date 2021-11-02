import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame implements ActionListener { // JFrame을 상속하고 ActionListener를 구현
    Hamburger hamburger = new EmptyHamburger(); // default
    JButton[] button = new JButton[9]; // 9개의 JButton 버튼 생성
    JPanel displayPanel = new JPanel(new BorderLayout()); // JPanel을 BorderLayout 형태로 생성


    public MainFrame() { // MainFrame 생성
        setTitle("Hamburger Stack"); // Title 이름 설정
        setSize(700, 700);  // 높이 700, 넓이 700의 크기 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우를 닫으면 프로그램을 종료하도록 설정

        JLabel label = new JLabel("햄버거에 무엇을 추가하시겠습니까?"); // JLabel 추가
        displayPanel.add(label, BorderLayout.NORTH); // lable을 패널에 추가 및 위치 지정
        setContentPane(displayPanel); // 생성한 panel 패널을 컨텐트팬으로 사용


        button[0] = new JButton("BeefPatty"); // BeefPatty 버튼 추가 
        button[0].addActionListener(this);
        button[1] = new JButton("ChickenPatty");  // ChickenPatty 버튼 추가 
        button[1].addActionListener(this);
        button[2] = new JButton("ShrimpPatty");  // ShrimpPatty 버튼 추가 
        button[2].addActionListener(this);
        button[3] = new JButton("Cheese"); // Cheese 버튼 추가 
        button[3].addActionListener(this);
        button[4] = new JButton("Lettuce"); // Lettuce 버튼 추가 
        button[4].addActionListener(this);
        button[5] = new JButton("Tomato"); // Tomato 버튼 추가 
        button[5].addActionListener(this);
        button[6] = new JButton("Onion"); // Onion 버튼 추가 
        button[6].addActionListener(this);
        button[7] = new JButton("Start Stack Burger"); // Start Stack Burger 버튼 추가 -> BottomBun 생성
        button[7].addActionListener(this);
        button[8] = new JButton("Finish"); // Finish 버튼 추가 -> Top Bun 생성
        button[8].addActionListener(this);

        for (JButton value : button) { // 모든 버튼을 비활성화
            value.setEnabled(false);
        }

        button[7].setEnabled(true); // Start Stack Burger 버튼만 활성화

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1)); // 테이블 형식 행, 열
        for (JButton jButton : button) { // 버튼을 buttonPanel에 추가
            buttonPanel.add(jButton);
        }
        displayPanel.add(buttonPanel, BorderLayout.SOUTH); // displayPanel에 buttonPanel 부착 후 위치 지적
        setVisible(true); // JFrame을 보이게 설정
    }

    @Override
    public void actionPerformed (ActionEvent e){ // actionPerformed 메소드 생성
            if (e.getSource() == button[0]) { // BeefPatty 버튼 클릭
                displayPanel.remove(hamburger);// remove previous one
                hamburger = new BeefPatty(hamburger); // BeefPatty 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate(); // remove를 호출하면 revalidate, repaint 함께 호출
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");
            }
            else if(e.getSource() == button[1]){ // ChickenPatty 버튼 클릭
                displayPanel.remove(hamburger);// remove previous one
                hamburger = new ChickenPatty(hamburger); // ChickenPatty 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate();
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");
            }
            else if(e.getSource() == button[2]) { // ShrimpPatty 버튼 클릭
                displayPanel.remove(hamburger);// remove previous one
                hamburger = new ShrimpPatty(hamburger); // ShrimpPatty 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate();
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");
            }
            else if(e.getSource() == button[3]) { // Cheese 버튼 클릭
                displayPanel.remove(hamburger);// remove previous one
                hamburger = new CheeseTopping(hamburger); // CheeseTopping 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate();
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");
            }
            else if(e.getSource() == button[4]) { // Lettuce 버튼 클릭
                displayPanel.remove(hamburger);// remove previous one
                hamburger = new LettuceTopping(hamburger); // LettuceTopping 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate();
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");
            }
            else if(e.getSource() == button[5]) { // Tomato 버튼 클릭
                displayPanel.remove(hamburger);// remove previous one
                hamburger = new TomatoTopping(hamburger); // TomatoTopping 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate();
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");
            }
            else if(e.getSource() == button[6]) { // Onion 버튼 클릭
                displayPanel.remove(hamburger);// remove previous one
                hamburger = new OnionTopping(hamburger); // OnionTopping 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate();
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");
            }
            else if(e.getSource() == button[7]) { // Start Stack Burger 버튼 클릭
                hamburger = new BottomBun(); // BottomBun 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate();
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");

                for (JButton jButton : button) { // Start Stack Burger 버튼을 클릭하면 다른 버튼 활성화
                    jButton.setEnabled(true);
                }
            }
            else if(e.getSource() == button[8]) { // Finish 버튼 클릭
                displayPanel.remove(hamburger);
                hamburger = new TopBun(hamburger); // TopBun 생성
                displayPanel.add(hamburger); // add new selected hamburgerIngredient
                displayPanel.revalidate();
                displayPanel.repaint();
                System.out.println(hamburger.getDescription() + " " + hamburger.cost() + " won");
            }
    }

        public static void main (String[]args){
        new MainFrame();
        }
    }




