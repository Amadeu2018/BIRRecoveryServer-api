package com.trytecom.bir.recovery.dtos;

import com.trytecom.bir.recovery.entidade.FicheiroEae;

import java.io.Serializable;

public class FicheiroEaeDTO implements Serializable {

    private static final long serialVersionUID = 1L;
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

    public FicheiroEaeDTO() {
        super();
    }

    public FicheiroEaeDTO(FicheiroEae obj) {
        super();
        this.id = obj.getId();
        this.version = obj.getVersion();
        this.account_id = obj.getAccount_id();
        this.accountRef = obj.getAccountRef();
        this.accountTypeCode = obj.getAccountTypeCode();
        this.accountTypeName = obj.getAccountTypeName();
        this.creditAmount = obj.getCreditAmount();
        this.credAnalyAccountNum = obj.getCredAnalyAccountNum();
        this.creditCurrency = obj.getCreditCurrency();
        this.credSyntAccountNum = obj.getCredSyntAccountNum();
        this.debitAmount = obj.getDebitAmount();
        this.debAnalyAccountNum = obj.getDebAnalyAccountNum();
        this.debitCurrency = obj.getDebitCurrency();
        this.debSyntAccountNum = obj.getDebSyntAccountNum();
        this.postingDate = obj.getPostingDate();
        this.transactAmount = obj.getTransactAmount();
        this.transactCurre = obj.getTransactCurre();
        this.transactDesc = obj.getTransactDesc();
        this.transactId = obj.getTransactId();
        this.transactLocalDate = obj.getTransactLocalDate();
        this.way4Header_id = obj.getWay4Header_id();
        this.status = obj.getStatus();
        this.coreNumber = obj.getCoreNumber();
        this.transference_id = obj.getTransference_id();
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
}
