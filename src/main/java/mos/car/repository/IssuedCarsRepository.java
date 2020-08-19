package mos.car.repository;

import mos.car.model.IssuedCars;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuedCarsRepository extends MongoRepository<IssuedCars, String> {
}
