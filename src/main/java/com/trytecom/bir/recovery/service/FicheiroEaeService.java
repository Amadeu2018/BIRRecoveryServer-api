package com.trytecom.bir.recovery.service;

import com.trytecom.bir.recovery.entidade.FicheiroEae;
import com.trytecom.bir.recovery.repositorio.FicheiroEaeRepository;
import com.trytecom.bir.recovery.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FicheiroEaeService {

    @Autowired
    private FicheiroEaeRepository repository;

    public FicheiroEae findById(Long id) {
        Optional<FicheiroEae> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! id: " + id + ", Tipo: " + FicheiroEae.class.getName()));
    }

    public List<FicheiroEae> findAll() {
        return repository.findAll();
    }

    public FicheiroEae update(Long id, FicheiroEae obj) {
        FicheiroEae newObj = findById(id);
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(FicheiroEae newObj, FicheiroEae obj) {

        newObj.setVersion(obj.getVersion());
        newObj.setAccount_id(obj.getAccount_id());
        newObj.setAccountRef(obj.getAccountRef());
        newObj.setAccountTypeCode(obj.getAccountTypeCode());
        newObj.setAccountTypeName(obj.getAccountTypeName());
        newObj.setAccountTypeName(obj.getCreditAmount());
        newObj.setCredAnalyAccountNum( obj.getCredAnalyAccountNum());
        newObj.setCreditCurrency(obj.getCreditCurrency());
        newObj.setCredSyntAccountNum(obj.getCredSyntAccountNum());
        newObj.setDebitAmount(obj.getDebitAmount());
        newObj.setDebAnalyAccountNum(obj.getDebAnalyAccountNum());
        newObj.setDebitCurrency(obj.getDebitCurrency());
        newObj.setDebSyntAccountNum(obj.getDebSyntAccountNum());
        newObj.setPostingDate(obj.getPostingDate());
        newObj.setTransactAmount(obj.getTransactAmount());
        newObj.setTransactCurre(obj.getTransactCurre());
        newObj.setTransactDesc(obj.getTransactDesc());
        newObj.setTransactId(obj.getTransactId());
        newObj.setTransactLocalDate(obj.getTransactLocalDate());
        newObj.setWay4Header_id(obj.getWay4Header_id());
        newObj.setStatus(obj.getStatus());
        newObj.setCoreNumber(obj.getCoreNumber());
        newObj.setTransference_id(obj.getTransference_id());
    }

    public FicheiroEae create(FicheiroEae obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public void delete(Long id) {
        FicheiroEae obj = findById(id);
        repository.delete(obj);
    }
}
