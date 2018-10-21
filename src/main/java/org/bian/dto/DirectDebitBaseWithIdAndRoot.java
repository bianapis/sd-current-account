package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * DirectDebitBaseWithIdAndRoot
 */
public class DirectDebitBaseWithIdAndRoot   {
  private String directDebitMandateReference = null;

  private String directDebitPurpose = null;

  private String directDebitServiceConfiguration = null;

  private String bankBranchLocationReference = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private CurrencyAndAmount amount = null;

  private String currency = null;

  private String directDebitFacilityReference = null;

  private String customerReference = null;

  private String productInstanceReference = null;


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
   * `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountServicerRole)(asRole).Player(asOrganisation).Branch.PlaceOfOperation iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJtcTGEeChad0JzLk7QA_-1846259904) `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountServicerRole)(asRole).Player(asOrganisation).Branch.PlaceOfRegistration iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJtMTGEeChad0JzLk7QA_-847083437) `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountServicerRole)(asRole).Player(asOrganisation).PlaceOfOperation iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJtcTGEeChad0JzLk7QA_-1846259904) `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountServicerRole)(asRole).Player(asOrganisation).PlaceOfRegistration iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNg_x8TGEeChad0JzLk7QA_908383601/elements/_FNqJtMTGEeChad0JzLk7QA_-847083437) general-info: for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountOwnerRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EysE9cTGEeChad0JzLk7QA_-200588046) 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).Identification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725) 
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountServicerRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_Ey118MTGEeChad0JzLk7QA_1536519000) 
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return directDebitFacilityReference
  **/

  public String getDirectDebitFacilityReference() {
    return directDebitFacilityReference;
  }

  public void setDirectDebitFacilityReference(String directDebitFacilityReference) {
    this.directDebitFacilityReference = directDebitFacilityReference;
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
   * `status: Registered` bian-reference:  CashAccountContract(asAccountContract).AccountAuthorisation(asDirectDebitMandate)(asMandate).DebtorAccount(asAccount).Identification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725 general-info: customer account reference 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


}

