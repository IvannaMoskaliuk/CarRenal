package mos.car.service.clients.impls;

import mos.car.model.Clients;
import mos.car.repository.ClientsRepository;
import mos.car.service.clients.interfaces.IClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClientsServiceImpl implements IClientsService {

    @Autowired
    ClientsRepository clientsRepository;

    @Override
    public Clients create(Clients clients) {
        clients.setCreatedAt(LocalDateTime.now());
        clients.setUpdateAt(LocalDateTime.now());
        return clientsRepository.save(clients);
    }

    @Override
    public Clients get(String id) {
        return clientsRepository.findById(id).orElse(null);
    }

    @Override
    public Clients update(Clients clients) {
        clients.setCreatedAt(LocalDateTime.now());
        clients.setUpdateAt(LocalDateTime.now());
        return clientsRepository.save(clients);
    }

    @Override
    public Clients delete(String id) {
        Clients clients = this.get(id);
        clientsRepository.deleteById(clients.getId());
        return clients;
    }

    @Override
    public List<Clients> getAll() {
        return clientsRepository.findAll();
    }
}
