package mos.car.dao.car.interfaces;

import mos.car.model.Car;

import java.util.List;

public interface IDaoCar {

    Car create (Car car);
    Car get (String id);
    Car update (Car car);
    Car delete (String id);
    List<Car> getAll();
}
