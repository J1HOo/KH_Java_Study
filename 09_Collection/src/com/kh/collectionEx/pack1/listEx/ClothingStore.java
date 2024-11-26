package com.kh.collectionEx.pack1.listEx;

import java.util.ArrayList;

public class ClothingStore {
    // 1. 배열 방식
    // private Clothing[] clothingArray;
    // private int clothingCount;

    // 2. List 방식 (ArrayList)
    // private List<Clothing> clothingList;

    // 3. Set 방식 (HashSet)
    // private Set<Clothing> clothingSet;

    // 4. Map 방식 (HashMap)
    // private Map<String, Clothing> clothingMap;

    // 5. LinkedList 방식
    // private LinkedList<Clothing> clothingLinkedList;

    private ArrayList<Clothing> clothingList = new ArrayList<>();

    // 배열 초기화
    // clothingArray = new Clothing[100];
    // clothingCount = 0;

    // List 초기화
    // clothingList = new ArrayList<>();

    // Set 초기화
    // clothingSet = new HashSet<>();

    // Map 초기화
    // clothingMap = new HashMap<>();

    // LinkedList 초기화
    // clothingLinkedList = new LinkedList<>();

    public void addClothing(Clothing clothing) {

        // 1. 배열 방식
        /*
        if (clothingCount < clothingArray.length) {
            clothingArray[clothingCount++] = clothing;
            System.out.println("옷이 추가되었습니다: " + clothing.getName());
        } else {
            System.out.println("옷 목록이 가득 찼습니다.");
        }
        */

        // 2. List 방식
        /*
        clothingList.add(clothing);
        System.out.println("옷이 추가되었습니다: " + clothing.getName());
        */

        // 3. Set 방식
        /*
        if (clothingSet.add(clothing)) {
            System.out.println("옷이 추가되었습니다: " + clothing.getName());
        } else {
            System.out.println("이미 등록된 옷입니다: " + clothing.getName());
        }
        */

        // 4. Map 방식
        /*
        if (clothingMap.containsKey(clothing.getName())) {
            System.out.println("이미 등록된 옷입니다: " + clothing.getName());
        } else {
            clothingMap.put(clothing.getName(), clothing);
            System.out.println("옷이 추가되었습니다: " + clothing.getName());
        }
        */

        // 5. LinkedList 방식
        /*
        clothingLinkedList.add(clothing);
        System.out.println("옷이 추가되었습니다: " + clothing.getName());
        */

        clothingList.add(clothing);
        System.out.println("[" + clothing.getName() + "] 추가 완료!");
    }

    public boolean removeClothing(String name) {
        for (Clothing clothing : clothingList) {
            if (clothing.getName().equals(name)) {
                clothingList.remove(clothing);
                return true;
            }
        }
        return false;
    }

    public void allClothing() {
        if (clothingList.isEmpty()) {
            System.out.println("현재 등록된 옷이 없습니다.");
        } else {
            for (Clothing clothing : clothingList) {
                System.out.println(clothing);
            }
        }
        // 1. 배열 방식
        /*
        if (clothingCount == 0) {
            System.out.println("현재 등록된 옷이 없습니다.");
        } else {
            System.out.println("\n--- 현재 등록된 옷 목록 ---");
            for (int i = 0; i < clothingCount; i++) {
                System.out.println(clothingArray[i]);
            }
        }
        */

        // 2. List 방식
        /*
        if (clothingList.isEmpty()) {
            System.out.println("현재 등록된 옷이 없습니다.");
        } else {
            System.out.println("\n--- 현재 등록된 옷 목록 ---");
            for (Clothing clothing : clothingList) {
                System.out.println(clothing);
            }
        }
        */

        // 3. Set 방식
        /*
        if (clothingSet.isEmpty()) {
            System.out.println("현재 등록된 옷이 없습니다.");
        } else {
            System.out.println("\n--- 현재 등록된 옷 목록 ---");
            for (Clothing clothing : clothingSet) {
                System.out.println(clothing);
            }
        }
        */

        // 4. Map 방식
        /*
        if (clothingMap.isEmpty()) {
            System.out.println("현재 등록된 옷이 없습니다.");
        } else {
            System.out.println("\n--- 현재 등록된 옷 목록 ---");
            for (Clothing clothing : clothingMap.values()) {
                System.out.println(clothing);
            }
        }
        */

        // 5. LinkedList 방식
        /*
        if (clothingLinkedList.isEmpty()) {
            System.out.println("현재 등록된 옷이 없습니다.");
        } else {
            System.out.println("\n--- 현재 등록된 옷 목록 ---");
            for (Clothing clothing : clothingLinkedList) {
                System.out.println(clothing);
            }
        }
        */
    }

}