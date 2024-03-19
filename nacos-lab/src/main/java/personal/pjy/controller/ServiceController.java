package personal.pjy.controller;

import com.alibaba.nacos.api.exception.NacosException;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.pjy.api.Node1Service;

@RestController
@RequestMapping("discover")
public class ServiceController {
    @DubboReference(interfaceName = "personal.pjy.api.Node1Service")
    Node1Service node1Service;
    @GetMapping("sayHi")
    public String instanceList() throws NacosException {
        return node1Service.sayHi();
    }
}
