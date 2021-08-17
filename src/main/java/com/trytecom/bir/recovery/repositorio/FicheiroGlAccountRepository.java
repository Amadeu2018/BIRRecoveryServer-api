package com.trytecom.bir.recovery.repositorio;

import com.trytecom.bir.recovery.entidade.FicheiroGlAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FicheiroGlAccountRepository extends JpaRepository<FicheiroGlAccount, Long> {
}
