package org.startup.devletserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DevletServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevletServerApplication.class, args);
    }

}
