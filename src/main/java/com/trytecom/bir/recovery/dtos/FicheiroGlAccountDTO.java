package com.trytecom.bir.recovery.dtos;


import com.trytecom.bir.recovery.entidade.FicheiroGlAccount;

import java.io.Serializable;

public class FicheiroGlAccountDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private String version;
    private String glAccountingAccount;
    private String glAccountingBranch;
    private String glCurrency;
    private String glDescription;
    private String glNumber;

    public FicheiroGlAccountDTO(){
        super();
    }


    public FicheiroGlAccountDTO(FicheiroGlAccount obj) {
        super();
        this.id = obj.getId();
        this.version = obj.getVersion();
        this.glAccountingAccount = obj.getGlAccountingAccount();
        this.glAccountingBranch = obj.getGlAccountingBranch();
        this.glCurrency = obj.getGlCurrency();
        this.glDescription = obj.getGlDescription();
        this.glNumber = obj.getGlNumber();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGlAccountingAccount() {
        return glAccountingAccount;
    }

    public void setGlAccountingAccount(String glAccountingAccount) {
        this.glAccountingAccount = glAccountingAccount;
    }

    public String getGlAccountingBranch() {
        return glAccountingBranch;
    }

    public void setGlAccountingBranch(String glAccountingBranch) {
        this.glAccountingBranch = glAccountingBranch;
    }

    public String getGlCurrency() {
        return glCurrency;
    }

    public void setGlCurrency(String glCurrency) {
        this.glCurrency = glCurrency;
    }

    public String getGlDescription() {
        return glDescription;
    }

    public void setGlDescription(String glDescription) {
        this.glDescription = glDescription;
    }

    public String getGlNumber() {
        return glNumber;
    }

    public void setGlNumber(String glNumber) {
        this.glNumber = glNumber;
    }
}
