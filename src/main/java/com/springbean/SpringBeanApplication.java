package com.springbean;

import com.springbean.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeanApplication implements CommandLineRunner {

	// Injection dependency by @Autowired annotation
	@Autowired
	private Item item;

	// Injection dependency by Constructor
	public SpringBeanApplication(Item item) {
		this.item = item;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(item.toString());
		System.out.println("Run..");
	}
}
