package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> car;
    private static int checkCar;
    {
        car = new ArrayList<>();
        car.add(new Car(++checkCar, "lada", "Red"));
        car.add(new Car(++checkCar, "lada", "Red"));
        car.add(new Car(++checkCar, "lada", "Red"));
        car.add(new Car(++checkCar, "lada", "Red"));
        car.add(new Car(++checkCar, "lada", "Red"));
    }
    @Override
    public List<Car> getCar(int count) {
        if (count >= 0) {
            return car.stream().limit(count).toList();
        } else {
            return car;
        }
    }
}
