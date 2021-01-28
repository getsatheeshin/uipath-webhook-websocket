package com.uipath.restapi.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AjaxResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class AjaxResponse   {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("targetUrl")
  private String targetUrl = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("error")
  private ErrorInfo error = null;

  @JsonProperty("unAuthorizedRequest")
  private Boolean unAuthorizedRequest = null;

  @JsonProperty("__abp")
  private Boolean abp = null;

  public AjaxResponse result(Object result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")


  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public AjaxResponse targetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

  /**
   * Get targetUrl
   * @return targetUrl
  **/
  @ApiModelProperty(value = "")


  public String getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }

  public AjaxResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")


  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public AjaxResponse error(ErrorInfo error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ErrorInfo getError() {
    return error;
  }

  public void setError(ErrorInfo error) {
    this.error = error;
  }

  public AjaxResponse unAuthorizedRequest(Boolean unAuthorizedRequest) {
    this.unAuthorizedRequest = unAuthorizedRequest;
    return this;
  }

  /**
   * Get unAuthorizedRequest
   * @return unAuthorizedRequest
  **/
  @ApiModelProperty(value = "")


  public Boolean isUnAuthorizedRequest() {
    return unAuthorizedRequest;
  }

  public void setUnAuthorizedRequest(Boolean unAuthorizedRequest) {
    this.unAuthorizedRequest = unAuthorizedRequest;
  }

  public AjaxResponse abp(Boolean abp) {
    this.abp = abp;
    return this;
  }

  /**
   * Get abp
   * @return abp
  **/
  @ApiModelProperty(readOnly = true, value = "")


  public Boolean isAbp() {
    return abp;
  }

  public void setAbp(Boolean abp) {
    this.abp = abp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AjaxResponse ajaxResponse = (AjaxResponse) o;
    return Objects.equals(this.result, ajaxResponse.result) &&
        Objects.equals(this.targetUrl, ajaxResponse.targetUrl) &&
        Objects.equals(this.success, ajaxResponse.success) &&
        Objects.equals(this.error, ajaxResponse.error) &&
        Objects.equals(this.unAuthorizedRequest, ajaxResponse.unAuthorizedRequest) &&
        Objects.equals(this.abp, ajaxResponse.abp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, targetUrl, success, error, unAuthorizedRequest, abp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AjaxResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    unAuthorizedRequest: ").append(toIndentedString(unAuthorizedRequest)).append("\n");
    sb.append("    abp: ").append(toIndentedString(abp)).append("\n");
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

