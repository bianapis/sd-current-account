package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * PaymentBase
 */
public class PaymentBase   {
  private String customerReference = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private String accountLimitType = null;

  private CurrencyAndAmount accountLimit = null;

  private CurrencyAndAmount amount = null;

  private String currency = null;

  private String valueDate = null;

  private String paymentMechanism = null;


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountOwnerRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount.Payment.PartyRole(asCreditorRole) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNycTGEeChad0JzLk7QA_-591715083) 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CashAccount.Payment.PartyRole(asCreditorRole)(asPaymentPartyRole).CashAccount iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EvtpdMTGEeChad0JzLk7QA_-1076538618/elements/_EvtpdsTGEeChad0JzLk7QA_1151666800) general-info: account number 
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount.Payment.PartyRole(asCreditorAgentRole) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNyMTGEeChad0JzLk7QA_-246206935) 
   * @return payeeBankReference
  **/

  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return accountLimitType
  **/

  public String getAccountLimitType() {
    return accountLimitType;
  }

  public void setAccountLimitType(String accountLimitType) {
    this.accountLimitType = accountLimitType;
  }


  /**
   * Get accountLimit
   * @return accountLimit
  **/

  public CurrencyAndAmount getAccountLimit() {
    return accountLimit;
  }

  public void setAccountLimit(CurrencyAndAmount accountLimit) {
    this.accountLimit = accountLimit;
  }


  /**
   * Get amount
   * @return amount
  **/

  public CurrencyAndAmount getAmount() {
    return amount;
  }

  public void setAmount(CurrencyAndAmount amount) {
    this.amount = amount;
  }


  /**
   * Get currency
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * Get valueDate
   * @return valueDate
  **/

  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount.Payment.PaymentInstrument iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCL5hcTGEeChad0JzLk7QA_1746210980/elements/_FAi6ycTGEeChad0JzLk7QA_1746210990) 
   * @return paymentMechanism
  **/

  public String getPaymentMechanism() {
    return paymentMechanism;
  }

  public void setPaymentMechanism(String paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
  }


}

