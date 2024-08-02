package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Lada", "Priora", 2015));
        cars.add(new Car("KIA", "Sorento", 2011));
        cars.add(new Car("Haval", "H1", 2022));
        cars.add(new Car("Chevrolet", "Cruze", 2013));
        cars.add(new Car("Hyundai", "Santa Fe", 2009));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
