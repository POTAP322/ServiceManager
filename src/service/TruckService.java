package service;

import technic.Car;
import technic.Computer;
import technic.Technique;
import technic.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckService implements Service{
    List<Truck> trucks = new ArrayList<>();
    @Override
    public void repair(Technique technique) {
        if (technique instanceof Truck) {
            technique.setBroken(false);
            trucks.add((Truck) technique);
            System.out.println("Грузовик отремонтирован " + ((Truck) technique).getModel());
        } else {
            throw new IllegalArgumentException("Этот сервис ремонтирует только грузовики");
        }

    }

    public List<Truck> getTrucks() {
        return trucks;
    }
}
