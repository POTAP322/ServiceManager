package service;

import technic.Car;
import technic.Computer;
import technic.MobileDevice;
import technic.Technique;

import java.util.ArrayList;
import java.util.List;

public class MobileDeviceService implements Service{
    List<MobileDevice> mobilePhones = new ArrayList<>();
    @Override
    public void repair(Technique technique) {
        if (technique instanceof MobileDevice) {
            technique.setBroken(false);
            mobilePhones.add((MobileDevice) technique);
            System.out.println("Телефон отремонтирован " + ((MobileDevice) technique).getModel());
        } else {
            throw new IllegalArgumentException("Этот сервис ремонтирует только телефоны");
        }

    }

    public List<MobileDevice> getMobilePhones() {
        return mobilePhones;
    }
}
