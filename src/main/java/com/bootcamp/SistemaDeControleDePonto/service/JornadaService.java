package com.bootcamp.SistemaDeControleDePonto.service;

import com.bootcamp.SistemaDeControleDePonto.model.JornadaTrabalho;
import com.bootcamp.SistemaDeControleDePonto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }


    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }


    public ResponseEntity<JornadaTrabalho> findById(Long id){
        return ResponseEntity.ok(jornadaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Jornada não encontrada")));
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteById(Long id) {
        try{
            jornadaRepository.deleteById(id);
        } catch (Exception e){
            System.out.println("Jornada não encontrada");
           e.printStackTrace();
        }

    }


}
