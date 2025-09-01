package application.service;

import org.springframework.beans.factory.annotation.Autowired;

import application.model.Genero;
import application.record.GeneroDTO;
import application.repository.GeneroRepository;


@service
public class GeneroService{
    @Autowired
    private GeneroRepository generoRepo;

    public iterable<GeneroDTO> getAll(){
        return generoRepo.findAll().stream().map(GeneroDTO::new).toList();
    }
    public GeneroDTO insert(GeneroInsertDTO dados) {
        return new GeneroDTO(generoRepo.save(new Genero(dados)));
    }

}