package com.kh.practice.list.library.vie;

import com.kh.practice.list.library.model.dto.Book;
import java.util.ArrayList;

public class BookMenu {
    private ArrayList<Book> bookList = new ArrayList<>(); // 도서 목록 관리

    // 1. 도서 추가
    public void insertBook(String title, String author, String genre, int price) {
        Book newBook = new Book(title, author, genre, price);
        bookList.add(newBook);
        System.out.println("새 도서가 추가되었습니다.");
    }

    // 2. 도서 전체 검색
    public void selectList() {
        if (bookList.isEmpty()) {
            System.out.println("도서가 존재하지 않습니다.");
        } else {
            System.out.println("도서 목록 : ");
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }

    // 3. 도서 검색
    public void searchBook(String keyword) {
        ArrayList<Book> searchList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().contains(keyword)) {
                searchList.add(book);
            }
        }

        if (searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("검색 결과 : ");
            for (Book book : searchList) {
                System.out.println(book);
            }
        }
    }

    // 4. 도서 삭제
    public void deleteBook(String title, String author) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                bookList.remove(book);
                System.out.println("성공적으로 삭제되었습니다.");
                break;
            } else {
                System.out.println("존재하지 않는 도서명 입니다.");
            }
        }

    }
}

