package com.naijiz.naijizserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//mvn clean package -Dmaven.test.skip=true
@SpringBootApplication
public class NaijizServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaijizServerApplication.class, args);
    }

}
