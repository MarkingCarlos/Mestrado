package com.markingcarlos.springmestrado.Entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "PessoaFisica")
@Getter
@Setter
@ToString(callSuper = true,includeFieldNames = true)
@EqualsAndHashCode(callSuper = false, exclude = {"DataNascimento"})
public class FisicaEntity extends PessoaEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "cpf",unique = true)
    private String cpf;

    @Temporal(TemporalType.TIMESTAMP)
    private Date DataNascimento;

    public FisicaEntity(){

    }
}
