package com.markingcarlos.springmestrado;

import com.markingcarlos.springmestrado.Entity.AcessoEntity;
import com.markingcarlos.springmestrado.Entity.ContatoEntity;
import com.markingcarlos.springmestrado.Entity.EnderecoEntity;
import com.markingcarlos.springmestrado.Entity.FisicaEntity;

import java.util.Date;

public class InstaceGenerator {

    public static FisicaEntity getPessoaFisica(String cpf, String user) {
        FisicaEntity pesssoaFisica = new FisicaEntity();

        pesssoaFisica.setCpf(cpf);
        pesssoaFisica.setDataNascimento(new Date());
        pesssoaFisica.setNome("Juca Chaves");

        AcessoEntity acceso = new AcessoEntity();
        acceso.setUsuario(user);
        acceso.setSenha("deitel");
        pesssoaFisica.setAcesso(acceso);

        ContatoEntity contato = new ContatoEntity();
        contato.setTelefoneResidencial("3333-4444");
        contato.setTelefoneComercial("3333-5555");
        contato.setCelular("98888-7777");
        contato.setEmail("juca@chaves.com.br");
        pesssoaFisica.setContato(contato);

        EnderecoEntity endereco1 = new EnderecoEntity();
        endereco1.setRua("Avenida 24A");
        endereco1.setNumero(1515);
        endereco1.setBairro("Bela Vista");
        endereco1.setCep("13506-900");
        endereco1.setCidade("Rio Claro");
        endereco1.setEstado("SP");

        EnderecoEntity endereco2 = new EnderecoEntity();
        endereco2.setRua("Avenida 24A");
        endereco2.setNumero(2020);
        endereco2.setBairro("Bela Vista");
        endereco2.setCep("13506-900");
        endereco2.setCidade("Rio Claro");
        endereco2.setEstado("SP");

        EnderecoEntity endereco3 = new EnderecoEntity();
        endereco3.setRua("Avenida 24A");
        endereco3.setNumero(3030);
        endereco3.setBairro("Bela Vista");
        endereco3.setCep("13506-900");
        endereco3.setCidade("Rio Claro");
        endereco3.setEstado("SP");

        pesssoaFisica.SetEnderecoUnico(endereco1);
        pesssoaFisica.SetEnderecoUnico(endereco2);
        pesssoaFisica.SetEnderecoUnico(endereco3);

        return pesssoaFisica;
    }
}
