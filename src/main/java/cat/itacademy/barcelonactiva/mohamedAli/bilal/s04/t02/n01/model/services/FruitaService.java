package cat.itacademy.barcelonactiva.mohamedAli.bilal.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.mohamedAli.bilal.s04.t02.n01.model.domain.Fruita;

import java.util.List;
import java.util.Optional;

public interface FruitaService {
     List<Fruita> findAllFruits();

     Optional<Fruita> findFruitById(Long id);

     Fruita saveFruita(Fruita fruitaNew);

     String deleteFruita(Long id);

     String updateFruita(Fruita fruitaNew);

}
