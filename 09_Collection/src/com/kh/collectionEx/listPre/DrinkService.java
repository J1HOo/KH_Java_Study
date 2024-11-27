package com.kh.collectionEx.listPre;

import java.util.ArrayList;

public class DrinkService {
    private ArrayList<Drink> drinkList = new ArrayList<>();

    // 1. 음료 추가
    public void addDrink(String name, int price) {
        Drink drink = new Drink(name, price);
        drinkList.add(drink);
        System.out.println("음료가 추가되었습니다: " + drink);
    }

    // 2. 모든 음료 출력
    public void allDrink() {
        if (drinkList.isEmpty()) {
            System.out.println("등록된 음료가 없습니다.");
        } else {
            System.out.println("현재 등록된 음료 리스트 : ");
            for (Drink drink : drinkList) {
                System.out.println(drink);
            }
        }
    }

    // 3. 음료 이름으로 제거
    public boolean removeDrink(String name) {
        for (int i = 0; i < drinkList.size(); i++) {
            if (drinkList.get(i).getName().equals(name)) {
                System.out.println("음료가 삭제되었습니다: " + drinkList.get(i));
                drinkList.remove(i);
                return true;
            }
        }

        System.out.println("해당 이름의 음료를 찾을 수 없습니다.");
        return false;
    }

    // 4. 음료 이름으로 검색
    public boolean searchDrink(String name) {
        for (Drink drink : drinkList) {
            if (drink.getName().equals(name)) {
                System.out.println("검색 결과: " + drink);
                return true;
            }
        }
        System.out.println("해당 이름의 음료를 찾을 수 없습니다.");
        return false;
    }

    // 5. 음료 가격으로 검색
    public boolean searchDrink(int price) {
        boolean searchDrink = false;
        for (Drink drink : drinkList) {
            if (drink.getPrice() == price) {
                System.out.println("검색 결과: " + drink);
                searchDrink = true;
            }
        }

        if (!searchDrink) {
            System.out.println("해당 가격의 음료를 찾을 수 없습니다.");
        }

        return searchDrink;
    }
}
