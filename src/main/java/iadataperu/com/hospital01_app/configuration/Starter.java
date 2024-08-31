package iadataperu.com.hospital01_app.configuration;

import iadataperu.com.hospital01_app.model.Oficina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import iadataperu.com.hospital01_app.repository.OfficinaRepository;

@Configuration
public class Starter{

    @Autowired
    private OfficinaRepository officinaRepository;

    @Bean
    CommandLineRunner initDatabase(){
        return args -> {
            Oficina oficina = new Oficina();
            oficina.setDescripcion("Oficina test");
            officinaRepository.save(oficina);
            System.out.println("The application has started and saved");
        };
    }
}
