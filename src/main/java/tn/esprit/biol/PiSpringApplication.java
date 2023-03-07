package tn.esprit.biol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;
import org.springframework.scheduling.annotation.EnableScheduling;
import tn.esprit.biol.service.UserService;
@SpringBootApplication
public class PiSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiSpringApplication.class, args);
        System.out.println("version: " + SpringVersion.getVersion());
    }

}
