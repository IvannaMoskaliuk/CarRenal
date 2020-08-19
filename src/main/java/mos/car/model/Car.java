package mos.car.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Car {

    @Id
    private String id;
    private String brand;
    private String price;
    private String rentalPrice;
    private String type;
    private LocalDateTime createdAt, updateAt;

    public Car() {
    }

    public Car(String brand, String price, String rentalPrice, String type) {
        this.brand = brand;
        this.price = price;
        this.rentalPrice = rentalPrice;
        this.type = type;
    }

    public Car(String id, String brand, String price, String rentalPrice, String type) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.rentalPrice = rentalPrice;
        this.type = type;
    }

    public Car(String id, String brand, String price, String rentalPrice, String type, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.rentalPrice = rentalPrice;
        this.type = type;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id.equals(car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", rentalPrice='" + rentalPrice + '\'' +
                ", type='" + type + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
