package mos.car.datastorage;

import mos.car.model.Car;
import mos.car.model.Clients;
import mos.car.model.IssuedCars;
import mos.car.repository.CarRepository;
import mos.car.repository.ClientsRepository;
import mos.car.repository.IssuedCarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    CarRepository carRepository;

    @Autowired
    ClientsRepository clientsRepository;

    @Autowired
    IssuedCarsRepository issuedCarsRepository;

    private List<Car> cars = new LinkedList<>(Arrays.asList(
            new Car("toyota", "1500000", "5000", "lite"),
            new Car("volvo", "1000000", "3000", "lite")
    ));

    private List<Clients> clients = new LinkedList<>(Arrays.asList(
            new Clients("Губчук", "Андрій", "Євгенович", "місто Київ", "0954468754"),
            new Clients("Ільчук", "Назарій", "Васильович", "місто Київ", "0369754559")
    ));

/*

    private List<IssuedCars> issuedCars = new LinkedList<>(Arrays.asList(
            new IssuedCars(LocalDate.parse("2020-02-02"), LocalDate.parse("2020-03-05")),
            new IssuedCars(LocalDate.parse("2020-12-02"), LocalDate.parse("2020-03-06"))
    ));
*/


    //@PostConstruct
    private void init(){
        carRepository.deleteAll();
        clientsRepository.deleteAll();
        issuedCarsRepository.deleteAll();
        carRepository.saveAll(cars);
        clientsRepository.saveAll(clients);
       // issuedCarsRepository.saveAll(issuedCars);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Clients> getClients() {
        return clients;
    }

    public void setClients(List<Clients> clients) {
        this.clients = clients;
    }

/*    public List<IssuedCars> getIssuedCars() {
        return issuedCars;
    }

    public void setIssuedCars(List<IssuedCars> issuedCars) {
        this.issuedCars = issuedCars;
    }*/
}
