package lgois.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingletonOuPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonOuPrototypeApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemaMensagem sistemaMensagem){
		return args -> {
			sistemaMensagem.enviarConfirmacaoCadastro();
			sistemaMensagem.enviarMensagemBoasVindas();
			sistemaMensagem.enviarConfirmacaoCadastro();
		};
	}

}
