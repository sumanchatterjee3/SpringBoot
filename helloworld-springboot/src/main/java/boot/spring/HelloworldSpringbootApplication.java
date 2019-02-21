package boot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Import({HelloJava.class})

public class HelloworldSpringbootApplication {
	
	@RequestMapping("/")
	
	
	String hello() {
		return "Hello from Spring Boot";
	}

	public static void main(String[] args) {
//		HelloJava hj = new HelloJava();
//		String myres = hj.getHello();
		SpringApplication.run(HelloworldSpringbootApplication.class, args);
	}

}
