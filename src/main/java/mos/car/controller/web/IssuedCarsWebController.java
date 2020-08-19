package mos.car.controller.web;

import mos.car.form.IssuedCarsForm;
import mos.car.model.Car;
import mos.car.model.Clients;
import mos.car.model.IssuedCars;
import mos.car.service.car.impls.CarServiceImpl;
import mos.car.service.clients.impls.ClientsServiceImpl;
import mos.car.service.issuedCars.impls.IIssuedCarsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/web/issuedcars")
public class IssuedCarsWebController {

    @Autowired
    IIssuedCarsServiceImpl issuedCarsService;

    @Autowired
    CarServiceImpl carService;

    @Autowired
    ClientsServiceImpl clientsService;

    Map<String, String> mcar;
    Map<String, String> mclient;

    @PostConstruct
    void init(){
        mcar = new HashMap<>();
        for (Car car:carService.getAll()){
            mcar.put(car.getId(),car.getBrand());
        }
        mclient = new HashMap<>();
        for (Clients clients:clientsService.getAll()){
            mclient.put(clients.getId(),clients.getSurname());
        }

    }

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String showAll(Model model){
        List<IssuedCars> issuedCarsList = issuedCarsService.getAll();
        model.addAttribute("list", issuedCarsList);
        return "issuedcarslist";
    }

    @RequestMapping(value = "/get/list{str}", method = RequestMethod.GET)
    String searchList(Model model){
        model.addAttribute("list", issuedCarsService.getAll());
        return "issuedcarslist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteIssuedCars(@PathVariable("id") String id, Model model){
        issuedCarsService.delete(id);
        model.addAttribute("list",issuedCarsService.getAll());
        return "redirect:/web/issuedcars/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createIssuedCars(Model model){
        IssuedCarsForm issuedCarsForm = new IssuedCarsForm();

        model.addAttribute("issuedCarsForm", issuedCarsForm);
        model.addAttribute("cars",mcar);
        model.addAttribute("clients",mclient);
        return "addIssuedCars";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createIssuedCars(Model model, @ModelAttribute("issuedCarsForm") IssuedCarsForm issuedCarsForm){
        IssuedCars issuedCars = new IssuedCars();
        issuedCars.setCar(issuedCarsForm.getCar());
        issuedCars.setClients(issuedCarsForm.getClients());
        issuedCars.setIssuedDate(LocalDate.parse(issuedCarsForm.getIssuedDate()));
        issuedCars.setReturnDate(LocalDate.parse(issuedCarsForm.getReturnDate()));
        issuedCarsService.create(issuedCars);

        model.addAttribute("list", issuedCarsService.getAll());
        return "redirect:/web/issuedcars/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateIssuedCars(@PathVariable("id") String id, Model model){
        IssuedCars issuedCars = issuedCarsService.get(id);
        IssuedCarsForm issuedCarsForm = new IssuedCarsForm(
                issuedCars.getId(),
                issuedCars.getCar(),
                issuedCars.getClients(),
                issuedCars.getIssuedDate().toString(),
                issuedCars.getReturnDate().toString()
        );
        model.addAttribute("cars", mcar);
        model.addAttribute("clients", mclient);
        model.addAttribute("issuedCarsForm", issuedCarsForm);
        return "addIssuedCars";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateIssuedCars(Model model, @PathVariable("id") String id, @ModelAttribute("issuedCarsForm") IssuedCarsForm issuedCarsForm){
        IssuedCars issuedCars = new IssuedCars();
        issuedCars.setId(id);
        issuedCars.setCar(issuedCarsForm.getCar());
        issuedCars.setClients(issuedCarsForm.getClients());
        issuedCars.setIssuedDate(LocalDate.parse(issuedCarsForm.getIssuedDate()));
        issuedCars.setReturnDate(LocalDate.parse(issuedCarsForm.getReturnDate()));
        issuedCarsService.update(issuedCars);

        model.addAttribute("list", issuedCarsService.getAll());
        return "redirect:/web/issuedcars/get/list";
    }

}
