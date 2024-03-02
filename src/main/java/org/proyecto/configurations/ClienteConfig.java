package org.proyecto.configurations;

import org.proyecto.models.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class ClienteConfig {
    @Bean(name = "clientesIniciales")
    public List<Cliente> clientesIniciales() {
        Cliente cliente1 = new Cliente(200, "SENA", "email@sena.edu.co");
        Cliente cliente2 = new Cliente(300, "empresa-sas", "email@empresa-sas.co");
        return Arrays.asList(cliente1, cliente2);
    }
}
