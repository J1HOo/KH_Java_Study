package com.kh.pack1.filePre;

import java.io.File;
import java.text.SimpleDateFormat;

public class FilePre2 {
    public void method1() {
        String folderPath = System.getProperty("user.home") + "/front-workspace/01_html";
        System.out.println("폴더 경로 확인 : " + folderPath);

        // 파일 객체 생성
        File file = new File(folderPath);

        // 폴더 안에 있는 파일이나 목록 가져오기
        File[] files = file.listFiles();

        // 파일 날짜 지정할 포멧 설정
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        // 파일 정보 출력
        for (File f : files) {
            System.out.println("파일에 대한 모든 정보 출력 : " + f); // f : 파일경로 + 파일이름
            System.out.println("파일 이름 출력 : " + f.getName());
            System.out.println("마지막 수정 날짜: " + sdf.format(file.lastModified()));
        }
    }
}
