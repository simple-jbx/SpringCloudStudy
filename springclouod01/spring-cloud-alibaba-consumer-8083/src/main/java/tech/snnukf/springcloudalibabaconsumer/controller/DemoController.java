package tech.snnukf.springcloudalibabaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author simple.jbx
 * @ClassName DemoController
 * @description //TODO
 * @email jb.xue@qq.com
 * @github https://github.com/simple-jbx
 * @date 2022/02/27/ 14:57
 */
@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/nacos")
    public String getDiscovery() {
        System.out.println("serverURL ==> " + serverURL);
        return restTemplate.getForObject(serverURL + "/simple", String.class);
    }

}
