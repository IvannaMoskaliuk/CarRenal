package mos.car.dao.clients.interfaces;

import mos.car.model.Clients;

import java.util.List;

public interface IDaoClients {

    Clients create(Clients clients);
    Clients get (String id);
    Clients update(Clients clients);
    Clients delete(String id);
    List<Clients> getAll();
}
