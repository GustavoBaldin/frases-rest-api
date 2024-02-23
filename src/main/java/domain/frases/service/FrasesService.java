package domain.frases.service;

import domain.frases.entity.Frases;
import domain.frases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrasesService {

    @Autowired
    private FrasesRepository repository;

    public Frases gerarFrase() {
        return repository.buscarFraseAleatoria();
    }

}
