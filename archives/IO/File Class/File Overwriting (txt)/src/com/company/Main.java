package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

        public static void main(String[] args) {
                // The FileWriter class requires a try&catch block
                try {
                        FileWriter writer = new FileWriter("poem.txt");
                        writer.write("Roses are red\nViolets dodges\nWeird reference above");
                        writer.append("\n(A nonsensical poem by god knows who)");
                        writer.close();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
