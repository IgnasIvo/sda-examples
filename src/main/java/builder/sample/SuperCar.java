package builder.sample;

import lombok.Builder;
import lombok.Data;

/***
 *
 * @author Ignas Ivoska
 *
 */
@Data
@Builder
public class SuperCar {
    private final String make;
    private final String model;
    private final Integer year;
    private Double engine;
    private Integer numberOfWheels = 4;
    private Integer wheelSize;
}
