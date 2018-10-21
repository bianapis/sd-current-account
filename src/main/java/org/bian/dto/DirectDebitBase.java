package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * DirectDebitBase
 */
public class DirectDebitBase   {
  private String directDebitMandateReference = null;

  private String directDebitPurpose = null;

  private String directDebitServiceConfiguration = null;

  private String bankBranchLocationReference = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private CurrencyAndAmount amount = null;

  private String currency = null;


  /**
   * `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate).MandateIdentification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FctSUcTGEeChad0JzLk7QA_1037644309/elements/_C-4qwERwEeKKnZkMwum2NA_253647161) general-info: payee 
   * @return directDebitMandateReference
  **/

  public String getDirectDebitMandateReference() {
    return directDebitMandateReference;
  }

  public void setDirectDebitMandateReference(String directDebitMandateReference) {
    this.directDebitMandateReference = directDebitMandateReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate).Description iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E2tpUMTGEeChad0JzLk7QA_1799405832/elements/_E2tpUcTGEeChad0JzLk7QA_700879817) general-info: e.g. for compliance reporting 
   * @return directDebitPurpose
  **/

  public String getDirectDebitPurpose() {
    return directDebitPurpose;
  }

  public void setDirectDebitPurpose(String directDebitPurpose) {
    this.directDebitPurpose = directDebitPurpose;
  }


  /**
   * `status: Registered` bian-reference:  CashAccountContract(asAccount).AccountAuthorisation(asDirectDebitMandate).CollectionAmount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCCvlMTGEeChad0JzLk7QA_-1453577952/elements/_FCCvl8TGEeChad0JzLk7QA_1129069978) `status: Registered` bian-reference:  CashAccountContract(asAccount).AccountAuthorisation(asDirectDebitMandate).MaximumAmount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCCvlMTGEeChad0JzLk7QA_-1453577952/elements/_FCCvmcTGEeChad0JzLk7QA_-960859698) `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate).FinalCollectionDate iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCCvlMTGEeChad0JzLk7QA_-1453577952/elements/_FCCvlsTGEeChad0JzLk7QA_1037644588) `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate).FirstCollectionDate iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCCvlMTGEeChad0JzLk7QA_-1453577952/elements/_FCCvlcTGEeChad0JzLk7QA_1037644587) `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate).Frequency iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FCCvlMTGEeChad0JzLk7QA_-1453577952/elements/_FCCvmMTGEeChad0JzLk7QA_1037644589) general-info: amount/limits/schedule 
   * @return directDebitServiceConfiguration
  **/

  public String getDirectDebitServiceConfiguration() {
    return directDebitServiceConfiguration;
  }

  public void setDirectDebitServiceConfiguration(String directDebitServiceConfiguration) {
    this.directDebitServiceConfiguration = directDebitServiceConfiguration;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJtcTGEeChad0JzLk7QA_-1846259904) general-info: for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate).MandatePartyRole(asMandateHolder) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EvHMh8TGEeChad0JzLk7QA_1036121131) 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate)(asMandate).CreditorAccount `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate)(asMandate).CreditorAccount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987) 
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate).CreditorAccount(asAccount).AccountPartyRole(asAccountServicerRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000) 
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


}

