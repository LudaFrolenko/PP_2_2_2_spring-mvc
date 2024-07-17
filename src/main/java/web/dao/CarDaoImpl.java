package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("LADA", "RED", 2020),
            new Car("LADA", "WHITE", 2019),
            new Car("LADA", "BLACK", 2018),
            new Car("NIVA 4X4", "RED", 2017),
            new Car("NIVA 4X4", "WHITE", 2016)
    ));

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return new ArrayList<>(cars);
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
