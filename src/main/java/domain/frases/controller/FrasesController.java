package domain.frases.controller;

import domain.frases.entity.Frases;
import domain.frases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class FrasesController {

    @Autowired
    private FrasesService service;

    @GetMapping("/series/frases")
    public Frases retornarFrases() {
        List<Frases> frases = service.gerarFrases();

        Random random = new Random();
        int randomIndex = random.nextInt(frases.size());

        return ResponseEntity.ok(frases.get(randomIndex)).getBody();
    }

}
