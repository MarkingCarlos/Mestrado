package com.markingcarlos.springmestrado.Service;

import com.markingcarlos.springmestrado.Entity.FisicaEntity;
import com.markingcarlos.springmestrado.Repository.FisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FisicaService {

    @Autowired
    private FisicaRepository repositorioFisic;

    public FisicaService() {

    }

    public FisicaEntity save(FisicaEntity entity) {
        FisicaEntity persistedEntity = null;

        if(repositorioFisic != null){
            persistedEntity = repositorioFisic.save(entity);
        }

        return persistedEntity;
    }

    public FisicaEntity findByCPF(String cpf) {
        FisicaEntity fisicaEntity = null;

        if(repositorioFisic != null){
            fisicaEntity = repositorioFisic.findByCpf(cpf);
        }

        return fisicaEntity;
    }

    public void Delete(FisicaEntity entity) {
        if(repositorioFisic != null){
            repositorioFisic.delete(entity);
        }
    }

    public FisicaEntity Update(FisicaEntity entity) {
        FisicaEntity persistedEntity = null;
        if(repositorioFisic != null){
            persistedEntity = repositorioFisic.save(entity);
        }
        return persistedEntity;
    }

    public List<FisicaEntity> findAll(){
        List<FisicaEntity>  ListaFisica = null;

        if(repositorioFisic != null){
            ListaFisica = new ArrayList<>();
            ListaFisica = repositorioFisic.findAll();
        }

        return ListaFisica;
    }

}
