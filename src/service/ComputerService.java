package service;

import technic.Car;
import technic.Computer;
import technic.Technique;

import java.util.ArrayList;
import java.util.List;

public class ComputerService implements Service {
    List<Computer> computers = new ArrayList<>();
    @Override
    public void repair(Technique technique) {
        // Проверка, является ли переданная техника экземпляром класса Computer
        if (technique instanceof Computer) {
            technique.setBroken(false); // Установка состояния техники в починенное
            computers.add((Computer) technique); // Добавление отремонтированного компьютера в список всех обслуженных компьютеров сервиса
            System.out.println("Компьютер отремонтирован " + ((Computer) technique).getModel());
        } else {
            throw new IllegalArgumentException("Этот сервис ремонтирует только компьютеры"); // Выброс исключения, если техника не является компьютером
        }

    }

    public List<Computer> getComputers() {
        return computers;
    } // Возвращение списка отремонтированных компьютеров
}
