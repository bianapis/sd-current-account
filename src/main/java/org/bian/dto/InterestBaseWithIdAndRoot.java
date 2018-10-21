package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * InterestBaseWithIdAndRoot
 */
public class InterestBaseWithIdAndRoot   {
  private String interestRateTransactionReference = null;

  private String rateConfiguration = null;

  private String applicableInterestRate = null;

  private String rateApplicationSchedule = null;

  private CurrencyAndAmount accuredInterestAmount = null;

  private String customerReference = null;

  private String productInstanceReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return interestRateTransactionReference
  **/

  public String getInterestRateTransactionReference() {
    return interestRateTransactionReference;
  }

  public void setInterestRateTransactionReference(String interestRateTransactionReference) {
    this.interestRateTransactionReference = interestRateTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return rateConfiguration
  **/

  public String getRateConfiguration() {
    return rateConfiguration;
  }

  public void setRateConfiguration(String rateConfiguration) {
    this.rateConfiguration = rateConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Rate 
   * @return applicableInterestRate
  **/

  public String getApplicableInterestRate() {
    return applicableInterestRate;
  }

  public void setApplicableInterestRate(String applicableInterestRate) {
    this.applicableInterestRate = applicableInterestRate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return rateApplicationSchedule
  **/

  public String getRateApplicationSchedule() {
    return rateApplicationSchedule;
  }

  public void setRateApplicationSchedule(String rateApplicationSchedule) {
    this.rateApplicationSchedule = rateApplicationSchedule;
  }


  /**
   * Get accuredInterestAmount
   * @return accuredInterestAmount
  **/

  public CurrencyAndAmount getAccuredInterestAmount() {
    return accuredInterestAmount;
  }

  public void setAccuredInterestAmount(CurrencyAndAmount accuredInterestAmount) {
    this.accuredInterestAmount = accuredInterestAmount;
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

