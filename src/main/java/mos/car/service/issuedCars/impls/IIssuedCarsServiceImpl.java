package mos.car.service.issuedCars.impls;

import mos.car.model.IssuedCars;
import mos.car.repository.IssuedCarsRepository;
import mos.car.service.issuedCars.interfaces.IIssuedCarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class IIssuedCarsServiceImpl implements IIssuedCarsService {

    @Autowired
    IssuedCarsRepository issuedCarsRepository;

    @Override
    public IssuedCars create(IssuedCars issuedCars) {
        issuedCars.setCreatedAt(LocalDateTime.now());
        issuedCars.setUpdateAt(LocalDateTime.now());
        return issuedCarsRepository.save(issuedCars);
    }

    @Override
    public IssuedCars get(String id) {
        return issuedCarsRepository.findById(id).orElse(null);
    }

    @Override
    public IssuedCars delete(String id) {
        IssuedCars issuedCars = this.get(id);
        issuedCarsRepository.deleteById(issuedCars.getId());
        return issuedCars;
    }

    @Override
    public IssuedCars update(IssuedCars issuedCars) {
        issuedCars.setCreatedAt(LocalDateTime.now());
        issuedCars.setUpdateAt(LocalDateTime.now());
        return issuedCarsRepository.save(issuedCars);
    }

    @Override
    public List<IssuedCars> getAll() {
        return issuedCarsRepository.findAll();
    }
}
