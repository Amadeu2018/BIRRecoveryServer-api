package com.trytecom.bir.recovery.service;

import com.trytecom.bir.recovery.dtos.FicheiroGlAccountDTO;
import com.trytecom.bir.recovery.entidade.FicheiroGlAccount;
import com.trytecom.bir.recovery.repositorio.FicheiroGlAccountRepository;
import com.trytecom.bir.recovery.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FicheiroGlAccountService {

    @Autowired
    private FicheiroGlAccountRepository repository;

    public FicheiroGlAccount findById(Long id) {
        Optional<FicheiroGlAccount> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objecto não encontrado! id: " + id + ", Tipo: " + FicheiroGlAccount.class.getName()));
    }
    public List<FicheiroGlAccount> findAll(){
        return repository.findAll();
    }

    public FicheiroGlAccount create(FicheiroGlAccount obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public FicheiroGlAccount update(Long id, FicheiroGlAccountDTO objDto) {
        FicheiroGlAccount obj = findById(id);
        obj.setVersion(objDto.getVersion());
        obj.setGlAccountingAccount(objDto.getGlAccountingAccount());
        obj.setGlAccountingBranch(objDto.getGlAccountingBranch());
        obj.setGlCurrency(objDto.getGlCurrency());
        obj.setGlDescription(objDto.getGlDescription());
        obj.setGlNumber(objDto.getGlNumber());
        return repository.save(obj);
    }

    public void delete(Long id) {
        findById(id);
        try {
            repository.deleteById(id);
        }catch(DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException(
                    "FicheiroGlAccountDTO não pode ser deletado!");
        }
    }
}
