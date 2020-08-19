package mos.car.form;

import java.util.Objects;

public class CarForm {
    private String id;
    private String brand;
    private String price;
    private String rentalPrice;
    private String type;

    public CarForm() {
    }

    public CarForm(String id, String brand, String price, String rentalPrice, String type) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.rentalPrice = rentalPrice;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(String rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarForm that = (CarForm) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CarForm{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", rentalPrice='" + rentalPrice + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
