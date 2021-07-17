package Mod7.SwingGUI;

import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        // создаем окно
//        JFrame jf = new JFrame();
        MyFrame jf = new MyFrame();
        // устанавливаем ему размеры
        jf.setSize(400, 300);
        jf.addMouseListener(new SimpleClickListener());
        // и показываем его
        jf.setVisible(true);
    }
}
