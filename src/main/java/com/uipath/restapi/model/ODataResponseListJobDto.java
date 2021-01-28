package com.uipath.restapi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ODataResponseListJobDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class ODataResponseListJobDto   {
  @JsonProperty("@odata.context")
  private String odataContext = null;

  @JsonProperty("value")
  @Valid
  private List<JobDto> value = null;

  public ODataResponseListJobDto odataContext(String odataContext) {
    this.odataContext = odataContext;
    return this;
  }

  /**
   * Get odataContext
   * @return odataContext
  **/
  @ApiModelProperty(value = "")


  public String getOdataContext() {
    return odataContext;
  }

  public void setOdataContext(String odataContext) {
    this.odataContext = odataContext;
  }

  public ODataResponseListJobDto value(List<JobDto> value) {
    this.value = value;
    return this;
  }

  public ODataResponseListJobDto addValueItem(JobDto valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<JobDto> getValue() {
    return value;
  }

  public void setValue(List<JobDto> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ODataResponseListJobDto odataResponseListJobDto = (ODataResponseListJobDto) o;
    return Objects.equals(this.odataContext, odataResponseListJobDto.odataContext) &&
        Objects.equals(this.value, odataResponseListJobDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ODataResponseListJobDto {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

