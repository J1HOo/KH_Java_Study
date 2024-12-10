package com.kh.practiceEx.filePre;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
    // FileWriter 사용해서 바탕화면에 food.docs 파일 생성
    public void createFile(String content) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(content);
            System.out.println("파일이 성공적으로 생성되고, 내용이 작성되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 생성 중 오류가 발생했습니다 : " + e.getMessage());
        }
    }

    // 파일을 읽어와 출력
    public void readFile() {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류가 발생했습니다 : " + e.getMessage());
        }
    }

    // 바탕화면에 있는 food.docs 파일에 이어쓰기 기능 설정
    public void appendFile(String content) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "food.docs";
        File file = new File(path + fileName);

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(content);
            System.out.println("파일에 내용이 성공적으로 추가되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 이어쓰기 중 오류가 발생했습니다 : " + e.getMessage());
        }
    }
}