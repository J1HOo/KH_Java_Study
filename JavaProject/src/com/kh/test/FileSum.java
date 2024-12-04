package com.kh.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileSum {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        try {
            File inputFile = new File(path + "numbers.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            int sum = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    sum += Integer.parseInt(line.trim());
                } catch (Exception e) {
                    System.out.println("Skipping invalid number: " + line);
                }
            }
            reader.close();
            FileWriter writer = new FileWriter(path + "result.txt");
            writer.write("Sum: " + sum);
            writer.close();

            System.out.println("더한 결과 작성 완료 result.txt: " + sum);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}
