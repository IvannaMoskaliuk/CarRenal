package mos.car.service.car.impls;

import mos.car.model.Car;
import mos.car.repository.CarRepository;
import mos.car.service.car.interfaces.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    CarRepository carRepository;

    @Override
    public Car create(Car car) {
        car.setCreatedAt(LocalDateTime.now());
        car.setUpdateAt(LocalDateTime.now());
        return carRepository.save(car);
    }

    @Override
    public Car get(String id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car delete(String id) {
        Car car = this.get(id);
        carRepository.deleteById(car.getId());
        return car;
    }

    @Override
    public Car update(Car car) {
        car.setCreatedAt(LocalDateTime.now());
        car.setUpdateAt(LocalDateTime.now());
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }
}
