package com.trytecom.bir.recovery.repositorio;


import com.trytecom.bir.recovery.entidade.FicheiroEae;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FicheiroEaeRepository extends JpaRepository<FicheiroEae, Long> {
}
