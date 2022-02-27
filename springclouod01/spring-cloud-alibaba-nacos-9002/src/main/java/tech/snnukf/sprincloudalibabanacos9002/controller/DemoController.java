package tech.snnukf.sprincloudalibabanacos9002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simple.jbx
 * @ClassName DemoController
 * @description //TODO
 * @email jb.xue@qq.com
 * @github https://github.com/simple-jbx
 * @date 2022/02/23/ 16:12
 */
@RestController
public class DemoController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value="/simple")
    public String getServerPort() {
        return "Hello Nacos & serverPort ==> " + serverPort;
    }
}
