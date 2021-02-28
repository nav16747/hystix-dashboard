package com.dialycodebuffer.hystix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class HystixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystixDashboardApplication.class, args);
	}

}
