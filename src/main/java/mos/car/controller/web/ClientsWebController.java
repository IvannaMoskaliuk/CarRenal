package mos.car.controller.web;

import mos.car.form.ClientsForm;
import mos.car.model.Clients;
import mos.car.service.clients.impls.ClientsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/clients")
public class ClientsWebController {

    @Autowired
    ClientsServiceImpl clientsService;

    @RequestMapping(value = "/get/list", method = RequestMethod.GET)
    String showAll(Model model){
        model.addAttribute("list", clientsService.getAll());
        return "clientslist";
    }

    @RequestMapping(value = "/get/list{str}", method = RequestMethod.GET)
    String showSearchList(Model model){
        model.addAttribute("list", clientsService.getAll());
        return "clientslist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteClients(@PathVariable("id") String id, Model model){
        clientsService.delete(id);
        model.addAttribute("list", clientsService.getAll());
        return "redirect:/web/clients/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createClients(Model model){
        ClientsForm clientsForm = new ClientsForm();
        model.addAttribute("clientsForm", clientsForm);
        return "addClient";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createClients(Model model, @ModelAttribute("clientsForm") ClientsForm clientsForm){
        Clients clients = new Clients();
        clients.setSurname(clientsForm.getSurname());
        clients.setName(clientsForm.getName());
        clients.setFatherName(clientsForm.getFatherName());
        clients.setAddress(clientsForm.getAddress());
        clients.setTelephone(clientsForm.getTelephone());
        clientsService.create(clients);

        model.addAttribute("list", clientsService.getAll());
        return "redirect:/web/clients/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateClients(@PathVariable("id") String id, Model model){
        Clients clients = clientsService.get(id);
        ClientsForm clientsForm = new ClientsForm(
                clients.getId(),
                clients.getSurname(),
                clients.getName(),
                clients.getFatherName(),
                clients.getAddress(),
                clients.getTelephone()
        );
        model.addAttribute("clientsForm", clientsForm);
        return "addClient";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateClients(Model model, @PathVariable("id") String id, @ModelAttribute("clientsForm") ClientsForm clientsForm){
        Clients clients = new Clients();
        clients.setId(id);
        clients.setSurname(clientsForm.getSurname());
        clients.setName(clientsForm.getName());
        clients.setFatherName(clientsForm.getFatherName());
        clients.setAddress(clientsForm.getAddress());
        clients.setTelephone(clientsForm.getTelephone());
        clientsService.update(clients);

        model.addAttribute("list", clientsService.getAll());
        return "redirect:/web/clients/get/list";
    }
}
