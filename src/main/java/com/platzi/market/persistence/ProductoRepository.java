package com.platzi.market.persistence;

import com.platzi.market.persistence.entity.Producto;

public class ProductoRepository {
    private ProductoRepository productoRepository;
    public  List<Producto> getAll() {
        return (List<Producto>) productoRepository.findAll();
    }
}
