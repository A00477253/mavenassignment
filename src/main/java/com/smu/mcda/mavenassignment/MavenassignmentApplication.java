package com.smu.mcda.mavenassignment;

import com.smu.mcda.mavenassignment.controller.StringManipulation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class MavenassignmentApplication {



	public static void main(String[] args) {



		SpringApplication.run(MavenassignmentApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a lowercase string: ");
		String input = scanner.nextLine();
		scanner.close();
		StringManipulation service= new StringManipulation();
		String captializeString = service.captializeString(input);
		System.out.println("Capitalized String " + captializeString);
		String result=service.processString(input);
		System.out.println("MD5 hex is " + result);

	}
}
