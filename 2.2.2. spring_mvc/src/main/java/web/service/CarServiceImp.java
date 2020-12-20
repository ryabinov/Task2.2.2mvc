package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{

    @Override
    public List<Car> findByCars() {
        return listCars();
    }

    public List<Car> listCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,"Уаз", "Зеленый"));
        cars.add(new Car(2,"Газ", "Белый"));
        cars.add(new Car(3,"LADA", "Баклажан"));
        cars.add(new Car(4,"BMW", "Blue"));
        cars.add(new Car(5,"ЗаЗ", "Бежевый"));
        return cars;
    }

}
