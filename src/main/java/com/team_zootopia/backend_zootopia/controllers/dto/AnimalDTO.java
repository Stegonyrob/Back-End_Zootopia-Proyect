package com.team_zootopia.backend_zootopia.controllers.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AnimalDTO {
    private Long id;
    private String name;
    private String family;
    private String gener;
    private String origin;
    private Date admisDate;
    private String type;
    private String title;

    // Este es el constructor privado que toma un Builder como argumento
    private AnimalDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.family = builder.family;
        this.gener = builder.gener;
        this.origin = builder.origin;
        this.admisDate = builder.admisDate;
        this.type = builder.type;
        this.title = builder.title;
    }

    // Esta es la clase Builder interna estática
    public static class Builder {
        Long id;
        String name;
        String family;
        String gener;
        String origin;
        Date admisDate;
        String type;
        String title;

        // Cada uno de estos métodos configura una variable en el Builder
        // y luego devuelve el Builder para permitir la configuración encadenada
        public Builder id(Long id) {
            this.id = id;
            return this;
        }


        

    public Builder name(String name) {
        this.name = name;
        return this;
    }

    public Builder family(String family) {
        this.family = family;
        return this;
    }

    public Builder gener(String gener) {
        this.gener = gener;
        return this;
    }

    public Builder origin(String origin) {
        this.origin = origin;
        return this;
    }

    public Builder admisDate(Date admisDate) {
        this.admisDate = admisDate;
        return this;
    }
    public Builder type(String type) {
        this.type = type;
        return this;
    }

    public Builder title(String title) {
        this.title = title;
        return this;
    }
    


              // Finalmente, este método crea una nueva instancia de AnimalDTO usando el Builder
        public AnimalDTO build() {
            return new AnimalDTO(this);
        }
    }
}


    


