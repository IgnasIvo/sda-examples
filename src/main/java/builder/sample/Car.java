package builder.sample;

import java.util.Objects;

/***
 *
 * @author Ignas Ivoska
 *
 */
public class Car {
    private final String make;
    private final String model;
    private final Integer year;
    private Double engine;
    private Integer numberOfWheels = 4;
    private Integer wheelSize;

    private Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static class Builder {
        private final Car car;

        public Builder(String make, String model, Integer year) {
            this.car = new Car(make, model, year);
        }

        public Builder withEngine(Double engine) {
            car.engine = engine;
            return this;
        }

        public Builder withNumberOfWheels(Integer wheels) {
            car.numberOfWheels = wheels;
            return this;
        }

        public Builder withWheelSize(Integer wheelSize) {
            car.wheelSize = wheelSize;
            return this;
        }

        public Car build() {
            return car;
        }

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Integer getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(Integer wheelSize) {
        this.wheelSize = wheelSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(year, car.year) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(numberOfWheels, car.numberOfWheels) &&
                Objects.equals(wheelSize, car.wheelSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, engine, numberOfWheels, wheelSize);
    }
}
