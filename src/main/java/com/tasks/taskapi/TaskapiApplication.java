package com.tasks.taskapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskapiApplication.class, args);

	}

	@Bean
	CommandLineRunner initDatabase(TaskRepo repo) {
		return args -> {
			repo.save(new Task("Task number 1", false));
			repo.save(new Task("Task number 2", true));
		};
	}
}
