package domain.frases.repository;


import domain.frases.entity.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FrasesRepository extends JpaRepository<Frases,Long> {

    @Query("SELECT f FROM Frases f order by rand() limit 1")
    Frases buscarFraseAleatoria();
}
