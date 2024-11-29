package com.kh.pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    public void method1() {
        // c/users/user/바탕화면 에 ex1.txt 만들기
        File file = new File(System.getProperty("user.home") + "/Desktop/ex1.txt");

        try { // 파일을 생성하거나 글을 넣어줄 땐 항상 예외 상황이 많아 try-catch 문을 필수로 요한다.
            if (file.exists()) {  // 파일이 존재하는지 여부 확인
                System.out.println("파일이 존재합니다.");
            } else {
                file.createNewFile(); // 파일 생성
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
        }

        try(FileWriter writer = new FileWriter(file)) { // File 안에 writer 글자 작성
            String content = "안녕하세요, 반갑습니다.";

            writer.write(content); // 파일 쓰기 기능으로 파일안에 글자 작성

            System.out.println("파일에 내용이 작성되었습니다.");
        } catch (IOException e) {
            System.out.println("글자 작성에 실패하였습니다.");
            throw new RuntimeException(e);
        } finally {
            System.out.println("글자 작성 작업을 종료합니다.");
        }
    }
}
