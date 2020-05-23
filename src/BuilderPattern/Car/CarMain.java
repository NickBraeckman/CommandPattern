package BuilderPattern.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car.Builder(123456789L).withBrand("Volvo").withLicencePlate("ABCDEF").withOwner("Bob").build();
        Car car2 = new Car.Builder(1222222L).withBrand("Mercedes").withLicencePlate("BBBBBB").build();
        System.out.println(car1);
        System.out.println(car2);
    }
}
