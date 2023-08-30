package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Window extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private int counter;
    public Window() {
        setSize(400,450);
        setTitle("Click Counter");
        setLocationRelativeTo(null);

        components();

        setDefaultCloseOperation(3);
    }
    private void components() {
        // Panel
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(247, 242, 250));
        this.add(panel); // This = Window
        // Labels
        label = new JLabel();
        label.setBounds(0, 50, 400, 40);
        label.setText("Click button");
        label.setHorizontalAlignment(0); // 0 = SwingConstants.CENTER

        // Colocando la fuente
        InputStream is = Window.class.getResourceAsStream("/fonts/Roboto-Italic.ttf");
        Font sizedFont = null;
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            sizedFont = font.deriveFont(20f);


        } catch (Exception e) {
            e.printStackTrace();
        }
        label.setFont(sizedFont); // aplicar fuente

        panel.add(label);

        // Button
        button = new JButton();
        button.setBounds(125, 250, 150, 50);
        button.setText("Click here");
        button.setFont(sizedFont.deriveFont(20f));
        button.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(231, 222, 247));
        button.setForeground(new Color(28, 28, 32));
        // Degradados
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);


        panel.add(button);

        //Events
        ActionListener event = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter++;
                if (counter==1){
                    label.setText("You have pressed the button once");
                }else {
                    label.setText("You have pressed the button once " + counter + " times");
                }
            }
        };
        button.addActionListener(event);
    }
}
