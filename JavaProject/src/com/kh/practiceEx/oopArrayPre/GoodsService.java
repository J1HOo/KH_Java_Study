package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class GoodsService {
    // 상품들을 담을 목록 리스트
    private ArrayList<Goods> goodsList = new ArrayList<Goods>();

    // 상품 추가 기능
    public void addGoods(Goods goods) {
        goodsList.add(goods);
        System.out.println(goods.getName() + "상품이 추가 되었습니다.");
    }

    // 상품 번호로 원하는 상품 가져오기 기능
    public Goods getGoodsById(int goodsId) {
        for (Goods goods : goodsList) {
            if (goods.getId() == goodsId) {
                return goods;
            }
        }
            System.out.println(goodsId + " 의 해당하는 상품을 찾을 수 없습니다.");
            return null;

    }

    // 모든 상품 보기 기능
    public void displayAllGoods() {
        if (goodsList.isEmpty()) {
            System.out.println("상품이 존재하지 않습니다.");
        } else {
        for (Goods goods : goodsList) {
            System.out.println(goods);
            }
        }
    }

    // 상품 삭제하기 기능
    public void removeGoods(int goodsId) {
        Goods toGoods = null;
        for (Goods goods : goodsList) {
            if (goods.getId() == goodsId) {
                goodsList.remove(goods);
                break;
            }
        }
        if (toGoods == null) {
            System.out.println("상품번호 " + goodsId + " 으로 조회된 상품이 존재하지 않아 삭제될 수 없습니다.");
        } else {
            System.out.println("상품번호 " + goodsId + " 에 해당하는 상품을 제거 했습니다.");
        }
    }
}
