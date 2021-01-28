package com.uipath.restapi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entity derived from ReleaseDto. It shares all the properties of the base entity except the navigation properties.
 */
@ApiModel(description = "Entity derived from ReleaseDto. It shares all the properties of the base entity except the navigation properties.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class SimpleReleaseDto   {
  @JsonProperty("Key")
  private String key = null;

  @JsonProperty("ProcessKey")
  private String processKey = null;

  @JsonProperty("ProcessVersion")
  private String processVersion = null;

  @JsonProperty("IsLatestVersion")
  private Boolean isLatestVersion = null;

  @JsonProperty("IsProcessDeleted")
  private Boolean isProcessDeleted = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("EnvironmentId")
  private Long environmentId = null;

  @JsonProperty("EnvironmentName")
  private String environmentName = null;

  @JsonProperty("Environment")
  private EnvironmentDto environment = null;

  @JsonProperty("InputArguments")
  private String inputArguments = null;

  @JsonProperty("CurrentVersion")
  private ReleaseVersionDto currentVersion = null;

  @JsonProperty("ReleaseVersions")
  @Valid
  private List<ReleaseVersionDto> releaseVersions = null;

  @JsonProperty("Arguments")
  private ArgumentMetadata arguments = null;

  @JsonProperty("ProcessSettings")
  private ProcessSettingsDto processSettings = null;

  @JsonProperty("Id")
  private Long id = null;

  public SimpleReleaseDto key(String key) {
    this.key = key;
    return this;
  }

  /**
   * A unique identifier associated to each release.
   * @return key
  **/
  @ApiModelProperty(value = "A unique identifier associated to each release.")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public SimpleReleaseDto processKey(String processKey) {
    this.processKey = processKey;
    return this;
  }

  /**
   * The unique identifier of the process associated with the release.
   * @return processKey
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the process associated with the release.")
  @NotNull


  public String getProcessKey() {
    return processKey;
  }

  public void setProcessKey(String processKey) {
    this.processKey = processKey;
  }

  public SimpleReleaseDto processVersion(String processVersion) {
    this.processVersion = processVersion;
    return this;
  }

  /**
   * The version of the process associated with the release.
   * @return processVersion
  **/
  @ApiModelProperty(required = true, value = "The version of the process associated with the release.")
  @NotNull


  public String getProcessVersion() {
    return processVersion;
  }

  public void setProcessVersion(String processVersion) {
    this.processVersion = processVersion;
  }

  public SimpleReleaseDto isLatestVersion(Boolean isLatestVersion) {
    this.isLatestVersion = isLatestVersion;
    return this;
  }

  /**
   * States whether the version of process associated with the release is latest or not.
   * @return isLatestVersion
  **/
  @ApiModelProperty(value = "States whether the version of process associated with the release is latest or not.")


  public Boolean isIsLatestVersion() {
    return isLatestVersion;
  }

  public void setIsLatestVersion(Boolean isLatestVersion) {
    this.isLatestVersion = isLatestVersion;
  }

  public SimpleReleaseDto isProcessDeleted(Boolean isProcessDeleted) {
    this.isProcessDeleted = isProcessDeleted;
    return this;
  }

  /**
   * States whether the process associated with the release is deleted or not.
   * @return isProcessDeleted
  **/
  @ApiModelProperty(value = "States whether the process associated with the release is deleted or not.")


  public Boolean isIsProcessDeleted() {
    return isProcessDeleted;
  }

  public void setIsProcessDeleted(Boolean isProcessDeleted) {
    this.isProcessDeleted = isProcessDeleted;
  }

  public SimpleReleaseDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Used to add additional information about a release in order to better identify it.
   * @return description
  **/
  @ApiModelProperty(value = "Used to add additional information about a release in order to better identify it.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SimpleReleaseDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A custom name of the release. The default name format is ProcessName_EnvironmentName.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A custom name of the release. The default name format is ProcessName_EnvironmentName.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SimpleReleaseDto environmentId(Long environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  /**
   * The Id of the environment associated with the release.
   * @return environmentId
  **/
  @ApiModelProperty(required = true, value = "The Id of the environment associated with the release.")
  @NotNull


  public Long getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
  }

  public SimpleReleaseDto environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  /**
   * The name of the environment associated with the release.
   * @return environmentName
  **/
  @ApiModelProperty(value = "The name of the environment associated with the release.")


  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  public SimpleReleaseDto environment(EnvironmentDto environment) {
    this.environment = environment;
    return this;
  }

  /**
   * The environment associated with the release.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment associated with the release.")

  @Valid

  public EnvironmentDto getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentDto environment) {
    this.environment = environment;
  }

  public SimpleReleaseDto inputArguments(String inputArguments) {
    this.inputArguments = inputArguments;
    return this;
  }

  /**
   * Input parameters in JSON format to be passed as default values to job execution.
   * @return inputArguments
  **/
  @ApiModelProperty(value = "Input parameters in JSON format to be passed as default values to job execution.")


  public String getInputArguments() {
    return inputArguments;
  }

  public void setInputArguments(String inputArguments) {
    this.inputArguments = inputArguments;
  }

  public SimpleReleaseDto currentVersion(ReleaseVersionDto currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * The release version associated with the current release.
   * @return currentVersion
  **/
  @ApiModelProperty(value = "The release version associated with the current release.")

  @Valid

  public ReleaseVersionDto getCurrentVersion() {
    return currentVersion;
  }

  public void setCurrentVersion(ReleaseVersionDto currentVersion) {
    this.currentVersion = currentVersion;
  }

  public SimpleReleaseDto releaseVersions(List<ReleaseVersionDto> releaseVersions) {
    this.releaseVersions = releaseVersions;
    return this;
  }

  public SimpleReleaseDto addReleaseVersionsItem(ReleaseVersionDto releaseVersionsItem) {
    if (this.releaseVersions == null) {
      this.releaseVersions = new ArrayList<>();
    }
    this.releaseVersions.add(releaseVersionsItem);
    return this;
  }

  /**
   * The collection of release versions that current release had over time.
   * @return releaseVersions
  **/
  @ApiModelProperty(value = "The collection of release versions that current release had over time.")

  @Valid

  public List<ReleaseVersionDto> getReleaseVersions() {
    return releaseVersions;
  }

  public void setReleaseVersions(List<ReleaseVersionDto> releaseVersions) {
    this.releaseVersions = releaseVersions;
  }

  public SimpleReleaseDto arguments(ArgumentMetadata arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * Input/Output arguments consumed/produced by the release
   * @return arguments
  **/
  @ApiModelProperty(value = "Input/Output arguments consumed/produced by the release")

  @Valid

  public ArgumentMetadata getArguments() {
    return arguments;
  }

  public void setArguments(ArgumentMetadata arguments) {
    this.arguments = arguments;
  }

  public SimpleReleaseDto processSettings(ProcessSettingsDto processSettings) {
    this.processSettings = processSettings;
    return this;
  }

  /**
   * Get processSettings
   * @return processSettings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProcessSettingsDto getProcessSettings() {
    return processSettings;
  }

  public void setProcessSettings(ProcessSettingsDto processSettings) {
    this.processSettings = processSettings;
  }

  public SimpleReleaseDto id(Long id) {
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
    SimpleReleaseDto simpleReleaseDto = (SimpleReleaseDto) o;
    return Objects.equals(this.key, simpleReleaseDto.key) &&
        Objects.equals(this.processKey, simpleReleaseDto.processKey) &&
        Objects.equals(this.processVersion, simpleReleaseDto.processVersion) &&
        Objects.equals(this.isLatestVersion, simpleReleaseDto.isLatestVersion) &&
        Objects.equals(this.isProcessDeleted, simpleReleaseDto.isProcessDeleted) &&
        Objects.equals(this.description, simpleReleaseDto.description) &&
        Objects.equals(this.name, simpleReleaseDto.name) &&
        Objects.equals(this.environmentId, simpleReleaseDto.environmentId) &&
        Objects.equals(this.environmentName, simpleReleaseDto.environmentName) &&
        Objects.equals(this.environment, simpleReleaseDto.environment) &&
        Objects.equals(this.inputArguments, simpleReleaseDto.inputArguments) &&
        Objects.equals(this.currentVersion, simpleReleaseDto.currentVersion) &&
        Objects.equals(this.releaseVersions, simpleReleaseDto.releaseVersions) &&
        Objects.equals(this.arguments, simpleReleaseDto.arguments) &&
        Objects.equals(this.processSettings, simpleReleaseDto.processSettings) &&
        Objects.equals(this.id, simpleReleaseDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, processKey, processVersion, isLatestVersion, isProcessDeleted, description, name, environmentId, environmentName, environment, inputArguments, currentVersion, releaseVersions, arguments, processSettings, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleReleaseDto {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    processKey: ").append(toIndentedString(processKey)).append("\n");
    sb.append("    processVersion: ").append(toIndentedString(processVersion)).append("\n");
    sb.append("    isLatestVersion: ").append(toIndentedString(isLatestVersion)).append("\n");
    sb.append("    isProcessDeleted: ").append(toIndentedString(isProcessDeleted)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    inputArguments: ").append(toIndentedString(inputArguments)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    releaseVersions: ").append(toIndentedString(releaseVersions)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    processSettings: ").append(toIndentedString(processSettings)).append("\n");
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

