package com.trytecom.bir.recovery.entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FicheiroDdr")
public class FicheiroDdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String version;
    private String account_id;
    private String accountRef;
    private String accountTypeCode;
    private String accountTypeName;
    private String creditAmount;
    private String credAnalyAccountNum;
    private String creditCurrency;
    private String credSyntAccountNum;
    private String debitAmount;
    private String debAnalyAccountNum;
    private String debitCurrency;
    private String debSyntAccountNum;
    private String postingDate;
    private String transactAmount;
    private String transactCurre;
    private String transactDesc;
    private String transactId;
    private String transactLocalDate;
    private String way4Header_id;
    private String status;
    private String coreNumber;
    private String transference_id;

    public FicheiroDdr(){
        super();
    }

    public FicheiroDdr(Long id, String version, String account_id, String accountRef, String accountTypeCode, String accountTypeName, String creditAmount, String credAnalyAccountNum, String creditCurrency, String credSyntAccountNum, String debitAmount, String debAnalyAccountNum, String debitCurrency, String debSyntAccountNum, String postingDate, String transactAmount, String transactCurre, String transactDesc, String transactId, String transactLocalDate, String way4Header_id, String status, String coreNumber, String transference_id) {
        super();
        this.id = id;
        this.version = version;
        this.account_id = account_id;
        this.accountRef = accountRef;
        this.accountTypeCode = accountTypeCode;
        this.accountTypeName = accountTypeName;
        this.creditAmount = creditAmount;
        this.credAnalyAccountNum = credAnalyAccountNum;
        this.creditCurrency = creditCurrency;
        this.credSyntAccountNum = credSyntAccountNum;
        this.debitAmount = debitAmount;
        this.debAnalyAccountNum = debAnalyAccountNum;
        this.debitCurrency = debitCurrency;
        this.debSyntAccountNum = debSyntAccountNum;
        this.postingDate = postingDate;
        this.transactAmount = transactAmount;
        this.transactCurre = transactCurre;
        this.transactDesc = transactDesc;
        this.transactId = transactId;
        this.transactLocalDate = transactLocalDate;
        this.way4Header_id = way4Header_id;
        this.status = status;
        this.coreNumber = coreNumber;
        this.transference_id = transference_id;
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

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAccountRef() {
        return accountRef;
    }

    public void setAccountRef(String accountRef) {
        this.accountRef = accountRef;
    }

    public String getAccountTypeCode() {
        return accountTypeCode;
    }

    public void setAccountTypeCode(String accountTypeCode) {
        this.accountTypeCode = accountTypeCode;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCredAnalyAccountNum() {
        return credAnalyAccountNum;
    }

    public void setCredAnalyAccountNum(String credAnalyAccountNum) {
        this.credAnalyAccountNum = credAnalyAccountNum;
    }

    public String getCreditCurrency() {
        return creditCurrency;
    }

    public void setCreditCurrency(String creditCurrency) {
        this.creditCurrency = creditCurrency;
    }

    public String getCredSyntAccountNum() {
        return credSyntAccountNum;
    }

    public void setCredSyntAccountNum(String credSyntAccountNum) {
        this.credSyntAccountNum = credSyntAccountNum;
    }

    public String getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getDebAnalyAccountNum() {
        return debAnalyAccountNum;
    }

    public void setDebAnalyAccountNum(String debAnalyAccountNum) {
        this.debAnalyAccountNum = debAnalyAccountNum;
    }

    public String getDebitCurrency() {
        return debitCurrency;
    }

    public void setDebitCurrency(String debitCurrency) {
        this.debitCurrency = debitCurrency;
    }

    public String getDebSyntAccountNum() {
        return debSyntAccountNum;
    }

    public void setDebSyntAccountNum(String debSyntAccountNum) {
        this.debSyntAccountNum = debSyntAccountNum;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String postingDate) {
        this.postingDate = postingDate;
    }

    public String getTransactAmount() {
        return transactAmount;
    }

    public void setTransactAmount(String transactAmount) {
        this.transactAmount = transactAmount;
    }

    public String getTransactCurre() {
        return transactCurre;
    }

    public void setTransactCurre(String transactCurre) {
        this.transactCurre = transactCurre;
    }

    public String getTransactDesc() {
        return transactDesc;
    }

    public void setTransactDesc(String transactDesc) {
        this.transactDesc = transactDesc;
    }

    public String getTransactId() {
        return transactId;
    }

    public void setTransactId(String transactId) {
        this.transactId = transactId;
    }

    public String getTransactLocalDate() {
        return transactLocalDate;
    }

    public void setTransactLocalDate(String transactLocalDate) {
        this.transactLocalDate = transactLocalDate;
    }

    public String getWay4Header_id() {
        return way4Header_id;
    }

    public void setWay4Header_id(String way4Header_id) {
        this.way4Header_id = way4Header_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoreNumber() {
        return coreNumber;
    }

    public void setCoreNumber(String coreNumber) {
        this.coreNumber = coreNumber;
    }

    public String getTransference_id() {
        return transference_id;
    }

    public void setTransference_id(String transference_id) {
        this.transference_id = transference_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FicheiroEae)) return false;
        FicheiroEae that = (FicheiroEae) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}

