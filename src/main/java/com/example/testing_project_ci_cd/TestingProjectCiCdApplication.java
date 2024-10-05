package com.example.testing_project_ci_cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingProjectCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingProjectCiCdApplication.class, args);
		RandomWordController randomWordController = new RandomWordController();

		while (true){
            try {
				System.out.println(randomWordController.getRandomWord());
                System.out.println(randomWordController.getRandomWord());
                System.out.println(randomWordController.getRandomWord());
                System.out.println("TESTTESTTESTTEST");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
	}

}
