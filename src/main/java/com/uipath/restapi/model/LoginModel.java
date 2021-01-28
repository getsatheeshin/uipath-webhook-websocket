package com.uipath.restapi.model;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LoginModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class LoginModel   {
  @JsonProperty("tenancyName")
  private String tenancyName = null;

  @JsonProperty("usernameOrEmailAddress")
  private String usernameOrEmailAddress = null;

  @JsonProperty("password")
  private String password = null;

  public LoginModel tenancyName(String tenancyName) {
    this.tenancyName = tenancyName;
    return this;
  }

  /**
   * Get tenancyName
   * @return tenancyName
  **/
  @ApiModelProperty(value = "")


  public String getTenancyName() {
    return tenancyName;
  }

  public void setTenancyName(String tenancyName) {
    this.tenancyName = tenancyName;
  }

  public LoginModel usernameOrEmailAddress(String usernameOrEmailAddress) {
    this.usernameOrEmailAddress = usernameOrEmailAddress;
    return this;
  }

  /**
   * Get usernameOrEmailAddress
   * @return usernameOrEmailAddress
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUsernameOrEmailAddress() {
    return usernameOrEmailAddress;
  }

  public void setUsernameOrEmailAddress(String usernameOrEmailAddress) {
    this.usernameOrEmailAddress = usernameOrEmailAddress;
  }

  public LoginModel password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginModel loginModel = (LoginModel) o;
    return Objects.equals(this.tenancyName, loginModel.tenancyName) &&
        Objects.equals(this.usernameOrEmailAddress, loginModel.usernameOrEmailAddress) &&
        Objects.equals(this.password, loginModel.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenancyName, usernameOrEmailAddress, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginModel {\n");
    
    sb.append("    tenancyName: ").append(toIndentedString(tenancyName)).append("\n");
    sb.append("    usernameOrEmailAddress: ").append(toIndentedString(usernameOrEmailAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

