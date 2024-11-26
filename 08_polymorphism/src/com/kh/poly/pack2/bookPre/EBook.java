package com.kh.poly.pack2.bookPre;

public class EBook extends Book {
    private String fileSize;

    public  EBook(String title, String author, int price,String fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + " 파일 크기 : " + fileSize + " MB";
    }

}
