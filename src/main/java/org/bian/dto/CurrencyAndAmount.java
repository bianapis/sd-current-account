package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * &#x60;status: Registered&#x60; iso-link: [click_here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/datatypes/_YXSZF9p-Ed-ak6NoX_4Aeg_-1352517078) general-info: Number of monetary units specified in a currency, where the unit of currency is explicit and compliant with ISO 4217. The decimal separator is a dot. Note: A zero amount is considered a positive amount. 
 */
public class CurrencyAndAmount   {
  private String currency = null;

  private String amount = null;


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
   * Get amount
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


}

