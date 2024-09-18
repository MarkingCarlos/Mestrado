package com.markingcarlos.springmestrado.Entity;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PessoaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoa;

    private String nome;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "pessoa_idpessoa")
    private List<EnderecoEntity> enderecos;

    private AcessoEntity acesso;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contato_idcontato")
    private ContatoEntity contato;

    public PessoaEntity(){
        this.enderecos = new ArrayList<EnderecoEntity>();
    }

    public void SetEnderecoUnico(EnderecoEntity endereco){
        this.enderecos.add(endereco);
    }
}
