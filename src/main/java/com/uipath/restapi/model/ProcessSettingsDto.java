package com.uipath.restapi.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProcessSettingsDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class ProcessSettingsDto   {
  @JsonProperty("ErrorRecordingEnabled")
  private Boolean errorRecordingEnabled = null;

  @JsonProperty("Duration")
  private Integer duration = null;

  @JsonProperty("Frequency")
  private Integer frequency = null;

  @JsonProperty("Quality")
  private Integer quality = null;

  public ProcessSettingsDto errorRecordingEnabled(Boolean errorRecordingEnabled) {
    this.errorRecordingEnabled = errorRecordingEnabled;
    return this;
  }

  /**
   * Get errorRecordingEnabled
   * @return errorRecordingEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isErrorRecordingEnabled() {
    return errorRecordingEnabled;
  }

  public void setErrorRecordingEnabled(Boolean errorRecordingEnabled) {
    this.errorRecordingEnabled = errorRecordingEnabled;
  }

  public ProcessSettingsDto duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public ProcessSettingsDto frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")


  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public ProcessSettingsDto quality(Integer quality) {
    this.quality = quality;
    return this;
  }

  /**
   * Get quality
   * @return quality
  **/
  @ApiModelProperty(value = "")


  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessSettingsDto processSettingsDto = (ProcessSettingsDto) o;
    return Objects.equals(this.errorRecordingEnabled, processSettingsDto.errorRecordingEnabled) &&
        Objects.equals(this.duration, processSettingsDto.duration) &&
        Objects.equals(this.frequency, processSettingsDto.frequency) &&
        Objects.equals(this.quality, processSettingsDto.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorRecordingEnabled, duration, frequency, quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessSettingsDto {\n");
    
    sb.append("    errorRecordingEnabled: ").append(toIndentedString(errorRecordingEnabled)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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

