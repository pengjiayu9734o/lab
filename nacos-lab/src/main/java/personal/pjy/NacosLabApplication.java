package personal.pjy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class NacosLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosLabApplication.class, args);
    }

}
