package mos.car.controller.rest;

import mos.car.model.Car;
import mos.car.service.car.impls.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/car/v2")
@RestController
public class CarRestController {

    @Autowired
    CarServiceImpl carService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Car> getCarList(){

        return carService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Car createCars(@RequestBody Car car){
        return carService.create(car);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    Car updateCars(@RequestBody Car car){
        return carService.update(car);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Car getCarsById(@PathVariable("id") String id){
        return carService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    Car deleteCars(@PathVariable("id") String id){
        return carService.delete(id);
    }

}
