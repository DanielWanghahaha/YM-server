package com.linjia.publish;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan({ "com.linjia.publish.**.dao"})
public class PublishApplication {
	public static void main(String[] args) throws Exception{
		SpringApplication.run(PublishApplication.class, args);
	}
}
