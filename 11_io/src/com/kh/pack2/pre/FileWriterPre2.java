package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class FileWriterPre2 {
    public boolean method1() {
        File file = new File(System.getProperty("user.home") + "/Desktop/lunch.txt");

        if (file.exists()) {
            System.out.println("이미 존재하는 파일입니다.");
            return false;
        }

        try (Writer writer = new FileWriter(file)) {
            if (file.exists()) {
                file.createNewFile();
                writer.write("제육볶음 \n치킨 \n저녁으로 닭발");
                System.out.println("파일 작성 완료");
                }
            } catch (Exception e) {
            System.out.println("파일 만들기에 실패: " + e);
            return false;

        } finally {
            System.out.println("프로그램 종료");
        }
        return true;
    }

    public static void main(String[] args) {
        FileWriterPre2 fwp = new FileWriterPre2();
        fwp.method1();
    }
}
