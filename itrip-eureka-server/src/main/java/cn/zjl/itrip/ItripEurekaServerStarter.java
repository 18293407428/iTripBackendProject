package cn.zjl.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by shkstart on 2020/7/22.
 */


@EnableEurekaServer
@SpringBootApplication
public class ItripEurekaServerStarter {

    public static void main(String[] args) {
        SpringApplication.run(ItripEurekaServerStarter.class, args);

    }
}
