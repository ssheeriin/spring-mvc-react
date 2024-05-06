package xyz.sherin.springmvcreact;

import java.util.Optional;
import xyz.sherin.springmvcreact.domain.Car;

public interface CarService {
  Optional<Car> getCarById(long id);
  Iterable<Car> getAllCars();
}
