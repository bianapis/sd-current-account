package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CurrencyAndAmount;

import javax.validation.Valid;
  
/**
 * FeeBaseWithIdAndRoot
 */
public class FeeBaseWithIdAndRoot   {
  private String feeTransactionReference = null;

  private String feeConfiguration = null;

  private String feeType = null;

  private String feeCharge = null;

  private String feeProjectionsCommitments = null;

  private CurrencyAndAmount feeActualAmount = null;

  private String customerReference = null;

  private String productInstanceReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return feeTransactionReference
  **/

  public String getFeeTransactionReference() {
    return feeTransactionReference;
  }

  public void setFeeTransactionReference(String feeTransactionReference) {
    this.feeTransactionReference = feeTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return feeConfiguration
  **/

  public String getFeeConfiguration() {
    return feeConfiguration;
  }

  public void setFeeConfiguration(String feeConfiguration) {
    this.feeConfiguration = feeConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return feeType
  **/

  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return feeCharge
  **/

  public String getFeeCharge() {
    return feeCharge;
  }

  public void setFeeCharge(String feeCharge) {
    this.feeCharge = feeCharge;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return feeProjectionsCommitments
  **/

  public String getFeeProjectionsCommitments() {
    return feeProjectionsCommitments;
  }

  public void setFeeProjectionsCommitments(String feeProjectionsCommitments) {
    this.feeProjectionsCommitments = feeProjectionsCommitments;
  }


  /**
   * Get feeActualAmount
   * @return feeActualAmount
  **/

  public CurrencyAndAmount getFeeActualAmount() {
    return feeActualAmount;
  }

  public void setFeeActualAmount(CurrencyAndAmount feeActualAmount) {
    this.feeActualAmount = feeActualAmount;
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

