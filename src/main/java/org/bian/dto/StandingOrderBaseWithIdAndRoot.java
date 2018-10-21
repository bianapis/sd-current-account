package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * StandingOrderBaseWithIdAndRoot
 */
public class StandingOrderBaseWithIdAndRoot   {
  private String standingOrderPurpose = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private CurrencyAndAmount amount = null;

  private String currency = null;

  private String paymentSchedule = null;

  private String standingOrderFacilityReference = null;

  private String customerReference = null;

  private String productInstanceReference = null;


  /**
   * `status: Registered` bian-reference:  CashAccount.RelatedCreditStandingOrder.EventDescription iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_E7CIo8TGEeChad0JzLk7QA_-1879461400) `status: Registered` bian-reference:  CashAccount.RelatedDebitStandingOrder.EventDescription iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_E7CIo8TGEeChad0JzLk7QA_-1879461400) 
   * @return standingOrderPurpose
  **/

  public String getStandingOrderPurpose() {
    return standingOrderPurpose;
  }

  public void setStandingOrderPurpose(String standingOrderPurpose) {
    this.standingOrderPurpose = standingOrderPurpose;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount.RelatedCreditStandingOrder.CreditAccount(asAccount).AccountOwnerRole iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046) `status: Registered` bian-reference:  CashAccount.RelatedDebitStandingOrder.CreditAccount(asAccount).AccountOwnerRole iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046) 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount.RelatedCreditStandingOrder.CreditAccount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_DK7EY7ShEeGXa-y3CFzLMQ_463118596) `status: Registered` bian-reference:  CashAccount.RelatedDebitStandingOrder.CreditAccount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_DK7EY7ShEeGXa-y3CFzLMQ_463118596) general-info: customer account reference 
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount.RelatedCreditStandingOrder.CreditAccount(asAccount).AccountServicerRole iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000) `status: Registered` bian-reference:  CashAccount.RelatedDebitStandingOrder.CreditAccount(asAccount).AccountServicerRole iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000) 
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
   * `status: Registered` bian-reference:  CashAccount.RelatedCreditStandingOrder.Day iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_E7CIpMTGEeChad0JzLk7QA_-1145087031) `status: Registered` bian-reference:  CashAccount.RelatedDebitStandingOrder.Frequency iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E7CIosTGEeChad0JzLk7QA_1664636213/elements/_E7CIqcTGEeChad0JzLk7QA_-1544240334) 
   * @return paymentSchedule
  **/

  public String getPaymentSchedule() {
    return paymentSchedule;
  }

  public void setPaymentSchedule(String paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return standingOrderFacilityReference
  **/

  public String getStandingOrderFacilityReference() {
    return standingOrderFacilityReference;
  }

  public void setStandingOrderFacilityReference(String standingOrderFacilityReference) {
    this.standingOrderFacilityReference = standingOrderFacilityReference;
  }


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
   * `status: Registered` bian-reference:  CashAccount(asAccount).Identification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725) general-info: account number 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}

