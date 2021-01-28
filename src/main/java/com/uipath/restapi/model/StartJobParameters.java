package com.uipath.restapi.model;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StartJobParameters
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class StartJobParameters   {
  @JsonProperty("startInfo")
  private StartProcessDto startInfo = null;

  public StartJobParameters startInfo(StartProcessDto startInfo) {
    this.startInfo = startInfo;
    return this;
  }

  /**
   * Get startInfo
   * @return startInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StartProcessDto getStartInfo() {
    return startInfo;
  }

  public void setStartInfo(StartProcessDto startInfo) {
    this.startInfo = startInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartJobParameters startJobParameters = (StartJobParameters) o;
    return Objects.equals(this.startInfo, startJobParameters.startInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartJobParameters {\n");
    
    sb.append("    startInfo: ").append(toIndentedString(startInfo)).append("\n");
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

