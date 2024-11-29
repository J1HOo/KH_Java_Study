package com.kh.pack2;

import java.io.*;

public class FileReadWrite {

    public void method1() {
        // c/users/user/바탕화면 에 ex1.txt 만들기
        File file = new File(System.getProperty("user.home") + "/Desktop/ex1.txt");

        try { // 파일을 생성하거나 글을 넣어줄 땐 항상 예외 상황이 많아 try-catch 문을 필수로 요한다.
            if (file.exists()) {  // 파일이 존재하는지 여부 확인
                System.out.println("파일이 존재합니다.");
            } else {
                file.createNewFile(); // 파일 생성
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
        }

        try(FileWriter writer = new FileWriter(file)) { // File 안에 writer 글자 작성
            String content = "안녕하세요, 반갑습니다.";

            writer.write(content); // 파일 쓰기 기능으로 파일안에 글자 작성

            System.out.println("파일에 내용이 작성되었습니다.");
        } catch (IOException e) {
            System.out.println("글자 작성에 실패하였습니다.");
            throw new RuntimeException(e);
        } finally {
            System.out.println("글자 작성 작업을 종료합니다.");
        }
    }
    // 만들어진 파일을 읽고 눈으로 어떤 내용이 작성되어 있는지 확인
    // FileReader     : 파일로부터 문자 데이터를 읽어들이는 클래스        -> 한 글자씩    읽음
    // BufferedReader : FileReader에 버퍼링 기능 추가한 클래스            -> 한 줄 단위로 읽음
    //                  줄 단위로 데이터를 읽을 수 있어 빠르고 성능이 좋음
    public void method3(){
        String path = System.getProperty("user.home") + "/Desktop/ex1.txt";
        try {
            FileReader file = new FileReader( System.getProperty("user.home") + "/Desktop/ex1.txt");
            BufferedReader br = new BufferedReader(file); // 한 줄단위로 읽는 성능좋은 부스터 붙임
            // String line = br.readLine();  //한줄씩 읽어오는 readLine()기능 설정
            String line ;  //한줄씩 읽어오는 readLine()기능 설정
            // 반복문을 이용해서 읽는 것이 끝날 때까지 계속 반복
            while ((line = br.readLine()) != null) { //null = 더이상 읽을게 없을 때까지
                System.out.println(line);
            }
            br.close(); //한줄씩 읽는 것 부터 먼저 종료
            file.close(); //한글자씩 가져오는 객체 종료
            /*
             * FileReader가 읽는 것이 느리기 때문에 BufferedReader가 빠르게 읽을 수 있도록 도와줌
             * FileReader를 도와주기위해 생성된 BufferedReader를 먼저 종료시키고
             * 그다음에 FileReader를 종료시키는 것
             * */
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void method4(){
        String path = System.getProperty("user.home") + "/Desktop/ex1.txt";
        try {
            FileReader file = new FileReader( System.getProperty("user.home") + "/Desktop/ex1.txt");
            BufferedReader br = new BufferedReader(file);
            String line; //글자를 담고 출력할 공간 생성
            while ((line = br.readLine()) != null) { // line이라는 공간에 한 줄의 글자들이 담기고
                System.out.println(line);
                // line이라는 변수명에 담겨진 글자를 출력한 다음
                // 다음줄이 아예 없을 때까지 계속해서 출력을 진행하는 것
            }
            // 복사기에서 5페이지를 출력하기 위해 1페이지 출력하고 2페이지를 출력하는 것과 같은 형식
            br.close();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
