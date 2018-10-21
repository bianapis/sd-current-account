package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CurrentAccountBaseWithIdAndStatus
 */
public class CurrentAccountBaseWithIdAndStatus   {
  private String productInstanceReference = null;

  private String currentAccountNumber = null;

  private String accountStatus = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String dateType = null;

  private String date = null;

  private String involvedPartyReference = null;

  private String involvedPartyObligationEntitlement = null;

  private String partyReference = null;

  private String accountType = null;

  private String accountCurrency = null;

  private String accountLimitType = null;

  private String accountLimit = null;

  private String allowedAccess = null;

  private String optionType = null;

  private String option = null;

  private String taxReference = null;


  /**
   * `status: Registered` bias-reference:  CashAccount(asAccount).Identification iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E1rHgsTGEeChad0JzLk7QA_-1068889728/elements/_E1rHhcTGEeChad0JzLk7QA_-755813725) general-info: account number 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return currentAccountNumber
  **/

  public String getCurrentAccountNumber() {
    return currentAccountNumber;
  }

  public void setCurrentAccountNumber(String currentAccountNumber) {
    this.currentAccountNumber = currentAccountNumber;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return accountStatus
  **/

  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
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
   * ``status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountServicerRole)(asRole).Player(asParty).Location iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FNqJt8TGEeChad0JzLk7QA_-1317971633/elements/_z2I6YGx5EeKmZJ0Ago--9g_239738909) general-info: for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return dateType
  **/

  public String getDateType() {
    return dateType;
  }

  public void setDateType(String dateType) {
    this.dateType = dateType;
  }


  /**
   * Get date
   * @return date
  **/

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  /**
   * `status: Registered` bian-reference:  CashAccountContract(asAgreement).RoleInAgreement(asGuaranteePartyRole) iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_G7hIgGcwEeOYlMxMjJVrrQ) general-info: e.g. guarantor/co-signer 
   * @return involvedPartyReference
  **/

  public String getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(String involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CashAccountContract(asAgreement).Obligation `status: Registered` bian-reference:  CashAccountContract(asAgreement).Obligation iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FL4BCcTGEeChad0JzLk7QA_-1814618756) 
   * @return involvedPartyObligationEntitlement
  **/

  public String getInvolvedPartyObligationEntitlement() {
    return involvedPartyObligationEntitlement;
  }

  public void setInvolvedPartyObligationEntitlement(String involvedPartyObligationEntitlement) {
    this.involvedPartyObligationEntitlement = involvedPartyObligationEntitlement;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountOwnerRole)(asRole).Player(asOrganization).OrganisationIdentification.LEI iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_yagFILl5EeOpCN0IL2Swqw) `status: Registered` bian-reference:  CashAccount(asAccount).AccountPartyRole(asAccountOwnerRole)(asRole).Player(asPerson).PersonIdentification.TaxIdentificationNumber iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FEHzNMTGEeChad0JzLk7QA_-1382123937/elements/_FEHzNcTGEeChad0JzLk7QA_-1792766550) 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount.CashAccountType iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E4gZEcTGEeChad0JzLk7QA_2010102987/elements/_E4gZE8TGEeChad0JzLk7QA_1025780411) 
   * @return accountType
  **/

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * Get accountCurrency
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
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
   * `status: Registered` bian-reference:  (asDebitCreditFacility).Limit iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FAsrxsTGEeChad0JzLk7QA_-351673533/elements/_FAsryMTGEeChad0JzLk7QA_-1033977641) 
   * @return accountLimit
  **/

  public String getAccountLimit() {
    return accountLimit;
  }

  public void setAccountLimit(String accountLimit) {
    this.accountLimit = accountLimit;
  }


  /**
   * `status: Provisionally Registered` bian-reference:  CashAccount(asAccount).AccountRestriction.RestrictionDescription `status: Registered` bian-reference:  CashAccount(asAccount).AccountRestriction.RestrictionType iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E10RdcTGEeChad0JzLk7QA_-917313471/elements/_E10RdsTGEeChad0JzLk7QA_-1031152537) 
   * @return allowedAccess
  **/

  public String getAllowedAccess() {
    return allowedAccess;
  }

  public void setAllowedAccess(String allowedAccess) {
    this.allowedAccess = allowedAccess;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return optionType
  **/

  public String getOptionType() {
    return optionType;
  }

  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return option
  **/

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }


  /**
   * `status: Registered` bian-reference:  CashAccount.CashEntry.Amount iso-link:  [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_FAi6wsTGEeChad0JzLk7QA_-1438285571/elements/_FAi6w8TGEeChad0JzLk7QA_1158844272) general-info: Tax-Id 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


}

