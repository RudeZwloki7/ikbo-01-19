package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWR {
    final String path = "file.txt";

    public void write(String text, boolean append) {
        try (FileWriter writer = new FileWriter(path, append)) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read() {
        try (FileReader reader = new FileReader(path)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }

    public void replace(String text){
        write(text, false);
    }

    public void add (String text){
        write(text, true);
    }

}
