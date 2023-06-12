package cat.itacademy.barcelonactiva.mohamedAli.bilal.s04.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.mohamedAli.bilal.s04.t02.n01.model.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitaRepository extends JpaRepository<Fruita, Long> {
    List<Fruita> findByNom(String nom);
}
