package net.xdclass.shopmanager;

import net.xdclass.shopmanager.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		User user = User.builder().id(1).email("66666@qq.com").phone("1231312").build();
		System.out.println(user);
		User user1 = User.builder().build();
	}

}
