package personal.pjy.controller;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("discover")
public class ServiceController {
    /*private final NamingService namingService;
    public ServiceController(NamingService namingService) {
        this.namingService = namingService;
    }

    @GetMapping("instances")
    public List<Instance> instanceList() throws NacosException {
        return namingService.getAllInstances("nacos.test.3");
    }
    */
}
