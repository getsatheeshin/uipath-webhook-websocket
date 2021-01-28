package com.uipath.restapi.model;

import java.util.ArrayList;
import java.util.List;
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
 * A grouping of Robots.
 */
@ApiModel(description = "A grouping of Robots.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class EnvironmentDto   {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Robots")
  @Valid
  private List<SimpleRobotDto> robots = null;

  /**
   * DEPRECATED. The environment type specifies how it should be used.  This property is deprecated and should no longer be used.
   */
  public enum TypeEnum {
    DEV("Dev"),
    
    TEST("Test"),
    
    PROD("Prod");

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

  @JsonProperty("Id")
  private Long id = null;

  public EnvironmentDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A custom name for the environment.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A custom name for the environment.")
  @NotNull

@Size(min=0,max=100) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvironmentDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Used to add additional information about an environment in order to better identify it.
   * @return description
  **/
  @ApiModelProperty(value = "Used to add additional information about an environment in order to better identify it.")

@Size(min=0,max=500) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnvironmentDto robots(List<SimpleRobotDto> robots) {
    this.robots = robots;
    return this;
  }

  public EnvironmentDto addRobotsItem(SimpleRobotDto robotsItem) {
    if (this.robots == null) {
      this.robots = new ArrayList<>();
    }
    this.robots.add(robotsItem);
    return this;
  }

  /**
   * The collection of robots associated with the current environment.
   * @return robots
  **/
  @ApiModelProperty(value = "The collection of robots associated with the current environment.")

  @Valid

  public List<SimpleRobotDto> getRobots() {
    return robots;
  }

  public void setRobots(List<SimpleRobotDto> robots) {
    this.robots = robots;
  }

  public EnvironmentDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * DEPRECATED. The environment type specifies how it should be used.  This property is deprecated and should no longer be used.
   * @return type
  **/
  @ApiModelProperty(value = "DEPRECATED. The environment type specifies how it should be used.  This property is deprecated and should no longer be used.")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public EnvironmentDto id(Long id) {
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
    EnvironmentDto environmentDto = (EnvironmentDto) o;
    return Objects.equals(this.name, environmentDto.name) &&
        Objects.equals(this.description, environmentDto.description) &&
        Objects.equals(this.robots, environmentDto.robots) &&
        Objects.equals(this.type, environmentDto.type) &&
        Objects.equals(this.id, environmentDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, robots, type, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    robots: ").append(toIndentedString(robots)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

