package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;

public class FileService {
    //method1.  File클래스 객체를 이용해서 폴더가 존재하지 않으면 폴더 생성해보자

    public void method1(){
        //C:/Users/user1/바탕화면>
        //C:/Users/user1/Desktop>
        //만약 바탕화면에 만들고싶다면 ?
        File 폴더 = new File(System.getProperty("user.home") + "Desktop/newFolders");
        System.out.println("폴더 위치 : "+폴더.getPath());
        System.out.println("폴더 절대경로: "+폴더.getAbsolutePath());

        //폴더 절대경로           : C:/newFolder
        // 현재 우리가 실행하고 있는 파일 위치 기준 11_io 폴더 안에서 Suers/user1/Desktop/newFolders 만든다는 것
        System.out.println("폴더 이름: "+폴더.getName());
        System.out.println("폴더가 존재하는지 확인 : "+폴더.exists());

        //폴더 생성
        폴더.mkdir();
        System.out.println("폴더 생성을 완료했습니다.");
    }

    public void method2() throws IOException {
        File file = new File(System.getProperty("user.home") + "Desktop/내파일.txt");

        if(file.exists()){
            System.out.println("이미 파일이 바탕화면에 존재합니다.");
        } else {
            file.createNewFile();
            System.out.println("파일이 생성되었습니다.");
        }
    }
}