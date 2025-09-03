package edu.polymorphism.pack1.ex1.model;

public class Electronics extends Product {
    // 전자제품 관련 필드들
    private int warranty; // 보증기간
    private String powerConsumption; // 전력소비량

    // 생성자들
    public Electronics() {
    }

    public Electronics(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
    }

    public Electronics(String productName, String productId, double productPrice, String productCategory, int productStock, String productDescription, String productBrand, double productWeight, int warranty, String powerConsumption) {
        super(productName, productId, productPrice, productCategory, productStock, productDescription, productBrand, productWeight);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    public Electronics(String productName, String productId, double productPrice, int productStock, String productDescription, String productBrand, double productWeight, int warranty, String powerConsumption) {
        super(productName, productId, productPrice, "전자제품", productStock, productDescription, productBrand, productWeight);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }
    // Electronics(String, String, double, int, String, String, double, int, String)

    // 게터 세터
    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    // 전자제품 관련 메서드들
    public void displayElectronicsInfo() {
        if (getProductCategory().equals("전자제품")) {
            System.out.println("보증기간: " + warranty + "개월");
            System.out.println("전력소비량: " + powerConsumption);
        }
    }

}
