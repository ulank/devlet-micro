package org.startup.devletaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DevletAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevletAccountApplication.class, args);
    }

}
