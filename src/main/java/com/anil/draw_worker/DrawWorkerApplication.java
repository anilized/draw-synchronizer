package com.anil.draw_worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DrawWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrawWorkerApplication.class, args);
	}

}
