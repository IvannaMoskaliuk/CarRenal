package mos.car.dao.car.impls;

import mos.car.dao.car.interfaces.IDaoCar;
import mos.car.datastorage.DataFake;
import mos.car.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IDaoCarImpl implements IDaoCar {

    @Autowired
    DataFake dataFake;

    @Override
    public Car create(Car car) {
        return null;
    }

    @Override
    public Car get(String id) {
        return null;
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public Car delete(String id) {
        return null;
    }

    @Override
    public List<Car> getAll() {
        return dataFake.getCars();
    }
}
