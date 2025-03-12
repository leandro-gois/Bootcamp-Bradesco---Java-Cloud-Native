package lgois.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lgois.jpa.model.User;
import lgois.jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        insertUser(); // Call the insertUser method
        List<User> users = repository.findByNameContaining("LEANDRO");
        for(User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user = new User();
        user.setName("MARCIO GOIS");
        user.setUsername("marcio");
        user.setPassword("teste");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}