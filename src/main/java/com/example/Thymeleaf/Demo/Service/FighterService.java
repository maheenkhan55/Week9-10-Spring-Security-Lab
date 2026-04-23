package com.example.Thymeleaf.Demo.Service;

import com.example.Thymeleaf.Demo.Model.Fighter;
import com.example.Thymeleaf.Demo.repository.FighterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FighterService {

    private final FighterRepository fighterRepository;

    public FighterService(FighterRepository fighterRepository) {
        this.fighterRepository = fighterRepository;
    }

    public Fighter saveFighter(Fighter fighter) {
        return fighterRepository.save(fighter);
    }

    public List<Fighter> getAllFighters() {
        return fighterRepository.findAll();
    }

    public Optional<Fighter> getFighterById(Integer id) {
        return fighterRepository.findById(id);
    }

    public void deleteFighter(Integer id) {
        fighterRepository.deleteById(id);
    }

    public long countFighters() {
        return fighterRepository.count();
    }

    public boolean existsById(Integer id) {
        return fighterRepository.existsById(id);
    }
}