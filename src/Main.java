// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car=new Car("BMW",23,"Grey");
        System.out.println(car);
        SportCar sportCar=new SportCar("Lamborgini",23,"Red");
        System.out.println(sportCar);
        PassengerCar passengerCar=new PassengerCar("Niva",37,"White");
        System.out.println(passengerCar);
    }
}