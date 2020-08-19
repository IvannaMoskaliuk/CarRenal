package mos.car.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class IssuedCars {

    @Id
    private String id;
    private Car car;
    private Clients clients;
    private LocalDate issuedDate, returnDate;
    private LocalDateTime createdAt, updateAt;

    public IssuedCars() {
    }

    public IssuedCars(Car car, Clients clients, LocalDate issuedDate, LocalDate returnDate) {
        this.car = car;
        this.clients = clients;
        this.issuedDate = issuedDate;
        this.returnDate = returnDate;
    }

    public IssuedCars(String id, Car car, Clients clients, LocalDate issuedDate, LocalDate returnDate) {
        this.id = id;
        this.car = car;
        this.clients = clients;
        this.issuedDate = issuedDate;
        this.returnDate = returnDate;
    }

    public IssuedCars(String id, Car car, Clients clients, LocalDate issuedDate, LocalDate returnDate, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.car = car;
        this.clients = clients;
        this.issuedDate = issuedDate;
        this.returnDate = returnDate;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
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
        IssuedCars that = (IssuedCars) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "IssuedCars{" +
                "id='" + id + '\'' +
                ", carId='" + car + '\'' +
                ", clientsId='" + clients + '\'' +
                ", issuedDate=" + issuedDate +
                ", returnDate=" + returnDate +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
