package mos.car.form;

import mos.car.model.Car;
import mos.car.model.Clients;

import java.time.LocalDate;
import java.util.Objects;

public class IssuedCarsForm {

    private String id;
    private Car car;
    private Clients clients;
    private String issuedDate, returnDate;

    public IssuedCarsForm() {
    }

    public IssuedCarsForm(Car car, Clients clients, String issuedDate, String returnDate) {
        this.car = car;
        this.clients = clients;
        this.issuedDate = issuedDate;
        this.returnDate = returnDate;
    }

    public IssuedCarsForm(String id, Car car, Clients clients, String issuedDate, String returnDate) {
        this.id = id;
        this.car = car;
        this.clients = clients;
        this.issuedDate = issuedDate;
        this.returnDate = returnDate;
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

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssuedCarsForm that = (IssuedCarsForm) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "IssuedCarsForm{" +
                "id='" + id + '\'' +
                ", carId='" + car + '\'' +
                ", clientsId='" + clients + '\'' +
                ", issuedDate=" + issuedDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
