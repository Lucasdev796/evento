package com.evento.evento.service;

import com.evento.evento.model.Bloco;
import com.evento.evento.repository.BlocoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlocoService {

    @Autowired
    private BlocoRepository blocoRepository;

    public List<Bloco> listarTodos() {
        return blocoRepository.findAll();
    }

    public Optional<Bloco> buscarPorId(Long id) {
        return blocoRepository.findById(id);
    }

    public Bloco salvar(Bloco bloco) {
        return blocoRepository.save(bloco);
    }

    public void deletar(Long id) {
        blocoRepository.deleteById(id);
    }
}
