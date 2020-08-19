package mos.car.controller.rest;

import mos.car.model.IssuedCars;
import mos.car.service.issuedCars.impls.IIssuedCarsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/issuedcars/v2")
@RestController
public class IssuedCarsRestController {

    @Autowired
    IIssuedCarsServiceImpl issuedCarsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<IssuedCars> getIssuedCarsList(){
        return issuedCarsService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    IssuedCars createIssuedCars(@RequestBody IssuedCars issuedCars){
        return issuedCarsService.create(issuedCars);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    IssuedCars updateIssuedCars(@RequestBody IssuedCars issuedCars){
        return issuedCarsService.update(issuedCars);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)//get by id
    IssuedCars getIssuedCarsById(@PathVariable("id") String id){
        return issuedCarsService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    IssuedCars deleteIssuedCars(@PathVariable("id") String id){
        return issuedCarsService.delete(id);
    }


}
