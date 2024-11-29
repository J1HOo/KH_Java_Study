package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {

    public void readTxt(String path, String fileName){
        String paths = path + fileName;
        try (BufferedReader br = new BufferedReader(new FileReader(paths))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("오류가 발생했습니다: " + e);
        }
    }
}
