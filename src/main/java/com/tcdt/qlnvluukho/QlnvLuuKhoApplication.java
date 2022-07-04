package com.tcdt.qlnvluukho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EntityScan(basePackages = { "com.tcdt.qlnvluukho.entities","com.tcdt.qlnvluukho.table" })
@EnableFeignClients(basePackages = "com.tcdt.qlnvluukho.service.feign")
public class QlnvLuuKhoApplication {
	public static void main(String[] args) {
		SpringApplication.run(QlnvLuuKhoApplication.class, args);
	}

}
