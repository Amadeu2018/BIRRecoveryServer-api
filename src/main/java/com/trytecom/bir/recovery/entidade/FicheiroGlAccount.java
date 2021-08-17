package com.trytecom.bir.recovery.entidade;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Ficheiroglaccount")
public class FicheiroGlAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String version;
    private String glAccountingAccount;
    private String glAccountingBranch;
    private String glCurrency;
    private String glDescription;
    private String glNumber;

    public FicheiroGlAccount(){
        super();
    }

    public FicheiroGlAccount(Long id, String version, String glAccountingAccount, String glAccountingBranch, String glCurrency, String glDescription , String glNumber) {
        super();
        this.id = id;
        this.version = version;
        this.glAccountingAccount = glAccountingAccount;
        this.glAccountingBranch = glAccountingBranch;
        this.glCurrency = glCurrency;
        this.glDescription = glDescription;
        this.glNumber = glNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FicheiroGlAccount)) return false;
        FicheiroGlAccount ficheiroGlAccount = (FicheiroGlAccount) o;
        return getId().equals(ficheiroGlAccount.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
