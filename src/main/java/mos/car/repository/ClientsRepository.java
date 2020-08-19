package mos.car.repository;

import mos.car.model.Clients;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends MongoRepository<Clients, String> {
}
