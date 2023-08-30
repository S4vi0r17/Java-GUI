package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.InputStream;

public class Window extends JFrame {
    private JLabel label, img;
    private JTextArea description;
    private JPanel panel;
   private JRadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5;
    public Window() {
        setSize(700,550);
        setTitle("linux distros");
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();
    }
    private void initComponents(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(233, 244, 240));
        this.add(panel);

        // Labels
        label = new JLabel("Choose a distribution");
        label.setBounds(200,20,300,40);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(new Color(16, 122, 99));
        InputStream inputStream = Window.class.getResourceAsStream("/fonts/Roboto-Regular.ttf");
        Font sizedFont = null;
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, inputStream);
            sizedFont = font.deriveFont(35f);
            label.setFont(sizedFont);

        } catch (Exception e) {
            e.printStackTrace();
        }
        panel.add(label);

        // Radio buttons

        radioButton1 = new JRadioButton("Arch");
        radioButton1.setBounds(90,450,95,40);
        radioButton1.setFont(sizedFont.deriveFont(20f));
        radioButton1.setFocusPainted(false);
        radioButton1.setBackground(new Color(233, 244, 240));
        radioButton1.setForeground(new Color(178, 203, 195));
        panel.add(radioButton1);

        radioButton2 = new JRadioButton("Ubuntu");
        radioButton2.setBounds(200,450,95,40);
        radioButton2.setFont(sizedFont.deriveFont(20f));
        radioButton2.setFocusPainted(false);
        radioButton2.setBackground(new Color(233, 244, 240));
        radioButton2.setForeground(new Color(178, 203, 195));
        panel.add(radioButton2);

        radioButton3 = new JRadioButton("Mint");
        radioButton3.setBounds(324,450,95,40);
        radioButton3.setFont(sizedFont.deriveFont(20f));
        radioButton3.setFocusPainted(false);
        radioButton3.setBackground(new Color(233, 244, 240));
        radioButton3.setForeground(new Color(178, 203, 195));
        panel.add(radioButton3);

        radioButton4 = new JRadioButton("Debian");
        radioButton4.setBounds(420,450,95,40);
        radioButton4.setFont(sizedFont.deriveFont(20f));
        radioButton4.setFocusPainted(false);
        radioButton4.setBackground(new Color(233, 244, 240));
        radioButton4.setForeground(new Color(178, 203, 195));
        panel.add(radioButton4);

        radioButton5 = new JRadioButton("Fedora");
        radioButton5.setBounds(530,450,95,40);
        radioButton5.setFont(sizedFont.deriveFont(20f));
        radioButton5.setFocusPainted(false);
        radioButton5.setBackground(new Color(233, 244, 240));
        radioButton5.setForeground(new Color(178, 203, 195));
        panel.add(radioButton5);

        // Agrupando
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);
        group.add(radioButton5);

       actionEvent();

    }
    private void actionEvent(){
        img = new JLabel();
        img.setBounds(223,80,250,250);
        panel.add(img);

        ImageIcon archimg = new ImageIcon(Window.class.getResource("/img/arch.png"));
        ImageIcon ubuntuimg = new ImageIcon(Window.class.getResource("/img/ubuntu.png"));
        ImageIcon mintimg = new ImageIcon(Window.class.getResource("/img/mint.png"));
        ImageIcon debianimg = new ImageIcon(Window.class.getResource("/img/debian.png"));
        ImageIcon fedoraimg = new ImageIcon(Window.class.getResource("/img/fedora.png"));


        // Texto
        description = new JTextArea();
        description.setBounds(200,350,300,50);
        // Configurar propiedades del área de texto
        description.setLineWrap(true); // Romper líneas automáticamente
        description.setWrapStyleWord(true); // Romper palabras completas
        description.setFont(new Font("Arial", Font.PLAIN, 14)); // Cambiar la fuente si lo deseas
        description.setEditable(false); // Hacer el área de texto no editable
        description.setEditable(false);
        description.setAlignmentX(Component.CENTER_ALIGNMENT);
        description.setAlignmentY(Component.CENTER_ALIGNMENT);
        description.setOpaque(false);
        description.setBackground(new Color(0, 0, 0, 0)); // Establecer un color de fondo transparente

        // Fuente
        InputStream is = Window.class.getResourceAsStream("/fonts/Roboto-MediumItalic.ttf");
        Font sizedFont = null;
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            sizedFont = font.deriveFont(15f);
            description.setFont(sizedFont);

        } catch (Exception e) {
            e.printStackTrace();
        }
        description.setForeground(new Color(28, 151, 122));
        panel.add(description);

        // Boton 1
        ActionListener actionListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(archimg.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
                label.setText("Arch Linux");

                description.setText("Rolling release, minimal base, emphasizes simplicity and control, aimed at experienced users.");

            }
        };

        radioButton1.addActionListener(actionListener1);

        // Boton 2
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(ubuntuimg.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
                label.setText("Ubuntu");

                description.setText("Popular and beginner-friendly, focuses on ease of use, offers LTS versions, and has a strong community. Various desktop editions, including GNOME.");

            }
        };

        radioButton2.addActionListener(actionListener2);

        // Boton 3
        ActionListener actionListener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(mintimg.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
                label.setText("Linux Mint");

                description.setText("Based on Ubuntu, offers user-friendly experience, comes in Cinnamon and Mate editions, prioritizes familiarity and stability.");

            }
        };

        radioButton3.addActionListener(actionListener3);

        // Boton 4
        ActionListener actionListener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(debianimg.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
                label.setText("Ubuntu");

                description.setText("Commitment to free software, stable and versatile, provides different branches for stability levels: Stable, Testing, and Unstable.");

            }
        };

        radioButton4.addActionListener(actionListener4);

        // Boton 5
        ActionListener actionListener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                img.setIcon(new ImageIcon(fedoraimg.getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH)));
                label.setText("Fedora");

                description.setText("Sponsored by Red Hat, emphasizes innovation, acts as a testing ground for new technologies, balances new features with stability.");

            }
        };

        radioButton5.addActionListener(actionListener5);
    }
}
