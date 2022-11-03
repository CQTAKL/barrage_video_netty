package com.cwj.barrage_video_netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BarrageVideoNettyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarrageVideoNettyApplication.class, args);
    }

}
