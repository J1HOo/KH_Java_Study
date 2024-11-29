package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class FileWriterPre {
    public void method1 () {
        File file = new File(System.getProperty("user.home") + "/Desktop/hello.txt");

        try (Writer writer = new FileWriter(file)) { // try-with-resources로 Writer를 자동으로 닫도록 설정
            if (file.exists()) {
                System.out.println("이미 존재하는 파일입니다.");

            } else {
                file.createNewFile();
                writer.write("안녕하세요. Hello, Hi");
                System.out.println("파일 작성 완료");

            }
        } catch (Exception e) {
            System.out.println("파일 만들기에 실패" + e);

        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
