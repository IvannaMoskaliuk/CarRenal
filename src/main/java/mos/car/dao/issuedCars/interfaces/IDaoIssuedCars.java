package mos.car.dao.issuedCars.interfaces;

import mos.car.model.IssuedCars;

import java.util.List;

public interface IDaoIssuedCars {

    IssuedCars create(IssuedCars issuedCars);
    IssuedCars get (String id);
    IssuedCars update (IssuedCars issuedCars);
    IssuedCars delete (String id);
    List<IssuedCars> getAll();

}
