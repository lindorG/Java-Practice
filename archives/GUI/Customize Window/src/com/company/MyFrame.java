package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
//                JFrame = a GUI window to add components to
        this.setTitle("JFrame title goes here"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application - X button
//        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // hide application - X button
//        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // X button does not function (Hacky)
        this.setSize(314,314); // sets the x-dimension, and y-dimension of frame
        this.setVisible(true); // makes frame visible

        ImageIcon image = new ImageIcon("amg.png"); // create an ImageIcon (ico)
        this.setIconImage(image.getImage()); // change icon of frame

        this.getContentPane().setBackground(new Color(0xFFFFFF)); // Hexadecimal Color Value / HTML Color Code
//        this.getContentPane().setBackground(Color.green); // change color of background to Green - Describe
//        this.getContentPane().setBackground(new Color(0, 0, 0)); // change color of background to Black - RGB (255, 255, 255) is White
    }

}

