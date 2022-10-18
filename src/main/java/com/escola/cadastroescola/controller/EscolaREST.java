package com.escola.cadastroescola.controller;

import com.escola.cadastroescola.database.RepositoryEscola;
import com.escola.cadastroescola.orm.Escola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escola")
public class EscolaREST {

    @Autowired
    private RepositoryEscola repository;

    @GetMapping
    public List<Escola> listar(){
        return repository.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Escola escola){
        repository.save(escola);
    }

    @PutMapping
    public void alterar(@RequestBody Escola escola){
        if(escola.getId() > 0)
            repository.save(escola);
    }

    @DeleteMapping
    public void excluir(Escola escola){
        repository.delete(escola);
    }


}
