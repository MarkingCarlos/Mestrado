package com.markingcarlos.springmestrado.Repository;

import com.markingcarlos.springmestrado.Entity.FisicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FisicaRepository extends JpaRepository<FisicaEntity, Long> {

    FisicaEntity findByCpf(String cpf);

}
