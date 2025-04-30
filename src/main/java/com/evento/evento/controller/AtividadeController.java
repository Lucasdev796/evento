package com.evento.evento.controller;

import com.evento.evento.model.Atividade;
import com.evento.evento.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atividades")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @GetMapping
    public List<Atividade> listarTodos() {
        return atividadeService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Atividade> buscarPorId(@PathVariable Long id) {
        return atividadeService.buscarPorId(id);
    }

    @PostMapping
    public Atividade criarAtividade(@RequestBody Atividade atividade) {
        return atividadeService.salvar(atividade);
    }

    @DeleteMapping("/{id}")
    public void deletarAtividade(@PathVariable Long id) {
        atividadeService.deletar(id);
    }
}
