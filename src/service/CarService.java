package service;

import technic.Car;
import technic.Computer;
import technic.Technique;

import java.util.ArrayList;
import java.util.List;


public class CarService implements Service{
    List<Car> cars = new ArrayList<>();
    @Override
    public void repair(Technique technique) {
        if (technique instanceof Car) {
            technique.setBroken(false);
            cars.add((Car) technique);
            System.out.println("Машина отремонтирована " + ((Car) technique).getModel());
        } else {
            throw new IllegalArgumentException("Этот сервис ремонтирует только легковые автомобили");
        }

    }

    public List<Car> getCars() {
        return cars;
    }
}
