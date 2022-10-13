package de.kessler.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "de.kessler")
public class UtilserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtilserviceApplication.class, args);
    }

}
