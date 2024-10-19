package ma.xproce.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class GateWayApplication<RouteLocator> {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }



}
