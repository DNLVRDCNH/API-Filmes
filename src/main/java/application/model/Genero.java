package application.model;

import application.record.GeneroDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Genero {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    public Genero(GeneroDTO dados){
        this.setId(dados.id());
        this.setNome(dados.Nome());
    }
    public Genero(GeneroInsertDTO dados){
        this.setId(dados.id());
        this.setNome(dados.Nome());
    }
}
