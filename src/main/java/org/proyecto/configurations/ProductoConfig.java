package org.proyecto.configurations;

import org.proyecto.models.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class ProductoConfig {
    @Bean(name = "productosIniciales")
    public List<Producto> productosIniciales() {
        Producto producto1 = new Producto(1, "Producto 1", 100.00);
        Producto producto2 = new Producto(2, "Producto 2", 150.00);
        return Arrays.asList(producto1, producto2);
    }
}
