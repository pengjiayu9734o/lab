/*
package personal.pjy.boot;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RegistryService implements ApplicationRunner {
    private final NamingService namingService;
    public RegistryService(NamingService namingService) {
        this.namingService = namingService;
    }
    @Override
    public void run(ApplicationArguments args) {
        try {
            namingService.registerInstance("nacos.lab", "127.0.0.1", 8081, "TEST1");
        } catch (NacosException e) {
            throw new RuntimeException(e);
        }
    }

}
*/
