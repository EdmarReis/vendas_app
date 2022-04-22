package io.local.edmar;

import io.local.edmar.domain.entity.Cliente;
import io.local.edmar.domain.repositorio.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//@RestController  // controladora rest, manda menssagens para o browser
@SpringBootApplication  //classe inicializadora do projeto
public class VendasApllication {

    @Bean
    public CommandLineRunner init(@Autowired Clientes clientes){
        return args -> {
            System.out.println("Salvando clientes");
            clientes.save(new Cliente("Edmar"));
            clientes.save(new Cliente("Outro Cliente"));

            List<Cliente> result  = clientes.encontrarPorNome("Edmar");
            result.forEach(System.out::println);


        };

    }

    public static void main(String[] args) {

        SpringApplication.run(VendasApllication.class, args);
    }

}
