package BuilderPattern.Car;

public class Car {
    public static class Builder {
        private long carId;
        private String licencePlate;
        private String owner;
        private String brand;

        public Builder(long carId) {
            this.carId = carId;
        }

        public Builder withLicencePlate(String licencePlate) {
            this.licencePlate = licencePlate;
            return this;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.carId = this.carId;
            car.licencePlate = this.licencePlate;
            car.owner = this.owner;
            car.brand = this.brand;
            return car;
        }

    }

    private long carId;
    private String licencePlate;
    private String owner;
    private String brand;

    private Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", licencePlate='" + licencePlate + '\'' +
                ", owner='" + owner + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
