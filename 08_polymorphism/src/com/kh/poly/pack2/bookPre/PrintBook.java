package com.kh.poly.pack2.bookPre;

public class PrintBook extends Book {
    private int ShippingCost;

    public PrintBook(String title, String author, int price, int shippingCost) {
        super(title, author, price);
        this.ShippingCost = shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        ShippingCost = shippingCost;
    }

    public int getShippingCost() {
        return ShippingCost;
    }

    @Override
    public String toString() {
        return super.toString() + " 배송비 : " + ShippingCost + " 원";
    }

}
