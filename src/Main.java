public class Main {
    public static void main(String[] args) {
        Transport car = new Car ("car1", 4);
        Transport car2 = new Car("car2", 4);


        Transport truck = new Truck("track1", 8);
        Transport truck2 = new Truck("track2",8);


        Transport bicycle = new Bicycle("Bicycle1",2);
        Transport bicycle2 = new Bicycle("Bicycle2",2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
