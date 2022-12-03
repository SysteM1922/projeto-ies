package com.PASSIT.PASSIT;

import com.PASSIT.PASSIT.model.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PassitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassitServiceApplication.class, args);
	}



}
