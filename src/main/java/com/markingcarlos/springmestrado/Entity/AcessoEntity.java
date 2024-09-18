package com.markingcarlos.springmestrado.Entity;


import jakarta.persistence.Column;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AcessoEntity implements Serializable {

    @Column(name = "acesso_usuario", unique = true)
    private String usuario;

    @Column(name = "acesso_senha")
    private String senha;

    public AcessoEntity(){

    }
}
