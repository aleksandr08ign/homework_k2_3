import service.ServiceStation;
import transport.Bicycle;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle("салют");
        System.out.println(bicycle.getWheelsCount());

        Car car = new Car("passat", 4);
       car.updateTyre();

        Truck truck = new Truck("MAN", 4);
        truck.updateTyre();

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(car);
        serviceStation.check(truck);
    }
}
