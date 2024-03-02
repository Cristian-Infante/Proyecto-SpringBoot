package org.proyecto.services;

import jakarta.annotation.PostConstruct;
import org.proyecto.configurations.ProductoConfig;
import org.proyecto.models.Producto;
import org.proyecto.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoConfig productoConfig;

    @PostConstruct
    public void initProductosIniciales() {
        List<Producto> productosIniciales = productoConfig.productosIniciales();
        if (productoRepository.count() == 0) {
            productoRepository.saveAll(productosIniciales);
        }
    }

    public void mostrarProductos() {
        List<Producto> productos = productoRepository.findAll();
        productos.forEach(System.out::println);
    }
}
