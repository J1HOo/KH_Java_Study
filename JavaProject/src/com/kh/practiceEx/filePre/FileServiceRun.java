package com.kh.practiceEx.filePre;

public class FileServiceRun {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        String content = "맛있는 음식 목록 : \n  피자 \n  치킨 \n  초밥 \n 파스타";
        String appendContent = "\n 햄버거 \n 돈까스 \n 쌀국수 \n 카레 \n";

        fileService.createFile(/* "맛있는 음식 목록 : \n 피자 \n 치킨 \n  초밥 \n 파스타" */ content);
        fileService.readFile();
        fileService.appendFile(/* "\n 햄버거 \n 돈까스 \n 쌀국수 \n 카레 \n" */  appendContent);
        fileService.readFile();

    }
}