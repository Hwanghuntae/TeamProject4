import javax.swing.*;
import java.awt.*;
public class TextFieldEx extends JFrame {
    private String [] grade = {"1학년", "2학년", "3학년", "4학년"};
    private JTextArea ta = new JTextArea(7, 20);
    public TextFieldEx() {
        setTitle("텍스트필드 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("이름 "));
        c.add(new JTextField(20));
        c.add(new JLabel("학과 "));
        c.add(new JTextField("글로벌소프트웨어 ", 20));
        c.add(new JLabel("주소 "));
        c.add(new JTextField("경기도 ...", 20));
        c.add(new JLabel("학년 "));
        JComboBox<String> strCombo = new JComboBox<String>(grade);
        c.add(strCombo);
        JButton addBtn = new JButton("추가");
        c.add(addBtn);
        JButton closeBtn = new JButton("close");
        c.add(closeBtn);
        c.add(new JScrollPane(ta));
        
        setSize(300,150);
        setVisible(true);
    }

    
}