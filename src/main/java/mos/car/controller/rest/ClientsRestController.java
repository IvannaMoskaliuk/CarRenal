package mos.car.controller.rest;

import mos.car.model.Clients;
import mos.car.service.clients.impls.ClientsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/clients/v2")
@RestController
public class ClientsRestController {

    @Autowired
    ClientsServiceImpl clientsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Clients> getClientsList(){
        return clientsService.getAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Clients createClients(@RequestBody Clients clients){
        return clientsService.create(clients);
    }

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    Clients updateClients(@RequestBody Clients clients){
        return clientsService.update(clients);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Clients getClients(@PathVariable("id") String id){
        return clientsService.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    Clients deleteClients(@PathVariable("id") String id){
        return clientsService.delete(id);
    }

}
