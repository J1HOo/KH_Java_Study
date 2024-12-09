package com.kh.oopArrayPre;

import java.util.Scanner;

public class ProductServiceRun {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);

        System.out.print("제품명: ");
        String inputName = sc.nextLine();

        System.out.print("가격: ");
        int inputPrice = sc.nextInt();
        sc.nextLine();

        System.out.print("제품 설명과 카테고리를 입력하시겠습니까? (yes/no): ");
        String input = sc.nextLine();
        String inputDescription = "없음";
        String  inputCategory = "없음";

        if (input.equalsIgnoreCase("yes")) {
            System.out.print("설명 : ");
                inputDescription = sc.nextLine();

            System.out.print("카테고리 : ");
                inputCategory = sc.nextLine();
        } else if (input.equalsIgnoreCase("no")) {
                System.out.println("추후에 수정 가능합니다.");
        } else {
            System.out.println("잘못 입력했습니다. 다시 작성해주세요.");
        }

        /*
        // p1 제품 추가
        Product p1 = new Product("스마트폰", 100000);
        p1.setDescription("최신 스마트폰입니다. 12/24 출고 예정");
        p1.setCategory("전자기기");

        // p2 제품 추가
        Product p2 = new Product("노트북", 150000);

        // get에서 저장된 값이 없을 경우 null 값이 저장되어 있음
        if (p2.getDescription() == null) {
            p2.setDescription("없음");
        }

        if (p2.getCategory() == null) {
            p2.setCategory("없음");
        }


        productService.addProduct(p1);
        productService.addProduct(p2);
*/

        Product p = new Product(inputName, inputPrice);
        p.setDescription(inputDescription);
        p.setCategory(inputCategory);
        productService.addProduct(p);
        // 제품 목록 보기
        productService.viewProduct();

        // 제품명으로 검색
        // searchProduct 기능이 void 가 아닌 return 값이 Product 이기 때문에 Product 자료형으로 변수명 설정
         p = productService.searchProduct("노트북");
        if (p != null) {
            System.out.println("검색된 제품 : " + p);
        } else {
            System.out.println("해당 이름에 제품을 찾을 수 없습니다.");
        }
    }
}
