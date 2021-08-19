package com.trytecom.bir.recovery.service;

import com.trytecom.bir.recovery.entidade.FicheiroGlAccount;
import com.trytecom.bir.recovery.repositorio.FicheiroEaeRepository;
import com.trytecom.bir.recovery.repositorio.FicheiroGlAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DBService {



    @Autowired
	private FicheiroGlAccountRepository ficheiroGlAccountRepository;

	@Autowired
	private FicheiroEaeRepository ficheiroEaeRepository;

    public void instanciaBaseDeDados() {
            /*FicheiroGlAccount glAccount = new FicheiroGlAccount(null, "Informática", "Livros de TI");
            Categoria cat2 = new Categoria(null, "Informática", "Livros de TI");

    		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat1);
            Livro l2 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", cat2);

    		cat1.getLivros().addAll(Arrays.asList(l1));
    		cat2.getLivros().addAll(Arrays.asList(l2));

    		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
    		this.livroRepository.saveAll(Arrays.asList(l1, l2));*/
    }

}