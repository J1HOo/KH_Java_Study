package com.kh.practice.todolist;
import java.io.*;

public class TodoListManager {
    public void createTodo(String path, String createFileName) {
        File file = new File(path, createFileName); // 경로+파일명칭
        if (!file.exists()) {
            System.out.println("파일을 찾을 수 없습니다: " + createFileName + ". 새로운 파일을 생성하거나 확인하세요.");
            return;
        }
    }

    public void showTodo(String path, String fileName) {
        File file = new File(path, fileName);
        if (!file.exists()) {
            System.out.println("파일을 찾을 수 없습니다 : " + fileName + ". 새로운 파일을 생성하거나 확인하세요.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("\n--- " + fileName + " ---");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 문제가 발생했습니다 : " + e.getMessage());
        }
    }

    public void addTodo(String path, String fileName, String line) {
        File file = new File(path, fileName);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(line);
            bw.newLine();
            System.out.println("할 일이 추가되었습니다 : " + fileName);
        } catch (IOException e) {
            System.out.println("할 일을 추가 할 수 없습니다 : " + e.getMessage());
        }
    }
}