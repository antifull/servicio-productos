package com.antifull.servicioproductos.controllers;

import com.antifull.servicioproductos.entity.ProductoEntity;
import com.antifull.servicioproductos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductosControllers {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductoEntity> getAllProductos(){
        return productoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addProducto(@RequestBody ProductoEntity productoEntity){
        productoRepository.save(productoEntity);
    }
}
