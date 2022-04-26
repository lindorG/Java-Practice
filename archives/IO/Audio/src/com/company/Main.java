package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
                Scanner scanner = new Scanner(System.in);

                File file = new File("AMG.wav");
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);

                String response = "";


                while(!response.equals("Q")) {
                        System.out.println("P = Play, S = Stop, R = Reset, Q  = Quit");
                        System.out.print("Enter your choice: ");

                        response = scanner.next();
                        response = response.toUpperCase();

                        // Ideal audio inquirer
                        switch (response) {
                                case ("P"):
                                        clip.start();
                                        break;
                                case ("S"):
                                        clip.stop();
                                        break;
                                case ("R"):
                                        clip.setMicrosecondPosition(0);
                                        break;
                                case ("Q"):
                                        clip.close();
                                        break;
                                default:
                                        System.out.println("Not a valid response");
                        }
                }
                System.out.println("Bye");


//                Basic inquiry regarding played audio

//                clip.start();
//                System.out.println("Do you like this song?");
//                String response = scanner.next();
//                if (response.equalsIgnoreCase("Yes")) {
//                        System.out.println("Great, me too.");
//                } else if (response.equalsIgnoreCase("No")) {
//                        System.out.println("You're no fun");
//                } else {
//                        System.out.println("Invalid Response.\nHUMAN MUST BE TERMINATED\n34@!#!@SUSSY#QAEaqe");
//                }
        }
}
