package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * DepositBaseWithIdAndRoot
 */
public class DepositBaseWithIdAndRoot   {
  private String payeeReference = null;

  private String payeeProductInstaceReference = null;

  private String payeeBankReference = null;

  private CurrencyAndAmount amount = null;

  private String currency = null;

  private String valueDate = null;

  private String depositTransactionReference = null;

  private String customerReference = null;

  private String accountLimitType = null;

  private CurrencyAndAmount accountLimit = null;

  private String productInstanceReference = null;


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountOwnerRole) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046) general-info: customer 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).Identification iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725) general-info: customer account reference 
   * @return payeeProductInstaceReference
  **/

  public String getPayeeProductInstaceReference() {
    return payeeProductInstaceReference;
  }

  public void setPayeeProductInstaceReference(String payeeProductInstaceReference) {
    this.payeeProductInstaceReference = payeeProductInstaceReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountServicerRole) iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000) 
   * @return payeeBankReference
  **/

  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
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
   * `status: Registered` bian-reference:  CashAccount.CashEntry.AccountOwnerTransactionIdentification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FA2cwMTGEeChad0JzLk7QA_1385452657/elements/_xSkzARdqEeKdr-hW_Ia1WQ_1315262931) `status: Registered` bian-reference:  CashAccount.CashEntry.AccountServicerTransactionIdentification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FA2cwMTGEeChad0JzLk7QA_1385452657/elements/_xSkzAhdqEeKdr-hW_Ia1WQ_-1649127135) 
   * @return depositTransactionReference
  **/

  public String getDepositTransactionReference() {
    return depositTransactionReference;
  }

  public void setDepositTransactionReference(String depositTransactionReference) {
    this.depositTransactionReference = depositTransactionReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountOwnerRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046) general-info: account holder 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
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
   * `status: Registered` bian-reference:  CashAccount(asAccount).Identification iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725) 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}

