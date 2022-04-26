package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both


        ImageIcon image = new ImageIcon("amg.png");
        Border border = BorderFactory.createLineBorder(Color.green,3); // manipulation of border window

        JLabel label = new JLabel(); // create a label
        label.setText("Imposter Syndrome"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image icon
        label.setForeground(new Color(0xffffff)); // set font color
        label.setFont(new Font("Georgia", Font.ITALIC, 40)); // set font, style, size
        label.setIconTextGap(-25); // set background color
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color that was set in line 25
        label.setBorder(border); // display border in line 15
        // the two lines of code cause the text + image to automatically re-align to the center
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
//        label.setBounds(0, 0, 250, 250); // binds the alignment to a specific position rather than auto-aligns, if preferable

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
//        frame.setLayout(null); // nullifies all implementations
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); // creates a default window size dependent on the size of its contents. another alternative, similar to set bounds

    }
}