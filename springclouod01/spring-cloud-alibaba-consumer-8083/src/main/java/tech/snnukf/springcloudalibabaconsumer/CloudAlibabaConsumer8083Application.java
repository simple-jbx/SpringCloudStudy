package tech.snnukf.springcloudalibabaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author simple.jbx
 * @ClassName CloudAlibabaConsumer8083Application
 * @description //TODO
 * @email jb.xue@qq.com
 * @github https://github.com/simple-jbx
 * @date 2022/02/24/ 15:15
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConsumer8083Application {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(CloudAlibabaConsumer8083Application.class));
    }

    @Bean
    @LoadBalanced
    public RestTemplate resetTemplate() {
        return new RestTemplate();
    }
}
