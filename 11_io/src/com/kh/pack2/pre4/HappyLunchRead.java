package com.kh.pack2.pre4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HappyLunchRead {

    public void readTxt(String path, String fileName) {

        try{
            FileReader fr = new FileReader(path + fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e.getMessage());

        }  catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        }

    }
}
