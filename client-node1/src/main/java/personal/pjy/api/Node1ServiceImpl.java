package personal.pjy.api;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService
public class Node1ServiceImpl implements Node1Service {
    @Override
    public String sayHi() {
        return "hi";
    }
}
