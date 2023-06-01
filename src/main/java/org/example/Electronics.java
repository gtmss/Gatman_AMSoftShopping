package org.example;

public class Electronics extends Product{
    private String brand;
    private String model;

    public Electronics(Long id, String name, Float price, Integer quantity, String brand, String model) {
        super(id, name, price, quantity);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
