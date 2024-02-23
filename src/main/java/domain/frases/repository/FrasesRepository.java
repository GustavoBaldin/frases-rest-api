package domain.frases.repository;


import domain.frases.entity.Frases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FrasesRepository extends JpaRepository<Frases,Long> {
}
