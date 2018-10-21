package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * StatementBaseWithIdAndRoot
 */
public class StatementBaseWithIdAndRoot   {
  private String balanceType = null;

  private String balance = null;

  private String statementInstanceReference = null;

  private String statementType = null;

  private String statementTrasactionType = null;

  private String statementPeriod = null;

  private String transactionRecordReference = null;

  private String transactionType = null;

  private CurrencyAndAmount transactionPrincipleAmount = null;

  private String transactionCounterparty = null;

  private String transactionObligation = null;

  private String transactionDateTime = null;

  private String customerReference = null;

  private String productInstanceReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return balanceType
  **/

  public String getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(String balanceType) {
    this.balanceType = balanceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return balance
  **/

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return statementInstanceReference
  **/

  public String getStatementInstanceReference() {
    return statementInstanceReference;
  }

  public void setStatementInstanceReference(String statementInstanceReference) {
    this.statementInstanceReference = statementInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return statementType
  **/

  public String getStatementType() {
    return statementType;
  }

  public void setStatementType(String statementType) {
    this.statementType = statementType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return statementTrasactionType
  **/

  public String getStatementTrasactionType() {
    return statementTrasactionType;
  }

  public void setStatementTrasactionType(String statementTrasactionType) {
    this.statementTrasactionType = statementTrasactionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return statementPeriod
  **/

  public String getStatementPeriod() {
    return statementPeriod;
  }

  public void setStatementPeriod(String statementPeriod) {
    this.statementPeriod = statementPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return transactionRecordReference
  **/

  public String getTransactionRecordReference() {
    return transactionRecordReference;
  }

  public void setTransactionRecordReference(String transactionRecordReference) {
    this.transactionRecordReference = transactionRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * Get transactionPrincipleAmount
   * @return transactionPrincipleAmount
  **/

  public CurrencyAndAmount getTransactionPrincipleAmount() {
    return transactionPrincipleAmount;
  }

  public void setTransactionPrincipleAmount(CurrencyAndAmount transactionPrincipleAmount) {
    this.transactionPrincipleAmount = transactionPrincipleAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return transactionCounterparty
  **/

  public String getTransactionCounterparty() {
    return transactionCounterparty;
  }

  public void setTransactionCounterparty(String transactionCounterparty) {
    this.transactionCounterparty = transactionCounterparty;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return transactionObligation
  **/

  public String getTransactionObligation() {
    return transactionObligation;
  }

  public void setTransactionObligation(String transactionObligation) {
    this.transactionObligation = transactionObligation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return transactionDateTime
  **/

  public String getTransactionDateTime() {
    return transactionDateTime;
  }

  public void setTransactionDateTime(String transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}

