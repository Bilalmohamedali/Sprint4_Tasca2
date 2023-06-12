package cat.itacademy.barcelonactiva.mohamedAli.bilal.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.mohamedAli.bilal.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.mohamedAli.bilal.s04.t02.n01.model.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitaServiceImpl implements FruitaService{

    @Autowired
    FruitaRepository fruitaRepository;

    @Override
    public List<Fruita> findAllFruits(){
        return fruitaRepository.findAll();
    }

    @Override
    public Optional<Fruita> findFruitById(Long id){
        if (fruitaRepository.findById(id).isPresent()){
            return fruitaRepository.findById(id);
        }
        return Optional.empty();
    }

    @Override
    public Fruita saveFruita(Fruita fruitaNew){
        if (fruitaNew != null){
            return fruitaRepository.save(fruitaNew);
        }
        return new Fruita();
    }

    @Override
    public String deleteFruita(Long id){
        if (fruitaRepository.findById(id).isPresent()){
            fruitaRepository.deleteById(id);
            return "Fruta eliminada";
        }
        return "No se encontro la fruta ";
    }

    @Override
    public String updateFruita(Fruita fruitaUpdated){
        Long num = fruitaUpdated.getId();
        if (fruitaRepository.findById(num).isPresent()){
            Fruita fruitaToUpdated = new Fruita();
            fruitaToUpdated.setId(fruitaUpdated.getId());
            fruitaToUpdated.setNom(fruitaUpdated.getNom());
            fruitaToUpdated.setQuantitatQuilos(fruitaUpdated.getQuantitatQuilos());
            fruitaRepository.save(fruitaToUpdated);
            return "Fruta actualizada";
        }
        return "La fruta no pudo ser modificada";
    }
}
