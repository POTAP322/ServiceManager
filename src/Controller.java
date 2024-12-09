import service.*;
import technic.*;

public class Controller {
    public void run(){
        //создаём экземпляры классов
        Technique computer = new Computer(true, "ASUS TUF", "i7-7700k", "gtx-1060", 8);
        Technique mobileDevice = new MobileDevice(true, "Redmi note 13", "snapdragon 685", 6);
        Technique car = new Car(false, "1HGBH41JXMN109186", "porshe 911");
        Technique car2 = new Car(false, "WBA3A5C54DF321876", "BMW M5");
        Technique truck = new Truck(true, "WAUZZZ8V4FA012345", "ГАЗ-3307");

        Service computerService = new ComputerService();
        Service mobileDeviceService = new MobileDeviceService();
        Service carService = new CarService();
        Service truckService = new TruckService();

        // Поломка техники
        computer.breakTechnique();
        mobileDevice.breakTechnique();
        car.breakTechnique();
        truck.breakTechnique();

        System.out.println();
        // Проверка состояния техники
        System.out.println("Компьютер поломан? " + computer.getModel() + " " + computer.checkStatus());
        System.out.println("Телефона сломан? " + mobileDevice.getModel() + " " + mobileDevice.checkStatus());
        System.out.println("Машина сломана? " + car.getModel() + " " + car.checkStatus());
        System.out.println("Грузовик сломан?" + truck.getModel() + " " + truck.checkStatus());

        System.out.println();
        // Ремонт техники
        computerService.repair(computer);
        mobileDeviceService.repair(mobileDevice);
        carService.repair(car);
        carService.repair(car2);
        truckService.repair(truck);

        System.out.println();
        // Проверка состояния техники после ремонта
        System.out.println("Компьютер поломан? " + computer.checkStatus());
        System.out.println("Телефона сломан? " + mobileDevice.checkStatus());
        System.out.println("Машина сломана? " + car.checkStatus());
        System.out.println("Грузовик сломан? " + truck.checkStatus());

        System.out.println();
        // Вывод информации о клиентах
        System.out.println("Обслуэенные компьютеры " + ((ComputerService) computerService).getComputers().size());
        System.out.println("Обслуэенные телефоны " + ((MobileDeviceService) mobileDeviceService).getMobilePhones().size());
        System.out.println("Обслуэенные машины " + ((CarService) carService).getCars().size());
        System.out.println("Обслуэенные грузовики " + ((TruckService) truckService).getTrucks().size());

    }
}
