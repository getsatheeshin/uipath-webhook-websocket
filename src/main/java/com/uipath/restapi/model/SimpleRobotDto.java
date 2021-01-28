package com.uipath.restapi.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Entity derived from RobotDto. Is shares all the properties of the base entity except the navigation properties.
 */
@ApiModel(description = "Entity derived from RobotDto. Is shares all the properties of the base entity except the navigation properties.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class SimpleRobotDto   {
  @JsonProperty("LicenseKey")
  private String licenseKey = null;

  @JsonProperty("MachineName")
  private String machineName = null;

  @JsonProperty("MachineId")
  private Long machineId = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Username")
  private String username = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Version")
  private String version = null;

  /**
   * The Robot type.
   */
  public enum TypeEnum {
    NONPRODUCTION("NonProduction"),
    
    ATTENDED("Attended"),
    
    UNATTENDED("Unattended"),
    
    DEVELOPMENT("Development");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  /**
   * The Robot hosting type (Standard / Floating).
   */
  public enum HostingTypeEnum {
    STANDARD("Standard"),
    
    FLOATING("Floating");

    private String value;

    HostingTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HostingTypeEnum fromValue(String text) {
      for (HostingTypeEnum b : HostingTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("HostingType")
  private HostingTypeEnum hostingType = null;

  @JsonProperty("Password")
  private String password = null;

  /**
   * The robot credentials type (Default/ SmartCard)
   */
  public enum CredentialTypeEnum {
    DEFAULT("Default"),
    
    SMARTCARD("SmartCard");

    private String value;

    CredentialTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CredentialTypeEnum fromValue(String text) {
      for (CredentialTypeEnum b : CredentialTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CredentialType")
  private CredentialTypeEnum credentialType = null;

  @JsonProperty("Environments")
  @Valid
  private List<EnvironmentDto> environments = null;

  @JsonProperty("RobotEnvironments")
  private String robotEnvironments = null;

  @JsonProperty("ExecutionSettings")
  @Valid
  private Map<String, Object> executionSettings = null;

  @JsonProperty("Id")
  private Long id = null;

  public SimpleRobotDto licenseKey(String licenseKey) {
    this.licenseKey = licenseKey;
    return this;
  }

  /**
   * The key is automatically generated from the server for the Robot machine.  <para />For the robot to work, the same key must exist on both the robot and Orchestrator.  <para />All robots on a machine must have the same license key in order to register correctly.
   * @return licenseKey
  **/
  @ApiModelProperty(value = "The key is automatically generated from the server for the Robot machine.  <para />For the robot to work, the same key must exist on both the robot and Orchestrator.  <para />All robots on a machine must have the same license key in order to register correctly.")

@Size(min=0,max=255) 
  public String getLicenseKey() {
    return licenseKey;
  }

  public void setLicenseKey(String licenseKey) {
    this.licenseKey = licenseKey;
  }

  public SimpleRobotDto machineName(String machineName) {
    this.machineName = machineName;
    return this;
  }

  /**
   * The name of the machine a Robot is hosted on.
   * @return machineName
  **/
  @ApiModelProperty(value = "The name of the machine a Robot is hosted on.")

@Size(min=0,max=50) 
  public String getMachineName() {
    return machineName;
  }

  public void setMachineName(String machineName) {
    this.machineName = machineName;
  }

  public SimpleRobotDto machineId(Long machineId) {
    this.machineId = machineId;
    return this;
  }

  /**
   * The Id of the machine a Robot is hosted on
   * @return machineId
  **/
  @ApiModelProperty(value = "The Id of the machine a Robot is hosted on")


  public Long getMachineId() {
    return machineId;
  }

  public void setMachineId(Long machineId) {
    this.machineId = machineId;
  }

  public SimpleRobotDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A custom name for the robot.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A custom name for the robot.")
  @NotNull

@Size(min=0,max=19) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SimpleRobotDto username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The machine username. If the user is under a domain, you are required to also specify it in a DOMAIN\\username format.  <para />Note: You must use short domain names, such as desktop\\administrator and NOT desktop.local/administrator.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The machine username. If the user is under a domain, you are required to also specify it in a DOMAIN\\username format.  <para />Note: You must use short domain names, such as desktop\\administrator and NOT desktop.local/administrator.")
  @NotNull

@Size(min=0,max=100) 
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SimpleRobotDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Used to add additional information about a robot in order to better identify it.
   * @return description
  **/
  @ApiModelProperty(value = "Used to add additional information about a robot in order to better identify it.")

@Size(min=0,max=500) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SimpleRobotDto version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The Robot's Version.
   * @return version
  **/
  @ApiModelProperty(value = "The Robot's Version.")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SimpleRobotDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The Robot type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The Robot type.")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SimpleRobotDto hostingType(HostingTypeEnum hostingType) {
    this.hostingType = hostingType;
    return this;
  }

  /**
   * The Robot hosting type (Standard / Floating).
   * @return hostingType
  **/
  @ApiModelProperty(required = true, value = "The Robot hosting type (Standard / Floating).")
  @NotNull


  public HostingTypeEnum getHostingType() {
    return hostingType;
  }

  public void setHostingType(HostingTypeEnum hostingType) {
    this.hostingType = hostingType;
  }

  public SimpleRobotDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The Windows password associated with the machine username.
   * @return password
  **/
  @ApiModelProperty(value = "The Windows password associated with the machine username.")

@Size(min=0,max=100) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SimpleRobotDto credentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
    return this;
  }

  /**
   * The robot credentials type (Default/ SmartCard)
   * @return credentialType
  **/
  @ApiModelProperty(value = "The robot credentials type (Default/ SmartCard)")


  public CredentialTypeEnum getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
  }

  public SimpleRobotDto environments(List<EnvironmentDto> environments) {
    this.environments = environments;
    return this;
  }

  public SimpleRobotDto addEnvironmentsItem(EnvironmentDto environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * The collection of environments the robot is part of.
   * @return environments
  **/
  @ApiModelProperty(value = "The collection of environments the robot is part of.")

  @Valid

  public List<EnvironmentDto> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<EnvironmentDto> environments) {
    this.environments = environments;
  }

  public SimpleRobotDto robotEnvironments(String robotEnvironments) {
    this.robotEnvironments = robotEnvironments;
    return this;
  }

  /**
   * The comma separated textual representation of environment names the robot is part of.
   * @return robotEnvironments
  **/
  @ApiModelProperty(value = "The comma separated textual representation of environment names the robot is part of.")


  public String getRobotEnvironments() {
    return robotEnvironments;
  }

  public void setRobotEnvironments(String robotEnvironments) {
    this.robotEnvironments = robotEnvironments;
  }

  public SimpleRobotDto executionSettings(Map<String, Object> executionSettings) {
    this.executionSettings = executionSettings;
    return this;
  }

  public SimpleRobotDto putExecutionSettingsItem(String key, Object executionSettingsItem) {
    if (this.executionSettings == null) {
      this.executionSettings = new HashMap<>();
    }
    this.executionSettings.put(key, executionSettingsItem);
    return this;
  }

  /**
   * A collection of key value pairs containing execution settings for this robot.
   * @return executionSettings
  **/
  @ApiModelProperty(value = "A collection of key value pairs containing execution settings for this robot.")


  public Map<String, Object> getExecutionSettings() {
    return executionSettings;
  }

  public void setExecutionSettings(Map<String, Object> executionSettings) {
    this.executionSettings = executionSettings;
  }

  public SimpleRobotDto id(Long id) {
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
    SimpleRobotDto simpleRobotDto = (SimpleRobotDto) o;
    return Objects.equals(this.licenseKey, simpleRobotDto.licenseKey) &&
        Objects.equals(this.machineName, simpleRobotDto.machineName) &&
        Objects.equals(this.machineId, simpleRobotDto.machineId) &&
        Objects.equals(this.name, simpleRobotDto.name) &&
        Objects.equals(this.username, simpleRobotDto.username) &&
        Objects.equals(this.description, simpleRobotDto.description) &&
        Objects.equals(this.version, simpleRobotDto.version) &&
        Objects.equals(this.type, simpleRobotDto.type) &&
        Objects.equals(this.hostingType, simpleRobotDto.hostingType) &&
        Objects.equals(this.password, simpleRobotDto.password) &&
        Objects.equals(this.credentialType, simpleRobotDto.credentialType) &&
        Objects.equals(this.environments, simpleRobotDto.environments) &&
        Objects.equals(this.robotEnvironments, simpleRobotDto.robotEnvironments) &&
        Objects.equals(this.executionSettings, simpleRobotDto.executionSettings) &&
        Objects.equals(this.id, simpleRobotDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseKey, machineName, machineId, name, username, description, version, type, hostingType, password, credentialType, environments, robotEnvironments, executionSettings, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleRobotDto {\n");
    
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    machineName: ").append(toIndentedString(machineName)).append("\n");
    sb.append("    machineId: ").append(toIndentedString(machineId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hostingType: ").append(toIndentedString(hostingType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    robotEnvironments: ").append(toIndentedString(robotEnvironments)).append("\n");
    sb.append("    executionSettings: ").append(toIndentedString(executionSettings)).append("\n");
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

