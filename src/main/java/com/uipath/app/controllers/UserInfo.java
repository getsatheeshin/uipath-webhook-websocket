package com.uipath.app.controllers;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-12T02:00:33.153+05:30")

public class UserInfo   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("telephoneNumber")
  private String telephoneNumber = null;

  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("forcePasswordChange")
  private String forcePasswordChange = null;

  public UserInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "firstName")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "lastName")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserInfo emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(value = "emailAddress")


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public UserInfo telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

  /**
   * telephoneNumber
   * @return telephoneNumber
  **/
  @ApiModelProperty(value = "telephoneNumber")


  public String getTelephoneNumber() {
    return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }

  public UserInfo mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "mobileNumber")


  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title
   * @return title
  **/
  @ApiModelProperty(value = "title")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UserInfo forcePasswordChange(String forcePasswordChange) {
    this.forcePasswordChange = forcePasswordChange;
    return this;
  }

  /**
   * forcePasswordChange
   * @return forcePasswordChange
  **/
  @ApiModelProperty(value = "forcePasswordChange")


  public String getForcePasswordChange() {
    return forcePasswordChange;
  }

  public void setForcePasswordChange(String forcePasswordChange) {
    this.forcePasswordChange = forcePasswordChange;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo mainBotArguments = (UserInfo) o;
    return Objects.equals(this.firstName, mainBotArguments.firstName) &&
        Objects.equals(this.lastName, mainBotArguments.lastName) &&
        Objects.equals(this.emailAddress, mainBotArguments.emailAddress) &&
        Objects.equals(this.telephoneNumber, mainBotArguments.telephoneNumber) &&
        Objects.equals(this.mobileNumber, mainBotArguments.mobileNumber) &&
        Objects.equals(this.title, mainBotArguments.title) &&
        Objects.equals(this.forcePasswordChange, mainBotArguments.forcePasswordChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, telephoneNumber, mobileNumber, title, forcePasswordChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainBotArguments {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    forcePasswordChange: ").append(toIndentedString(forcePasswordChange)).append("\n");
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

