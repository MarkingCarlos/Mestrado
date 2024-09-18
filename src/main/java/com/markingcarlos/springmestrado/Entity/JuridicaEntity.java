package com.markingcarlos.springmestrado.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PessoaJuridica")
@Getter
@Setter
@ToString(callSuper = true, includeFieldNames = true)
@EqualsAndHashCode(callSuper = false)
public class JuridicaEntity extends PessoaEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "cnpj", unique = true)
    private String cnpj;

    public JuridicaEntity(){

    }
}
