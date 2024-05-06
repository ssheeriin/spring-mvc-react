package xyz.sherin.springmvcreact;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.sherin.springmvcreact.domain.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
