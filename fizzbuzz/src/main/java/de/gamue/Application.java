package de.gamue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@SpringBootApplication
@RestController
@ApiIgnore("Dummy API which shouldn't be part of the documentation.")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
  public String home() {
    return "Welcome to the playground";
  }
}
