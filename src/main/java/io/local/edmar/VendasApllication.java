package io.local.edmar;

import io.local.edmar.domain.entity.Cliente;
import io.local.edmar.domain.entity.Pedido;
import io.local.edmar.domain.repository.Clientes;
import io.local.edmar.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@RestController  // controladora rest, manda menssagens para o browser
@SpringBootApplication  //classe inicializadora do projeto
public class VendasApllication {


    @Bean
    public CommandLineRunner init(
            @Autowired Clientes clientes){

        return args -> {

            Cliente c = new Cliente(null,"Fulano");
            clientes.save(c);

        };

    }

    public static void main(String[] args) {

        SpringApplication.run(VendasApllication.class, args);
    }

}
