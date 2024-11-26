package com.kh.collectionEx.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre1 {

    public void method1() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("새우깡");
        list.add("맛동산");
        list.add("포카칩");
        list.add("고구마칩");
        list.add("고래밥");

        System.out.println(list);
        System.out.println(list.size());

        // 만약 index 1 자리에 허니버터칩을 넣고 싶다면
        list.add(1,"허니버터칩");

        System.out.println(list);

        // 특정 index 주소의 값 가져오기
        System.out.println(list.get(3));

        // 2번째 저장된 값을 망고과자로 변경
        list.set(2, "망고과자");
        System.out.println(list.get(2));

        // 특정 index 주소의 값 삭제
        list.remove(1);
        System.out.println(list);

        list.remove("포카칩");
        System.out.println(list);

        // contains (index 주소) 리스트에 찾는 값이 들어있는지 확인
        System.out.println(list.contains("망고과자")); // true
        System.out.println(list.contains("눈을감자")); // false

        // list 안의 모든 값 삭제
        list.clear();
        System.out.println(list.isEmpty()); //true

    }

    public void method2() {
        ArrayList<String> list = new ArrayList<>();

    }
}
