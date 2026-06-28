package com.lojaa.first_spring_app.controller;

import com.lojaa.first_spring_app.model.Pedido;
import com.lojaa.first_spring_app.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido){
        return service.salvar(pedido);
    }

    @GetMapping
    public List<Pedido> listar(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Pedido buscar(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}