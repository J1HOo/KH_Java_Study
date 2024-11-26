package com.kh.collectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class Snack기능 {

    ArrayList<Snack> snacks = new ArrayList<Snack>();

    public void addSnack() {
        Scanner sc = new Scanner(System.in);

        System.out.print("과자명을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("과자 가격을 입력하세요 : ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("과자 재고수량을 입력하세요 : ");
        int quantity = sc.nextInt();
        sc.nextLine();

        // 과자 정보를 저장하는 클래스 생성
        Snack snack1 = new Snack(name,price,quantity); // Scanner로 입력받은 과자명, 가격, 수량이 들어감
        Snack snack2 = new Snack("2번 과자",3000,10);
        Snack snack3 = new Snack("3번 과자",5000,7);

        // 과자 정보들을 모아 놓은 리스트 생성
        snacks.add(snack1); // 과자 정보 목록에 과자 하나의 대한 정보들을 업로드
        snacks.add(snack2); // 더미데이터 : 목록 확인을 위한 용도
        snacks.add(snack3); // 더미데이터 : 목록 확인을 위한 용도

        // for-each
        for (Snack snack : snacks) { // snacks 요소들을 하나씩 꺼내 snack에 저장
            System.out.println(snack); // 하나씩 꺼내온 요소들을 모두 출력
        }

 //        for
//        for (int i = 0; i < snacks.size(); i++) {
//            System.out.println(snacks.get(i).toString());
//        }

    }
    public boolean removeSnack(String name) {
        for (Snack snack : snacks) {
            if (snack.getSnackName().equals(name)) {
                snacks.remove(snack);
                return true;
            }
        }
        return false;
    }
}
