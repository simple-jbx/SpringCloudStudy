package tech.snnukf.sprincloudalibabanacos9002.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author simple.jbx
 * @ClassName CloudAlibabaNacos9001Appliaction
 * @description //TODO
 * @email jb.xue@qq.com
 * @github https://github.com/simple-jbx
 * @date 2022/02/23/ 15:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacos9002Appliaction {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacos9002Appliaction.class, args);
    }
}
