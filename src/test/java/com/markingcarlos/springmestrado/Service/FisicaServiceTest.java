package com.markingcarlos.springmestrado.Service;

import com.markingcarlos.springmestrado.Entity.FisicaEntity;
import com.markingcarlos.springmestrado.InstaceGenerator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FisicaServiceTest {

    private FisicaEntity EntidadeFisica;

    @Autowired
    private FisicaService ServiceFisica = new FisicaService();

//    @Disabled
    @Test
    @DisplayName("FisicaService.save(FisicaEntity)")
    void save() {
        EntidadeFisica = InstaceGenerator.getPessoaFisica("222.333.444-00","Carlos");

        System.out.println(EntidadeFisica);

        FisicaEntity saved = ServiceFisica.save(EntidadeFisica);
        System.out.println("\n");
        System.out.println(saved);
        System.out.println("\n");

        assertEquals(EntidadeFisica,saved);
    }

    @Test
    @Disabled
    @DisplayName("FisicaService.findByCPF(cpf)")
    void findByCPF() {
        EntidadeFisica = InstaceGenerator.getPessoaFisica("222.333.444-55","user1");

        String cpf = "222.333.444-55";
        FisicaEntity saved = ServiceFisica.findByCPF(cpf);
        System.out.println("\n");
        System.out.println(saved);
        System.out.println("\n");

        assertEquals(EntidadeFisica,saved);
    }

    @Disabled
    @Test
    void delete() {
    }

    @Disabled
    @Test
    void update() {
    }

    @Disabled
    @Test
    @DisplayName("FisicaService.findAll")
    void findAll() {
        System.out.println("Find All");

        FisicaEntity ResultadoEsperado = null;

        List<FisicaEntity> Resultados = ServiceFisica.findAll();
        for(FisicaEntity resultado : Resultados){
            System.out.println(resultado);
        }

        assertNotEquals(ResultadoEsperado, Resultados);
    }
}