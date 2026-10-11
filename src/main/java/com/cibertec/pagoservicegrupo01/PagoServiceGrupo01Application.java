package com.cibertec.pagoservicegrupo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient

public class PagoServiceGrupo01Application {

    public static void main(String[] args) {
        SpringApplication.run(PagoServiceGrupo01Application.class, args);
    }

}
