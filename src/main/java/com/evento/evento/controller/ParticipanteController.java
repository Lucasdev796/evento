package com.evento.evento.controller;

import com.evento.evento.model.Participante;
import com.evento.evento.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    @GetMapping
    public List<Participante> listarTodos() {
        return participanteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Participante> buscarPorId(@PathVariable Long id) {
        return participanteService.buscarPorId(id);
    }

    @PostMapping
    public Participante criarParticipante(@RequestBody Participante participante) {
        return participanteService.salvar(participante);
    }

    @DeleteMapping("/{id}")
    public void deletarParticipante(@PathVariable Long id) {
        participanteService.deletar(id);
    }
}

