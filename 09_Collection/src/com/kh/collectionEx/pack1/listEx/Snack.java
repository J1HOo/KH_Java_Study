package com.kh.collectionEx.pack1.listEx;

public class Snack {
    private String snackName; // 이름
    private int snackPrice; // 가격
    private int snackQuantity; // 수량

    public Snack(String snackName, int snackPrice, int snackQuantity) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
        this.snackQuantity = snackQuantity;
    }

    public String getSnackName() {
        return snackName;
    }
    public int getSnackPrice() {
        return snackPrice;
    }
    public int getSnackQuantity() {
        return snackQuantity;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }
    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }
    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    @Override
    public String toString() {
        return "이름 : " + snackName + " 가격 : " + snackPrice + " 수량 : " + snackQuantity;
    }
}
