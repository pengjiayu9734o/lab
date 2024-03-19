package personal.pjy.config;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscoverConfig {
    /*@Bean
    NamingService namingService() throws NacosException {
        return NamingFactory.createNamingService("localhost");
    }*/
}
