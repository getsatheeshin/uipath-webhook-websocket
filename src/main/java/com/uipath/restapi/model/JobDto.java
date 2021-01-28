package com.uipath.restapi.model;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a scheduled or manual execution of a process on a robot.
 */
@ApiModel(description = "Represents a scheduled or manual execution of a process on a robot.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-02T19:03:47.551+05:30")

public class JobDto   {
  @JsonProperty("Key")
  private UUID key = null;

  @JsonProperty("StartTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("EndTime")
  private OffsetDateTime endTime = null;

  /**
   * The state in which the job is.
   */
  public enum StateEnum {
    PENDING("Pending"),
    
    RUNNING("Running"),
    
    STOPPING("Stopping"),
    
    TERMINATING("Terminating"),
    
    FAULTED("Faulted"),
    
    SUCCESSFUL("Successful"),
    
    STOPPED("Stopped");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("State")
  private StateEnum state = null;

  @JsonProperty("Robot")
  private SimpleRobotDto robot = null;

  @JsonProperty("Release")
  private SimpleReleaseDto release = null;

  @JsonProperty("Source")
  private String source = null;

  /**
   * The Source type of the job.
   */
  public enum SourceTypeEnum {
    MANUAL("Manual"),
    
    SCHEDULE("Schedule"),
    
    AGENT("Agent");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("SourceType")
  private SourceTypeEnum sourceType = null;

  @JsonProperty("BatchExecutionKey")
  private UUID batchExecutionKey = null;

  @JsonProperty("Info")
  private String info = null;

  @JsonProperty("CreationTime")
  private OffsetDateTime creationTime = null;

  @JsonProperty("StartingScheduleId")
  private Long startingScheduleId = null;

  @JsonProperty("ReleaseName")
  private String releaseName = null;

  /**
   * The type of the job, Attended if started via the robot, Unattended otherwise
   */
  public enum TypeEnum {
    UNATTENDED("Unattended"),
    
    ATTENDED("Attended");

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

  @JsonProperty("InputArguments")
  private String inputArguments = null;

  @JsonProperty("OutputArguments")
  private String outputArguments = null;

  @JsonProperty("HostMachineName")
  private String hostMachineName = null;

  @JsonProperty("HasMediaRecorded")
  private Boolean hasMediaRecorded = null;

  @JsonProperty("Id")
  private Long id = null;

  public JobDto key(UUID key) {
    this.key = key;
    return this;
  }

  /**
   * The unique job identifier.
   * @return key
  **/
  @ApiModelProperty(value = "The unique job identifier.")

  @Valid

  public UUID getKey() {
    return key;
  }

  public void setKey(UUID key) {
    this.key = key;
  }

  public JobDto startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The date and time when the job execution started or null if the job hasn't started yet.
   * @return startTime
  **/
  @ApiModelProperty(value = "The date and time when the job execution started or null if the job hasn't started yet.")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public JobDto endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The date and time when the job execution ended or null if the job hasn't ended yet.
   * @return endTime
  **/
  @ApiModelProperty(value = "The date and time when the job execution ended or null if the job hasn't ended yet.")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public JobDto state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * The state in which the job is.
   * @return state
  **/
  @ApiModelProperty(value = "The state in which the job is.")


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public JobDto robot(SimpleRobotDto robot) {
    this.robot = robot;
    return this;
  }

  /**
   * The robot associated with the current job.
   * @return robot
  **/
  @ApiModelProperty(value = "The robot associated with the current job.")

  @Valid

  public SimpleRobotDto getRobot() {
    return robot;
  }

  public void setRobot(SimpleRobotDto robot) {
    this.robot = robot;
  }

  public JobDto release(SimpleReleaseDto release) {
    this.release = release;
    return this;
  }

  /**
   * The release associated with the current job.
   * @return release
  **/
  @ApiModelProperty(value = "The release associated with the current job.")

  @Valid

  public SimpleReleaseDto getRelease() {
    return release;
  }

  public void setRelease(SimpleReleaseDto release) {
    this.release = release;
  }

  public JobDto source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The Source name of the job.
   * @return source
  **/
  @ApiModelProperty(value = "The Source name of the job.")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public JobDto sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * The Source type of the job.
   * @return sourceType
  **/
  @ApiModelProperty(value = "The Source type of the job.")


  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public JobDto batchExecutionKey(UUID batchExecutionKey) {
    this.batchExecutionKey = batchExecutionKey;
    return this;
  }

  /**
   * The unique identifier grouping multiple jobs. It is usually generated when the job is created by a schedule.
   * @return batchExecutionKey
  **/
  @ApiModelProperty(value = "The unique identifier grouping multiple jobs. It is usually generated when the job is created by a schedule.")

  @Valid

  public UUID getBatchExecutionKey() {
    return batchExecutionKey;
  }

  public void setBatchExecutionKey(UUID batchExecutionKey) {
    this.batchExecutionKey = batchExecutionKey;
  }

  public JobDto info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Additional information about the current job.
   * @return info
  **/
  @ApiModelProperty(value = "Additional information about the current job.")


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public JobDto creationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * The date and time when the job was created.
   * @return creationTime
  **/
  @ApiModelProperty(value = "The date and time when the job was created.")

  @Valid

  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(OffsetDateTime creationTime) {
    this.creationTime = creationTime;
  }

  public JobDto startingScheduleId(Long startingScheduleId) {
    this.startingScheduleId = startingScheduleId;
    return this;
  }

  /**
   * The Id of the schedule that started the job, or null if the job was started by the user.
   * @return startingScheduleId
  **/
  @ApiModelProperty(value = "The Id of the schedule that started the job, or null if the job was started by the user.")


  public Long getStartingScheduleId() {
    return startingScheduleId;
  }

  public void setStartingScheduleId(Long startingScheduleId) {
    this.startingScheduleId = startingScheduleId;
  }

  public JobDto releaseName(String releaseName) {
    this.releaseName = releaseName;
    return this;
  }

  /**
   * The name of the release associated with the current name.
   * @return releaseName
  **/
  @ApiModelProperty(value = "The name of the release associated with the current name.")


  public String getReleaseName() {
    return releaseName;
  }

  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }

  public JobDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the job, Attended if started via the robot, Unattended otherwise
   * @return type
  **/
  @ApiModelProperty(value = "The type of the job, Attended if started via the robot, Unattended otherwise")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public JobDto inputArguments(String inputArguments) {
    this.inputArguments = inputArguments;
    return this;
  }

  /**
   * Input parameters in JSON format to be passed to job execution
   * @return inputArguments
  **/
  @ApiModelProperty(value = "Input parameters in JSON format to be passed to job execution")


  public String getInputArguments() {
    return inputArguments;
  }

  public void setInputArguments(String inputArguments) {
    this.inputArguments = inputArguments;
  }

  public JobDto outputArguments(String outputArguments) {
    this.outputArguments = outputArguments;
    return this;
  }

  /**
   * Output parameters in JSON format resulted from job execution
   * @return outputArguments
  **/
  @ApiModelProperty(value = "Output parameters in JSON format resulted from job execution")


  public String getOutputArguments() {
    return outputArguments;
  }

  public void setOutputArguments(String outputArguments) {
    this.outputArguments = outputArguments;
  }

  public JobDto hostMachineName(String hostMachineName) {
    this.hostMachineName = hostMachineName;
    return this;
  }

  /**
   * The name of the machine where the Robot run the job.
   * @return hostMachineName
  **/
  @ApiModelProperty(value = "The name of the machine where the Robot run the job.")


  public String getHostMachineName() {
    return hostMachineName;
  }

  public void setHostMachineName(String hostMachineName) {
    this.hostMachineName = hostMachineName;
  }

  public JobDto hasMediaRecorded(Boolean hasMediaRecorded) {
    this.hasMediaRecorded = hasMediaRecorded;
    return this;
  }

  /**
   * True if any execution media has been recorded for this job, false otherwise.
   * @return hasMediaRecorded
  **/
  @ApiModelProperty(value = "True if any execution media has been recorded for this job, false otherwise.")


  public Boolean isHasMediaRecorded() {
    return hasMediaRecorded;
  }

  public void setHasMediaRecorded(Boolean hasMediaRecorded) {
    this.hasMediaRecorded = hasMediaRecorded;
  }

  public JobDto id(Long id) {
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
    JobDto jobDto = (JobDto) o;
    return Objects.equals(this.key, jobDto.key) &&
        Objects.equals(this.startTime, jobDto.startTime) &&
        Objects.equals(this.endTime, jobDto.endTime) &&
        Objects.equals(this.state, jobDto.state) &&
        Objects.equals(this.robot, jobDto.robot) &&
        Objects.equals(this.release, jobDto.release) &&
        Objects.equals(this.source, jobDto.source) &&
        Objects.equals(this.sourceType, jobDto.sourceType) &&
        Objects.equals(this.batchExecutionKey, jobDto.batchExecutionKey) &&
        Objects.equals(this.info, jobDto.info) &&
        Objects.equals(this.creationTime, jobDto.creationTime) &&
        Objects.equals(this.startingScheduleId, jobDto.startingScheduleId) &&
        Objects.equals(this.releaseName, jobDto.releaseName) &&
        Objects.equals(this.type, jobDto.type) &&
        Objects.equals(this.inputArguments, jobDto.inputArguments) &&
        Objects.equals(this.outputArguments, jobDto.outputArguments) &&
        Objects.equals(this.hostMachineName, jobDto.hostMachineName) &&
        Objects.equals(this.hasMediaRecorded, jobDto.hasMediaRecorded) &&
        Objects.equals(this.id, jobDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, startTime, endTime, state, robot, release, source, sourceType, batchExecutionKey, info, creationTime, startingScheduleId, releaseName, type, inputArguments, outputArguments, hostMachineName, hasMediaRecorded, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDto {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    robot: ").append(toIndentedString(robot)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    batchExecutionKey: ").append(toIndentedString(batchExecutionKey)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    startingScheduleId: ").append(toIndentedString(startingScheduleId)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inputArguments: ").append(toIndentedString(inputArguments)).append("\n");
    sb.append("    outputArguments: ").append(toIndentedString(outputArguments)).append("\n");
    sb.append("    hostMachineName: ").append(toIndentedString(hostMachineName)).append("\n");
    sb.append("    hasMediaRecorded: ").append(toIndentedString(hasMediaRecorded)).append("\n");
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

