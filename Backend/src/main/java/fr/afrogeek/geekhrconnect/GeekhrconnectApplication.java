package fr.afrogeek.geekhrconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GeekhrconnectApplication {

    public static void main(String[] args) {

        SpringApplication.run(GeekhrconnectApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Bienvenue sur notre Applications Spring ";
    }

}
