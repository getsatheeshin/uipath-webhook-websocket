package com.uipath.restapi.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Stores data about a version of the various versions of the process associated with a certain release.  &lt;para /&gt;If a certain version is associated on and off with a release a new ReleaseVersion object is created for each association.
 */
@ApiModel(description = "Stores data about a version of the various versions of the process associated with a certain release.  <para />If a certain version is associated on and off with a release a new ReleaseVersion object is created for each association.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class ReleaseVersionDto   {
  @JsonProperty("ReleaseId")
  private Long releaseId = null;

  @JsonProperty("VersionNumber")
  private String versionNumber = null;

  @JsonProperty("CreationTime")
  private OffsetDateTime creationTime = null;

  @JsonProperty("ReleaseName")
  private String releaseName = null;

  @JsonProperty("Id")
  private Long id = null;

  public ReleaseVersionDto releaseId(Long releaseId) {
    this.releaseId = releaseId;
    return this;
  }

  /**
   * The Id of the parent release.
   * @return releaseId
  **/
  @ApiModelProperty(required = true, value = "The Id of the parent release.")
  @NotNull


  public Long getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(Long releaseId) {
    this.releaseId = releaseId;
  }

  public ReleaseVersionDto versionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * The version of process associated with the release.
   * @return versionNumber
  **/
  @ApiModelProperty(required = true, value = "The version of process associated with the release.")
  @NotNull


  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }

  public ReleaseVersionDto creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The date and time when the version was associated with the release.
   * @return creationTime
  **/
  @ApiModelProperty(value = "The date and time when the version was associated with the release.")

  @Valid

  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public ReleaseVersionDto releaseName(String releaseName) {
    this.releaseName = releaseName;
    return this;
  }

  /**
   * The name of the process associated with the release.
   * @return releaseName
  **/
  @ApiModelProperty(value = "The name of the process associated with the release.")


  public String getReleaseName() {
    return releaseName;
  }

  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }

  public ReleaseVersionDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseVersionDto releaseVersionDto = (ReleaseVersionDto) o;
    return Objects.equals(this.releaseId, releaseVersionDto.releaseId) &&
        Objects.equals(this.versionNumber, releaseVersionDto.versionNumber) &&
        Objects.equals(this.creationTime, releaseVersionDto.creationTime) &&
        Objects.equals(this.releaseName, releaseVersionDto.releaseName) &&
        Objects.equals(this.id, releaseVersionDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseId, versionNumber, creationTime, releaseName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseVersionDto {\n");
    
    sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

