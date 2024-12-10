package com.kh.practiceEx.oopArrayPre;

public class Product {
    private String name;
    private int price;
    private String description;
    private String category;

    public Product() {}

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "제품명 : " + name + "\n 가격 : " + price + "\n 설명 : " + description + "\n 카테고리 : " + category;
    }
}
