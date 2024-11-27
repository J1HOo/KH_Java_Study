package com.kh.practice.list.library.run;

import com.kh.practice.list.library.vie.BookMenu;

import java.util.Scanner;

public class BookMenuRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookMenu menu = new BookMenu();

        while (true) {
            System.out.println("\n== Welcome KH Library ==");
            System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // 도서 추가
                    System.out.print("도서명 : ");
                    String title = sc.nextLine();

                    System.out.print("저자명 : ");
                    String author = sc.nextLine();

                    System.out.print("장르 (1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
                    int category = sc.nextInt();
                    sc.nextLine();

                    String genre = "";
                    switch (category) {
                        case 1: genre = "인문"; break;
                        case 2: genre = "자연과학"; break;
                        case 3: genre = "의료"; break;
                        case 4: genre = "기타"; break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            genre = "기타";
                    }

                    System.out.print("가격 : ");
                    int price = sc.nextInt();
                    sc.nextLine();

                    menu.insertBook(title, author, genre, price);
                    break;

                case 2:
                    menu.selectList();
                    break;

                case 3:
                    // 도서 검색
                    System.out.print("검색할 도서명 키워드 : ");
                    String searchTitle = sc.nextLine();
                    menu.searchBook(searchTitle);
                    break;

                case 4:
                    // 도서 삭제
                    System.out.print("삭제할 도서명 : ");
                    String deleteTitle = sc.nextLine();

                    System.out.print("삭제할 저자명 : ");
                    String deleteAuthor = sc.nextLine();

                    menu.deleteBook(deleteTitle, deleteAuthor);
                    break;

                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        }
    }
}

