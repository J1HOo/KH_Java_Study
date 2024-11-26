package com.kh.collectionEx.pack1.listEx;

import java.util.ArrayList;
// 컬렉션 프레임워크 : Java에서 자료구조를 만들어서 모아둔 것
// java.util 폴더안에 있음
//특징
//1) 크기 제한 없음(부족하면 자동으로 증가)
//2) 추가 수정 삭제 검색 등 다양한 기능이 구현되어 있음

public class BookService {
    // List : 자료를 순차적으로 나열한 자료 구로 (배열과 비슷)
    // - 인덱스가 존재함
    //      -> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능


    // List 사용해보기
    public  void method1() {
        // List 객체 생성
        // List (인터페이스) -> 객체로 보기 어려움 객체 생성 불가 -> 다형성 이용
        // List 기능을 물려받은 ArrayList (클래스) 활용

        int arr1[] = new int[3]; // 이 안에는 정수형으로 3개의 값만 들어갈 수 있음
        String arr2[] = new String[3]; // 이 안에는 문자열로 3개의 값만 들어갈 수 있음

        arr1[0] = 10; // index 0번째 자리에 10을 넣는다.

        // List1 은 숫자넣기 가능, 문자넣기 가능, 문자열넣기 가능 즉 모든 값을 넣을 수 있음
        ArrayList list1 = new ArrayList(3);
        list1.add(1); // 자동으로 index 0번째 자리에 1이 들어감
        list1.add("아무 값이나 가능"); // 자동으로 index 첫 번째 자리에 문자열이 들어감
        list1.add(123);
        list1.add(false); // 3칸으로 되어 있는 list 크기가 자동으로 4칸으로 늘어나며 자료형 boolean 이 삽입

        System.out.println(list1);

        // 배열의 길이 : length
        // 리스트의 길이 : size() -> List에 저장된 요소(객체)의 개수를 반환

    }

    // List 에서 원하는 자료형만 넣을 수 있도록 자료형 제한 설정
    public void method2() {

        /*
        String 타입으로 제한된 ArrayList 객체 생성
        ArrayList<원하는자료형> list1 = new ArrayList<원하는자료형>(); ** 주로 사용 **
        ArrayList list1 = new ArrayList<원하는자료형>();
        ArrayList<원하는자료형> list1 = new ArrayList<>();
         */

        ArrayList list1 = new ArrayList<String>();

        list1.add("닭갈비");
        list1.add("치킨");
        list1.add("보쌈");
        list1.add("족발");
        // list1.add(123);  추후 코드 흐름에서 문제를 일으킬 수 있음

        System.out.println(list1);
        System.out.println(list1.size()); // 총 개수 세기

    }

    // 책 저장하기
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(String title, String author, int price) {
        Book book = new Book(title, author, price);

        bookList.add(book);
//        bookList.add( new Book(title, author, price)); 으로 처리 가능
        System.out.println(bookList);
        System.out.println("책이 성공적으로 추가 되었습니다.");

    }

    // 저장된 책 모두 확인하기
    public ArrayList<Book> getBookList() {
        return bookList; // 가지고 있는 모든 책 리스트 호출해서 전달하기

    }

    // 책 삭제하기 기능
    public boolean removeBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
//      향상된 for 문(for-each문)
//    	1.	bookList에서 첫 번째 요소를 꺼내와 book에 저장. (Book book : bookList)
//	    2.	코드 블록(중괄호 안의 코드)을 실행.
//      3.	bookList에서 다음 요소를 꺼내와 book에 저장.
//      4.	모든 요소를 순회할 때까지 반복.

}
