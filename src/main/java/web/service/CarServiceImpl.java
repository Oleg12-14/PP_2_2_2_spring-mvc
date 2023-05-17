package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> car;
    private static int checkCar;
    SecureRandom random = new SecureRandom();
    List<String> list = Arrays.asList("Rolls-Royce", "Bugatti", "Mercedes", "Lamborghini", "Koenigsegg");
    {
        car = new ArrayList<>();
        car.add(new Car(++checkCar, list.get(random.nextInt(list.size())), "White"));
        car.add(new Car(++checkCar, list.get(random.nextInt(list.size())), "Black"));
        car.add(new Car(++checkCar, list.get(random.nextInt(list.size())), "Purple"));
        car.add(new Car(++checkCar, list.get(random.nextInt(list.size())), "Blue"));
        car.add(new Car(++checkCar, list.get(random.nextInt(list.size())), "Red"));
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
