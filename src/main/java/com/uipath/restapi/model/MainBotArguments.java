package com.uipath.restapi.model;

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

public class MainBotArguments   {
  @JsonProperty("triggerType")
  private String triggerType = null;

  @JsonProperty("smsText")
  private String smsText = null;

  @JsonProperty("smsFromNumber")
  private String smsFromNumber = null;

  @JsonProperty("smsToNumber")
  private String smsToNumber = null;

  @JsonProperty("teamsActivityId")
  private String teamsActivityId = null;

  @JsonProperty("teamsText")
  private String teamsText = null;

  @JsonProperty("teamsServiceUrl")
  private String teamsServiceUrl = null;

  @JsonProperty("teamsFromId")
  private String teamsFromId = null;

  @JsonProperty("teamsFromName")
  private String teamsFromName = null;

  @JsonProperty("teamsRecipientId")
  private String teamsRecipientId = null;

  @JsonProperty("teamsRecipientName")
  private String teamsRecipientName = null;

  @JsonProperty("teamsConversationId")
  private String teamsConversationId = null;

  @JsonProperty("teamsAuthTokenForReply")
  private String teamsAuthTokenForReply = null;

  @JsonProperty("emailBody")
  private String emailBody = null;

  @JsonProperty("emailUrlForReplyAll")
  private String emailUrlForReplyAll = null;

  @JsonProperty("emailAuthTokenForReplyAll")
  private String emailAuthTokenForReplyAll = null;

  @JsonProperty("emailFromId")
  private String emailFromId = null;

  @JsonProperty("emailFromName")
  private String emailFromName = null;

  @JsonProperty("phoneInputMessage")
  private String phoneInputMessage = null;

  @JsonProperty("phoneFromNumber")
  private String phoneFromNumber = null;

  @JsonProperty("phoneToNumber")
  private String phoneToNumber = null;

  @JsonProperty("phoneAuthTokenForReply")
  private String phoneAuthTokenForReply = null;

  public MainBotArguments triggerType(String triggerType) {
    this.triggerType = triggerType;
    return this;
  }

  /**
   * triggerType
   * @return triggerType
  **/
  @ApiModelProperty(value = "triggerType")


  public String getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(String triggerType) {
    this.triggerType = triggerType;
  }

  public MainBotArguments smsText(String smsText) {
    this.smsText = smsText;
    return this;
  }

  /**
   * smsText
   * @return smsText
  **/
  @ApiModelProperty(value = "smsText")


  public String getSmsText() {
    return smsText;
  }

  public void setSmsText(String smsText) {
    this.smsText = smsText;
  }

  public MainBotArguments smsFromNumber(String smsFromNumber) {
    this.smsFromNumber = smsFromNumber;
    return this;
  }

  /**
   * smsFromNumber
   * @return smsFromNumber
  **/
  @ApiModelProperty(value = "smsFromNumber")


  public String getSmsFromNumber() {
    return smsFromNumber;
  }

  public void setSmsFromNumber(String smsFromNumber) {
    this.smsFromNumber = smsFromNumber;
  }

  public MainBotArguments smsToNumber(String smsToNumber) {
    this.smsToNumber = smsToNumber;
    return this;
  }

  /**
   * smsToNumber
   * @return smsToNumber
  **/
  @ApiModelProperty(value = "smsToNumber")


  public String getSmsToNumber() {
    return smsToNumber;
  }

  public void setSmsToNumber(String smsToNumber) {
    this.smsToNumber = smsToNumber;
  }

  public MainBotArguments teamsActivityId(String teamsActivityId) {
    this.teamsActivityId = teamsActivityId;
    return this;
  }

  /**
   * teamsActivityId
   * @return teamsActivityId
  **/
  @ApiModelProperty(value = "teamsActivityId")


  public String getTeamsActivityId() {
    return teamsActivityId;
  }

  public void setTeamsActivityId(String teamsActivityId) {
    this.teamsActivityId = teamsActivityId;
  }

  public MainBotArguments teamsText(String teamsText) {
    this.teamsText = teamsText;
    return this;
  }

  /**
   * teamsText
   * @return teamsText
  **/
  @ApiModelProperty(value = "teamsText")


  public String getTeamsText() {
    return teamsText;
  }

  public void setTeamsText(String teamsText) {
    this.teamsText = teamsText;
  }

  public MainBotArguments teamsServiceUrl(String teamsServiceUrl) {
    this.teamsServiceUrl = teamsServiceUrl;
    return this;
  }

  /**
   * teamsServiceUrl
   * @return teamsServiceUrl
  **/
  @ApiModelProperty(value = "teamsServiceUrl")


  public String getTeamsServiceUrl() {
    return teamsServiceUrl;
  }

  public void setTeamsServiceUrl(String teamsServiceUrl) {
    this.teamsServiceUrl = teamsServiceUrl;
  }

  public MainBotArguments teamsFromId(String teamsFromId) {
    this.teamsFromId = teamsFromId;
    return this;
  }

  /**
   * teamsFromId
   * @return teamsFromId
  **/
  @ApiModelProperty(value = "teamsFromId")


  public String getTeamsFromId() {
    return teamsFromId;
  }

  public void setTeamsFromId(String teamsFromId) {
    this.teamsFromId = teamsFromId;
  }

  public MainBotArguments teamsFromName(String teamsFromName) {
    this.teamsFromName = teamsFromName;
    return this;
  }

  /**
   * teamsFromName
   * @return teamsFromName
  **/
  @ApiModelProperty(value = "teamsFromName")


  public String getTeamsFromName() {
    return teamsFromName;
  }

  public void setTeamsFromName(String teamsFromName) {
    this.teamsFromName = teamsFromName;
  }

  public MainBotArguments teamsRecipientId(String teamsRecipientId) {
    this.teamsRecipientId = teamsRecipientId;
    return this;
  }

  /**
   * teamsRecipientId
   * @return teamsRecipientId
  **/
  @ApiModelProperty(value = "teamsRecipientId")


  public String getTeamsRecipientId() {
    return teamsRecipientId;
  }

  public void setTeamsRecipientId(String teamsRecipientId) {
    this.teamsRecipientId = teamsRecipientId;
  }

  public MainBotArguments teamsRecipientName(String teamsRecipientName) {
    this.teamsRecipientName = teamsRecipientName;
    return this;
  }

  /**
   * teamsRecipientName
   * @return teamsRecipientName
  **/
  @ApiModelProperty(value = "teamsRecipientName")


  public String getTeamsRecipientName() {
    return teamsRecipientName;
  }

  public void setTeamsRecipientName(String teamsRecipientName) {
    this.teamsRecipientName = teamsRecipientName;
  }

  public MainBotArguments teamsConversationId(String teamsConversationId) {
    this.teamsConversationId = teamsConversationId;
    return this;
  }

  /**
   * teamsConversationId
   * @return teamsConversationId
  **/
  @ApiModelProperty(value = "teamsConversationId")


  public String getTeamsConversationId() {
    return teamsConversationId;
  }

  public void setTeamsConversationId(String teamsConversationId) {
    this.teamsConversationId = teamsConversationId;
  }

  public MainBotArguments teamsAuthTokenForReply(String teamsAuthTokenForReply) {
    this.teamsAuthTokenForReply = teamsAuthTokenForReply;
    return this;
  }

  /**
   * teamsAuthTokenForReply
   * @return teamsAuthTokenForReply
  **/
  @ApiModelProperty(value = "teamsAuthTokenForReply")


  public String getTeamsAuthTokenForReply() {
    return teamsAuthTokenForReply;
  }

  public void setTeamsAuthTokenForReply(String teamsAuthTokenForReply) {
    this.teamsAuthTokenForReply = teamsAuthTokenForReply;
  }

  public MainBotArguments emailBody(String emailBody) {
    this.emailBody = emailBody;
    return this;
  }

  /**
   * emailBody
   * @return emailBody
  **/
  @ApiModelProperty(value = "emailBody")


  public String getEmailBody() {
    return emailBody;
  }

  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  public MainBotArguments emailUrlForReplyAll(String emailUrlForReplyAll) {
    this.emailUrlForReplyAll = emailUrlForReplyAll;
    return this;
  }

  /**
   * emailUrlForReplyAll
   * @return emailUrlForReplyAll
  **/
  @ApiModelProperty(value = "emailUrlForReplyAll")


  public String getEmailUrlForReplyAll() {
    return emailUrlForReplyAll;
  }

  public void setEmailUrlForReplyAll(String emailUrlForReplyAll) {
    this.emailUrlForReplyAll = emailUrlForReplyAll;
  }

  public MainBotArguments emailAuthTokenForReplyAll(String emailAuthTokenForReplyAll) {
    this.emailAuthTokenForReplyAll = emailAuthTokenForReplyAll;
    return this;
  }

  /**
   * emailAuthTokenForReplyAll
   * @return emailAuthTokenForReplyAll
  **/
  @ApiModelProperty(value = "emailAuthTokenForReplyAll")


  public String getEmailAuthTokenForReplyAll() {
    return emailAuthTokenForReplyAll;
  }

  public void setEmailAuthTokenForReplyAll(String emailAuthTokenForReplyAll) {
    this.emailAuthTokenForReplyAll = emailAuthTokenForReplyAll;
  }

  public MainBotArguments emailFromId(String emailFromId) {
    this.emailFromId = emailFromId;
    return this;
  }

  /**
   * emailFromId
   * @return emailFromId
  **/
  @ApiModelProperty(value = "emailFromId")


  public String getEmailFromId() {
    return emailFromId;
  }

  public void setEmailFromId(String emailFromId) {
    this.emailFromId = emailFromId;
  }

  public MainBotArguments emailFromName(String emailFromName) {
    this.emailFromName = emailFromName;
    return this;
  }

  /**
   * emailFromName
   * @return emailFromName
  **/
  @ApiModelProperty(value = "emailFromName")


  public String getEmailFromName() {
    return emailFromName;
  }

  public void setEmailFromName(String emailFromName) {
    this.emailFromName = emailFromName;
  }

  public MainBotArguments phoneInputMessage(String phoneInputMessage) {
    this.phoneInputMessage = phoneInputMessage;
    return this;
  }

  /**
   * phoneInputMessage
   * @return phoneInputMessage
  **/
  @ApiModelProperty(value = "phoneInputMessage")


  public String getPhoneInputMessage() {
    return phoneInputMessage;
  }

  public void setPhoneInputMessage(String phoneInputMessage) {
    this.phoneInputMessage = phoneInputMessage;
  }

  public MainBotArguments phoneFromNumber(String phoneFromNumber) {
    this.phoneFromNumber = phoneFromNumber;
    return this;
  }

  /**
   * phoneFromNumber
   * @return phoneFromNumber
  **/
  @ApiModelProperty(value = "phoneFromNumber")


  public String getPhoneFromNumber() {
    return phoneFromNumber;
  }

  public void setPhoneFromNumber(String phoneFromNumber) {
    this.phoneFromNumber = phoneFromNumber;
  }

  public MainBotArguments phoneToNumber(String phoneToNumber) {
    this.phoneToNumber = phoneToNumber;
    return this;
  }

  /**
   * phoneToNumber
   * @return phoneToNumber
  **/
  @ApiModelProperty(value = "phoneToNumber")


  public String getPhoneToNumber() {
    return phoneToNumber;
  }

  public void setPhoneToNumber(String phoneToNumber) {
    this.phoneToNumber = phoneToNumber;
  }

  public MainBotArguments phoneAuthTokenForReply(String phoneAuthTokenForReply) {
    this.phoneAuthTokenForReply = phoneAuthTokenForReply;
    return this;
  }

  /**
   * phoneAuthTokenForReply
   * @return phoneAuthTokenForReply
  **/
  @ApiModelProperty(value = "phoneAuthTokenForReply")


  public String getPhoneAuthTokenForReply() {
    return phoneAuthTokenForReply;
  }

  public void setPhoneAuthTokenForReply(String phoneAuthTokenForReply) {
    this.phoneAuthTokenForReply = phoneAuthTokenForReply;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainBotArguments mainBotArguments = (MainBotArguments) o;
    return Objects.equals(this.triggerType, mainBotArguments.triggerType) &&
        Objects.equals(this.smsText, mainBotArguments.smsText) &&
        Objects.equals(this.smsFromNumber, mainBotArguments.smsFromNumber) &&
        Objects.equals(this.smsToNumber, mainBotArguments.smsToNumber) &&
        Objects.equals(this.teamsActivityId, mainBotArguments.teamsActivityId) &&
        Objects.equals(this.teamsText, mainBotArguments.teamsText) &&
        Objects.equals(this.teamsServiceUrl, mainBotArguments.teamsServiceUrl) &&
        Objects.equals(this.teamsFromId, mainBotArguments.teamsFromId) &&
        Objects.equals(this.teamsFromName, mainBotArguments.teamsFromName) &&
        Objects.equals(this.teamsRecipientId, mainBotArguments.teamsRecipientId) &&
        Objects.equals(this.teamsRecipientName, mainBotArguments.teamsRecipientName) &&
        Objects.equals(this.teamsConversationId, mainBotArguments.teamsConversationId) &&
        Objects.equals(this.teamsAuthTokenForReply, mainBotArguments.teamsAuthTokenForReply) &&
        Objects.equals(this.emailBody, mainBotArguments.emailBody) &&
        Objects.equals(this.emailUrlForReplyAll, mainBotArguments.emailUrlForReplyAll) &&
        Objects.equals(this.emailAuthTokenForReplyAll, mainBotArguments.emailAuthTokenForReplyAll) &&
        Objects.equals(this.emailFromId, mainBotArguments.emailFromId) &&
        Objects.equals(this.emailFromName, mainBotArguments.emailFromName) &&
        Objects.equals(this.phoneInputMessage, mainBotArguments.phoneInputMessage) &&
        Objects.equals(this.phoneFromNumber, mainBotArguments.phoneFromNumber) &&
        Objects.equals(this.phoneToNumber, mainBotArguments.phoneToNumber) &&
        Objects.equals(this.phoneAuthTokenForReply, mainBotArguments.phoneAuthTokenForReply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triggerType, smsText, smsFromNumber, smsToNumber, teamsActivityId, teamsText, teamsServiceUrl, teamsFromId, teamsFromName, teamsRecipientId, teamsRecipientName, teamsConversationId, teamsAuthTokenForReply, emailBody, emailUrlForReplyAll, emailAuthTokenForReplyAll, emailFromId, emailFromName, phoneInputMessage, phoneFromNumber, phoneToNumber, phoneAuthTokenForReply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainBotArguments {\n");
    
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    smsText: ").append(toIndentedString(smsText)).append("\n");
    sb.append("    smsFromNumber: ").append(toIndentedString(smsFromNumber)).append("\n");
    sb.append("    smsToNumber: ").append(toIndentedString(smsToNumber)).append("\n");
    sb.append("    teamsActivityId: ").append(toIndentedString(teamsActivityId)).append("\n");
    sb.append("    teamsText: ").append(toIndentedString(teamsText)).append("\n");
    sb.append("    teamsServiceUrl: ").append(toIndentedString(teamsServiceUrl)).append("\n");
    sb.append("    teamsFromId: ").append(toIndentedString(teamsFromId)).append("\n");
    sb.append("    teamsFromName: ").append(toIndentedString(teamsFromName)).append("\n");
    sb.append("    teamsRecipientId: ").append(toIndentedString(teamsRecipientId)).append("\n");
    sb.append("    teamsRecipientName: ").append(toIndentedString(teamsRecipientName)).append("\n");
    sb.append("    teamsConversationId: ").append(toIndentedString(teamsConversationId)).append("\n");
    sb.append("    teamsAuthTokenForReply: ").append(toIndentedString(teamsAuthTokenForReply)).append("\n");
    sb.append("    emailBody: ").append(toIndentedString(emailBody)).append("\n");
    sb.append("    emailUrlForReplyAll: ").append(toIndentedString(emailUrlForReplyAll)).append("\n");
    sb.append("    emailAuthTokenForReplyAll: ").append(toIndentedString(emailAuthTokenForReplyAll)).append("\n");
    sb.append("    emailFromId: ").append(toIndentedString(emailFromId)).append("\n");
    sb.append("    emailFromName: ").append(toIndentedString(emailFromName)).append("\n");
    sb.append("    phoneInputMessage: ").append(toIndentedString(phoneInputMessage)).append("\n");
    sb.append("    phoneFromNumber: ").append(toIndentedString(phoneFromNumber)).append("\n");
    sb.append("    phoneToNumber: ").append(toIndentedString(phoneToNumber)).append("\n");
    sb.append("    phoneAuthTokenForReply: ").append(toIndentedString(phoneAuthTokenForReply)).append("\n");
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

