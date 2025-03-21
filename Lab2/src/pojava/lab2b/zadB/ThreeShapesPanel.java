package pojava.lab2b.zadB;

import pojava.lab2b.zadA.CloseableFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class ThreeShapesPanel extends JPanel {
    private final Color[] colors = new Color[3];
    public ThreeShapesPanel() {
        Random random = new Random();
        for (int i = 0; i < colors.length; i++) {
            colors[i] = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // koło
        g.setColor(colors[0]);
        g.fillOval(100, 100, 100, 100);

        // kwadrat
        g.setColor(colors[1]);
        g.fillRect(200, 200, 100, 100);

        // trójkąt
        g.setColor(colors[2]);
        int[] x = {100, 150, 200};
        int[] y = {400, 300, 400};
        g.fillPolygon(x, y, 3);
    }


    public static void main(String[] args) {
        CloseableFrame frame = new CloseableFrame();
        frame.setLayout(new GridLayout(1, 2));

        ThreeShapesPanel shapesPanel = new ThreeShapesPanel();
        shapesPanel.setBackground(Color.white);
        frame.add(shapesPanel);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(4, 1));
        controlPanel.add(new JButton("Button 1"));
        controlPanel.add(new JButton("Button 2"));
        controlPanel.add(new JLabel("Label 1"));
        controlPanel.add(new JTextField("Text Field"));


        frame.add(controlPanel);

        frame.setVisible(true);
    }
}
