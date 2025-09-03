package edu.polymorphism.pack1.ex1.model;

public class Product {
    // 상품 정보 관련 필드들
    private String productName;
    private String productId;
    private double productPrice;
    private String productCategory;
    private int productStock;
    private String productDescription;
    private String productBrand;
    private double productWeight;
    
    // {} 형태로 된 블록 접기 펼치기 단축키
    // ctrl + shift + "+" or "-" 접기 펼치기 가능
    
    // 생성자
    public Product(){}

    /**
     * 1안 생성자 프로덕트의 경우 초반에 객체를 생성할 때 카테고리 자체를 고려하지 않겠다는 생성자
     * => 현재는 카테고리가 필요하지 않지만 상황에 따라 set으로 추가할 수 있다.
     * // 1안
     *     public Product(String productName, String productId, double productPrice, int productStock, String productDescription, String productBrand, double productWeight) {
     *         this.productName = productName;
     *         this.productId = productId;
     *         this.productPrice = productPrice;
     *         this.productStock = productStock;
     *         this.productDescription = productDescription;
     *         this.productBrand = productBrand;
     *         this.productWeight = productWeight;
     *     }
     * 현재 생성자에 존재하는 super의 경우 2안처럼 생성자 파라미터 내부에 String productCategory로
     * "전자제품" 카테고리로 들어갈 수 있도록 개발자가 직접적으로 설정
     * // 2안
     * // public Electronics(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight, int warranty, String powerConsumption) {
     * //     super(productName, productId, productPrice, "전자제품", productStock, productDescription, productBrand, productWeight);
     */
    public Product(String productName, String productId, double productPrice, int productStock, String productDescription, String productBrand, double productWeight) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productBrand = productBrand;
        this.productWeight = productWeight;
    }
    public Product(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productBrand = productBrand;
        this.productWeight = productWeight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    // 상품 관련 메서드들
    public void displayProductInfo() {
        System.out.println("상품명: " + productName);
        System.out.println("가격: " + productPrice + "원");
        System.out.println("재고: " + productStock + "개");
        System.out.println("브랜드: " + productBrand);
        // return false;
    }

    public void updateProductStock(int quantity) {
        this.productStock += quantity;
        System.out.println("재고가 업데이트되었습니다. 현재 재고: " + this.productStock);
    }

    public void sellProduct(int quantity) {
        if (this.productStock >= quantity) {
            this.productStock -= quantity;
            System.out.println(quantity + "개 판매되었습니다. 남은 재고: " + this.productStock);
        } else {
            System.out.println("재고가 부족합니다.");
        }
    }

    public void applyDiscount(double discountRate) {
        double discountedPrice = productPrice * (1 - discountRate);
        System.out.println("할인가: " + discountedPrice + "원 (할인율: " + (discountRate * 100) + "%)");
    }

}
