package com.kh.pack2.pre4;

public class HappyLunchReadRun {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "HappyLunch.txt";
        HappyLunchRead hl = new HappyLunchRead();

        System.out.println("[ " + fileName + " ] 읽기 모드를 시작합니다.");
        hl.readTxt(path, fileName);

    }
}
