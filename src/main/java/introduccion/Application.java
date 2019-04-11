package introduccion;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"controladores","servicios"})
/*
//Se eliminan errores de duplicidad de informacion
@SpringBootApplication(exclude = { ErrorMvcAutoConfiguration.class })
//Se definen los componentes de la aplicacion
@ComponentScan(basePackages = { "com.smarthink" })
//Se identifica en que paquete se encuentran las entidades
@EntityScan("com.smarthink.dominio")
@EnableEncryptableProperties
//Perimite a Eureka Balancear
//@EnableEurekaClient*/

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

          
        };
    }

}