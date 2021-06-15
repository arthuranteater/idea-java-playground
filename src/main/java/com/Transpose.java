package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Transpose {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public Transpose(String filename) throws FileNotFoundException {
        //creating File instance to reference text file in Java
        File file = new File(String.valueOf(Paths.get(filename)));

        //Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(file);

        //Reading each line of file using Scanner class
        int lineNumber = 1;
        StringBuilder res = new StringBuilder();
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            res.append(line);
            lineNumber++;
        }

        setText(res.toString());


    }
}
