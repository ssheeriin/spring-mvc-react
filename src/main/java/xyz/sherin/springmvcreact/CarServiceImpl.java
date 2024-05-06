package xyz.sherin.springmvcreact;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.sherin.springmvcreact.domain.Car;

@Service
public class CarServiceImpl implements CarService {

  @Autowired
  private CarRepository carRepository;

  @Override
  public Optional<Car> getCarById(long id) {
    return carRepository.findById(id);
  }

  @Override
  public Iterable<Car> getAllCars() {
    return carRepository.findAll();
  }
}
