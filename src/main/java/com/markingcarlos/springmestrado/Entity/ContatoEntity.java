package com.markingcarlos.springmestrado.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity(name = "Contato")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ContatoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idContato;

    private String telefoneResidencial;
    private String telefoneComercial;
    private String Celular;
    private String email;

    public ContatoEntity() {

    }
}
