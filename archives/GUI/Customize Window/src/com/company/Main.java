package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

        public static void main(String[] args) {
                MyFrame myFrame = new MyFrame();
                System.out.println(myFrame);


//
////                JFrame = a GUI window to add components to
//
//                JFrame frame = new JFrame(); //creates a frame
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application - X button
////                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // hide application - X button
////                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // X button does not function (Hacky)
//                frame.setTitle("JFrame title goes here"); // sets title of frame
//                frame.setSize(314,314); // sets the x-dimension, and y-dimension of frame
//                frame.setVisible(true); // makes frame visible
//
//                ImageIcon image = new ImageIcon("amg.png"); // create an ImageIcon (ico)
//                frame.setIconImage(image.getImage()); // change icon of frame
//
////                frame.getContentPane().setBackground(Color.green); // change color of background to Green - Describe
////                frame.getContentPane().setBackground(new Color(0, 0, 0)); // change color of background to Black - RGB (255, 255, 255) is White
//                frame.getContentPane().setBackground(new Color(0xFFFFFF)); // Hexadecimal Color Value / HTML Color Code
        }
}
