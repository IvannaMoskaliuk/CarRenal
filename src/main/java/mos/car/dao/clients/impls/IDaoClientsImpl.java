package mos.car.dao.clients.impls;

import mos.car.dao.clients.interfaces.IDaoClients;
import mos.car.datastorage.DataFake;
import mos.car.model.Clients;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IDaoClientsImpl implements IDaoClients {

    @Autowired
    DataFake dataFake;

    @Override
    public Clients create(Clients clients) {
        return null;
    }

    @Override
    public Clients get(String id) {
        return null;
    }

    @Override
    public Clients update(Clients clients) {
        return null;
    }

    @Override
    public Clients delete(String id) {
        return null;
    }

    @Override
    public List<Clients> getAll() {
        return dataFake.getClients();
    }
}
