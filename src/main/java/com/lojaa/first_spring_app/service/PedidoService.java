package com.lojaa.first_spring_app.service;

import com.lojaa.first_spring_app.model.Pedido;
import com.lojaa.first_spring_app.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido salvar(Pedido pedido){
        return repository.save(pedido);
    }

    public List<Pedido> listarTodos(){
        return repository.findAll();
    }

    public Pedido buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}