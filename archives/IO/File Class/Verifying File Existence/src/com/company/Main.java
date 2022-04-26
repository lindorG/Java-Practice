package com.company;

import java.io.File;

public class Main {

        public static void main(String[] args) {

                // file = An abstract representation of file and directory pathnames

                // "File" creates an import
                File f1 = new File("secret_message.txt");
                File f2 = new File("C:/Users/Lindor/Desktop/secret_message.txt");

                // Since f1 is a file, you can check if it exist using exist() function
                if(f1.exists()) {
                        System.out.println("That file exist! :O");
//                        just seems to print the file name + extension
                        System.out.println(f1.getPath());
//                        exact file path
                        System.out.println(f1.getAbsoluteFile());
//                        boolean to verify file existence
                        System.out.println(f1.isFile());
//                        deletes the file (WARNING)
//                        f1.delete();

                }
                else {
                        System.out.println("That file doesn't exist :(");
                }
                if(f2.exists()) {
                        System.out.println("That file exist! :O");
                        System.out.println(f1.getPath());
                }
                else {
                        System.out.println("That file doesn't exist :(");
                }
        }
}
