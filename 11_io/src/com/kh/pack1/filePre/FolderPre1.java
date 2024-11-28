package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre1 {

    public void method1() {
        String path = System.getProperty("user.home");
        File dir = new File(path, "Desktop/profileImg");

            if (dir.exists()) {
                System.out.println("이미 존재하는 폴더입니다.");
            } else if (dir.mkdir()) {
                System.out.println("폴더가 생성되었습니다.");
            } else {
                System.out.println("폴더 생성에 실패 했습니다.");
            }
        }

    public void method2() {
        String path = System.getProperty("user.home");
        File file = new File(path, "/Desktop/newFile.txt");

        if(file.exists()){
            System.out.println("이미 파일이 바탕화면에 존재합니다.");
        } else {
            try{
            file.createNewFile();
            System.out.println("파일이 생성되었습니다." + file);

            } catch (IOException e) {
                System.out.println("에러가 발생하였습니다 : " + e.getMessage());
            }
        }
    }
}