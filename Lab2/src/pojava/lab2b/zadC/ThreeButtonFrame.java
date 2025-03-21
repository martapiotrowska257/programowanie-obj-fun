package pojava.lab2b.zadC;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ThreeButtonFrame extends JFrame {

    public ThreeButtonFrame() throws HeadlessException {
        this.setSize(640, 480);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        this.add(panel);
        panel.setLayout(new GridLayout(2, 3));

        JButton exitButton = new JButton("Zamknij program");
        exitButton.addActionListener(e -> {System.exit(0);});
        panel.add(exitButton);

        JButton changeTitle = new JButton("Zmień tytuł okna");
        changeTitle.addActionListener(e -> {
            Random random = new Random(); this.setTitle(String.valueOf(random.nextInt(100)));});
        panel.add(changeTitle);

        JButton changeBackgroundColor = new JButton("Zmień kolor tła");
        changeBackgroundColor.addActionListener(e -> {
            Random color = new Random();
            panel.setBackground(new Color(color.nextInt(256), color.nextInt(256), color.nextInt(256)));
        });
        panel.add(changeBackgroundColor);

    }

    public static void main(String[] args) {
        ThreeButtonFrame frame = new ThreeButtonFrame();
        frame.setVisible(true);

    }
}
