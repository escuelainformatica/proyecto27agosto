package com.example.project1.controller;

import com.example.project1.modelo.Cliente;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CustomerController {
    @RequestMapping(value = "/orders")
    public String Ejemplo() {
        String result="ok";
        return result;
    }
    @GetMapping(value="/sumar/{id1}/{id2}")
    public int Sumar(@PathVariable int id1,@PathVariable int id2) {
        return id1+id2;
    }
    @GetMapping(value="/paises")
    public List<String> paises() {
        List<String> listado=new ArrayList<String>();
        listado.add("Chile");
        listado.add("Peru");
        listado.add("Bolivia");
        return listado;
    }

    @GetMapping(value="/obtenercliente")
    public Cliente obtenerCliente() {
        Cliente cli=new Cliente(); // el constructor vacio.
        cli.setId(1);
        cli.setNombre("john");
        cli.setCorreo("john@model.com");
        Cliente cli2=new Cliente(1,"john","john@model.com"); // el constructor
        return cli;
    }
    @PostMapping(value="/insertarcliente")
    public Cliente insertarCliente(@RequestBody Cliente cli) {
        return cli;
    }


}
