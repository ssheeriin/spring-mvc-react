package xyz.sherin.springmvcreact;

import java.time.Duration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import xyz.sherin.springmvcreact.domain.Car;

@RestController
@RequestMapping("/api")
public class MyController {

  @GetMapping(value = "/cars/{id}", produces = "application/json")
  public Mono<Car> getCar(@PathVariable long id) {
    return Mono.just(new Car(id, "Volvo", "XC40", 2020));
  }

  @GetMapping(value = "/cars", produces = "application/json")
  public Flux<Car> cars() {
    return Flux.just(
        new Car(1L, "Volvo", "XC40", 2020),
        new Car(2L, "Volvo", "XC40", 2021),
        new Car(3L, "Volvo", "XC40", 2022),
        new Car(4L, "Volvo", "XC40", 2023),
        new Car(5L, "Volvo", "XC40", 2024)
    );
  }

  @GetMapping(value = "/cars/stream", produces = "text/event-stream")
  public Flux<Car> carStream() {
    return Flux.just(
        new Car(1L, "Volvo", "XC40", 2020),
        new Car(2L, "Volvo", "XC40", 2021),
        new Car(3L, "Volvo", "XC40", 2022),
        new Car(4L, "Volvo", "XC40", 2023),
        new Car(5L, "Volvo", "XC40", 2024)
    ).delaySequence(Duration.ofSeconds(2));
  }
}
