package mos.car.controller.web;

import mos.car.form.CarForm;
import mos.car.model.Car;
import mos.car.service.car.impls.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("web/car")
public class CarWebController {

    @Autowired
    CarServiceImpl carService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String showAll(Model model){
        model.addAttribute("list", carService.getAll());
        return "carlist";
    }

    @RequestMapping(value = "/get/list{str}", method = RequestMethod.GET)
    String searchList(Model model){
        model.addAttribute("list", carService.getAll());
        return "carlist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCar(@PathVariable("id") String id, Model model){
        carService.delete(id);
        model.addAttribute("list",carService.getAll());
        return "redirect:/web/car/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createCars(Model model){
        CarForm carForm = new CarForm();
        model.addAttribute("carForm", carForm);
        return "addCar";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createCars(Model model, @ModelAttribute("carForm") CarForm carForm){
        Car car = new Car();
        car.setBrand(carForm.getBrand());
        car.setPrice(carForm.getPrice());
        car.setRentalPrice(carForm.getRentalPrice());
        car.setType(carForm.getType());
        carService.create(car);

        model.addAttribute("list", carService.getAll());
        return "redirect:/web/car/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateCars(@PathVariable("id") String id, Model model){
        Car car = carService.get(id);
        CarForm carForm = new CarForm(
                car.getId(),
                car.getBrand(),
                car.getPrice(),
                car.getRentalPrice(),
                car.getType()
        );
        model.addAttribute("carForm", carForm);
        return "addCar";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateCars(Model model, @PathVariable("id") String id, @ModelAttribute("carForm") CarForm carForm){
        Car car = new Car();
        car.setId(id);
        car.setBrand(carForm.getBrand());
        car.setPrice(carForm.getPrice());
        car.setRentalPrice(carForm.getRentalPrice());
        car.setType(carForm.getType());
        carService.update(car);

        model.addAttribute("list", carService.getAll());
        return "redirect:/web/car/get/list";
    }

}
