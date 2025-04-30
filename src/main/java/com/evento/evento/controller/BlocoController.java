package com.evento.evento.controller;

import com.evento.evento.model.Bloco;
import com.evento.evento.service.BlocoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blocos")
public class BlocoController {

    @Autowired
    private BlocoService blocoService;

    @GetMapping
    public List<Bloco> listarTodos() {
        return blocoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Bloco> buscarPorId(@PathVariable Long id) {
        return blocoService.buscarPorId(id);
    }

    @PostMapping
    public Bloco criarBloco(@RequestBody Bloco bloco) {
        return blocoService.salvar(bloco);
    }

    @DeleteMapping("/{id}")
    public void deletarBloco(@PathVariable Long id) {
        blocoService.deletar(id);
    }
}
