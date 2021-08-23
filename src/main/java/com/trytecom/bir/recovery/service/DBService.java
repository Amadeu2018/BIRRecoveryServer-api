package com.trytecom.bir.recovery.service;

import com.trytecom.bir.recovery.entidade.FicheiroGlAccount;
import com.trytecom.bir.recovery.repositorio.FicheiroEaeRepository;
import com.trytecom.bir.recovery.repositorio.FicheiroGlAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class DBService {



    @Autowired
	private FicheiroGlAccountRepository ficheiroGlAccountRepository;

	@Autowired
	private FicheiroEaeRepository ficheiroEaeRepository;

    public void instanciaBaseDeDados() {
            FicheiroGlAccount glAccount = new FicheiroGlAccount(null, "1", "?", "125", "AKZ", "Pagamentos Blc - Conta Transitória", "3210MCXP");

    		this.ficheiroGlAccountRepository.saveAll(Arrays.asList(glAccount));
    }

}