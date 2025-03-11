package lgois.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeansVersusComponentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansVersusComponentsApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ConversorJson conversorJson) {
		return args -> {
			String json = "{\"cep\":\"01001-000\",\"logradouro\":\"Praça da Sé\",\"localidade\":\"São Paulo\"}";
			ViaCepResponse response = conversorJson.converter(json);
			System.out.println("Dados do CEP" + response);
		};
	}

}
