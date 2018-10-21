package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * InventoryBaseWithIdAndRoot
 */
public class InventoryBaseWithIdAndRoot   {
  private String inventoryItemType = null;

  private String inventoryItemProperties = null;

  private String inventoryItemStatus = null;

  private String inventoryFacilityReference = null;

  private String customerReference = null;

  private String productInstanceReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return inventoryItemType
  **/

  public String getInventoryItemType() {
    return inventoryItemType;
  }

  public void setInventoryItemType(String inventoryItemType) {
    this.inventoryItemType = inventoryItemType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return inventoryItemProperties
  **/

  public String getInventoryItemProperties() {
    return inventoryItemProperties;
  }

  public void setInventoryItemProperties(String inventoryItemProperties) {
    this.inventoryItemProperties = inventoryItemProperties;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return inventoryItemStatus
  **/

  public String getInventoryItemStatus() {
    return inventoryItemStatus;
  }

  public void setInventoryItemStatus(String inventoryItemStatus) {
    this.inventoryItemStatus = inventoryItemStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return inventoryFacilityReference
  **/

  public String getInventoryFacilityReference() {
    return inventoryFacilityReference;
  }

  public void setInventoryFacilityReference(String inventoryFacilityReference) {
    this.inventoryFacilityReference = inventoryFacilityReference;
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

