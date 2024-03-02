package org.proyecto.services;

import jakarta.annotation.PostConstruct;
import org.proyecto.configurations.ClienteConfig;
import org.proyecto.models.Cliente;
import org.proyecto.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteConfig clienteConfig;

    @PostConstruct
    public void initClientesIniciales() {
        List<Cliente> clientesIniciales = clienteConfig.clientesIniciales();
        if (clienteRepository.count() == 0) {
            clienteRepository.saveAll(clientesIniciales);
        }
    }

    public void mostrarClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        clientes.forEach(System.out::println);
    }
}
