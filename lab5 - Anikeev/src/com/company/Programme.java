package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Programme extends JFrame {
    public Programme(String[] args) throws IOException {
        setLayout(new FlowLayout());
        setSize(1000, 900);
        BufferedImage image = ImageIO.read(new File(args[0]));
        JLabel label = new JLabel(new ImageIcon(image));
        add(label);
        setVisible(true);
    }

}
