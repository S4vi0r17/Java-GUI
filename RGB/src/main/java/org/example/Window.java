package org.example;

import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import javax.swing.text.rtf.RTFEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Window extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton redButton, greenButton, blueButton;
    private int pulsado = 0, redCounter = 0, greenCounter = 0, blueCounter = 0;
    public Window(){
        setSize(600, 400);
        setTitle("RGB");
        setLocationRelativeTo(null);
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponents(){
        colocarPanel();
        colocarLabel();
        colocarBotones();
    }
    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        eventoRuedaMouse();
    }
    private void colocarLabel(){
        label = new JLabel("Color (Rojo, Verde, Azul)");
        label.setBounds(100,30,400,50);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Roboto-Regular", Font.PLAIN,20));
        // Font
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
    }
    private void colocarBotones(){

        redButton = new JButton("Red");
        redButton.setBounds(50, 230, 130, 50);
        redButton.setForeground(Color.RED);
        redButton.setFont(new Font("Roboto",Font.BOLD,20));
        panel.add(redButton);

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pulsado = 1;
            }
        });


        greenButton = new JButton("Green");
        greenButton.setBounds(230, 230, 130, 50);
        greenButton.setForeground(Color.GREEN);
        greenButton.setFont(new Font("Roboto",Font.BOLD,20));
        panel.add(greenButton);


        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pulsado = 2;
            }
        });


        blueButton = new JButton("Blue");
        blueButton.setBounds(410, 230, 130, 50);
        blueButton.setForeground(Color.BLUE);
        blueButton.setFont(new Font("Roboto",Font.BOLD,20));
        panel.add(blueButton);

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pulsado = 3;
            }
        });
    }
    private void eventoRuedaMouse(){
        MouseWheelListener e = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
                if (pulsado != 0){
                    if (pulsado == 1){
                        redCounter -= mouseWheelEvent.getWheelRotation();
                        if (redCounter < 0){
                            redCounter = 0;
                        }
                        if (redCounter > 255){
                            redCounter = 255;
                        }
                    } else if (pulsado == 2) {
                        greenCounter -= mouseWheelEvent.getWheelRotation();
                        if (greenCounter < 0){
                            greenCounter = 0;
                        }
                        if (greenCounter > 255){
                            greenCounter = 255;
                        }
                    }else {
                        blueCounter -= mouseWheelEvent.getWheelRotation();
                        if (blueCounter < 0){
                            blueCounter = 0;
                        }
                        if (blueCounter > 255){
                            blueCounter = 255;
                        }
                    }
                }
                label.setText("RGB ("+ redCounter + ", "+ greenCounter + ", " + blueCounter + ")");
                panel.setBackground(new Color(redCounter,greenCounter,blueCounter));
            }
        };
        panel.addMouseWheelListener(e);
    }
}
