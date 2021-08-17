package com.trytecom.bir.recovery.repositorio;


import com.trytecom.bir.recovery.entidade.FicheiroDdr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FicheiroDdrRepository extends JpaRepository<FicheiroDdr, Long> {
}
