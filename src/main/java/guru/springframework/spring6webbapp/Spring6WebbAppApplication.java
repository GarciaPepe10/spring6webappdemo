package guru.springframework.spring6webbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring6WebbAppApplication {



	public static void main(String[] args) {
		try{
		SpringApplication.run(Spring6WebbAppApplication.class, args);
		}catch(Exception ex){
			ex.printStackTrace();

		}
	}


}
