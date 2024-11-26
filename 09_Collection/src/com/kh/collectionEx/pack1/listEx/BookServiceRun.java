package com.kh.collectionEx.pack1.listEx;

import java.util.Scanner;

public class BookServiceRun {
    public static void main(String[] args) {
        BookService bookService = new BookService();
//        bookService.method1();
//        bookService.method2();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n === 책 매니저 ===");
            System.out.println("1. 책 추가하기");
            System.out.println("2. 책 제거하기");
            System.out.println("3. 모든 책 리스트 확인하기");
            System.out.println("4. 종료");
            System.out.println("번호만 입력하세요 : ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("책 제목을 입력하세요 : ");
                    String title = sc.next();

                    System.out.print("저자를 입력하세요 : ");
                    String author = sc.next();

                    System.out.print("팔고자하는 가격을 입력하세요 : ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    // 책 저장하기 기능
                    bookService.addBook(title, author, price);
                    break;

                    case 2:
                        // 만약에 책 제목이 존재한다면 책을 삭제했습니다, 만약에 책이 없다면 책 제목을 찾을 수 없습니다.
                        System.out.print("지우고자 하는 책의 제목을 입력하세요 : ");
                        String removeTitle = sc.next();

                        if (bookService.removeBook(removeTitle)) {
                            System.out.println("책을 삭제 했습니다.");
                        } else {
                            System.out.println("책 제목을 찾을 수 없습니다.");
                        }

                        break;

                        case 3:
                            // 만약에 책이 하나도 없다면 메세지 띄우기, 책이 존재 한다면 모든 책 리스트 보여주기
                            if (bookService.getBookList().size() == 0) {
                             System.out.println("판매할 수 있는 책이 없습니다.");
                            } else {
                            System.out.println(bookService.getBookList());
                            }
                            break;

                case 4:
                   System.out.println("책 메니저를 종료합니다.");
                   return;
            }
        }
    }
}
