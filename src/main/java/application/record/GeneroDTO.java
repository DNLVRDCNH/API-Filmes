package application.record;

import application.model.Genero;

public record GeneroDTO(long id, String Nome){
        public GeneroDTO(Genero dados) {
            this(dados.getId(), dados.getNome());
        }

}