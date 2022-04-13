import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
  JLabel felirat;
  JLabel nevjegyLabel;
  JButton mehetGomb;
  JTextField bevitel;
  public MainFrame() {
    this.setComponent();
    this.setFrame();
  }


  private void setComponent() {
    this.felirat = new JLabel("我的生日是二零零一年十月三十日");
    this.felirat.setBounds(30, 30, 1000, 50);
    this.nevjegyLabel = new JLabel();
    this.nevjegyLabel.setText("我的心");

    Dimension dim = new Dimension(30, 70);
    Point point = new Point(30, 70);
    this.nevjegyLabel.setSize(dim);
    this.nevjegyLabel.setLocation(point);
    
    
    //gomb:
    this.mehetGomb = new JButton("我爱你");
    this.mehetGomb.setBounds(30, 110, 70, 30);
    this.mehetGomb.addActionListener(event-> mehetGombClick());

    this.bevitel = new JTextField();
    this.bevitel.setBounds(30, 150, 120, 30);
  }

  private void setFrame() {
    this.nevjegyLabel.setBounds(30, 70, 100, 30);
    this.setLayout(null);
    this.setLocation(500, 500);
    this.add(this.felirat);
    this.add(this.nevjegyLabel);
    this.add(this.mehetGomb);
    this.add(bevitel);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400,300);
    this.setVisible(true);
    this.setTitle("你会说匈牙利语吗？");
  }

  private void mehetGombClick() {
    String szoveg = this.bevitel.getText();
    this.setTitle(szoveg);
    this.bevitel.setText("");
    
  }
    
}
