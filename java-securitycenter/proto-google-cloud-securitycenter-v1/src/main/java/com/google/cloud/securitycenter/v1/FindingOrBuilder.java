/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/finding.proto

package com.google.cloud.securitycenter.v1;

public interface FindingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Finding)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * This field is immutable after creation time.
   * For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * This field is immutable after creation time.
   * For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * For findings on Google Cloud resources, the full resource
   * name of the Google Cloud resource this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * When the finding is for a non-Google Cloud resource, the resourceName can
   * be a customer or partner defined string. This field is immutable after
   * creation time.
   * </pre>
   *
   * <code>string resource_name = 3;</code>
   *
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   *
   *
   * <pre>
   * For findings on Google Cloud resources, the full resource
   * name of the Google Cloud resource this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * When the finding is for a non-Google Cloud resource, the resourceName can
   * be a customer or partner defined string. This field is immutable after
   * creation time.
   * </pre>
   *
   * <code>string resource_name = 3;</code>
   *
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString getResourceNameBytes();

  /**
   *
   *
   * <pre>
   * The state of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.State state = 4;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The state of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.State state = 4;</code>
   *
   * @return The state.
   */
  com.google.cloud.securitycenter.v1.Finding.State getState();

  /**
   *
   *
   * <pre>
   * The additional taxonomy group within findings from a given source.
   * This field is immutable after creation time.
   * Example: "XSS_FLASH_INJECTION"
   * </pre>
   *
   * <code>string category = 5;</code>
   *
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   *
   *
   * <pre>
   * The additional taxonomy group within findings from a given source.
   * This field is immutable after creation time.
   * Example: "XSS_FLASH_INJECTION"
   * </pre>
   *
   * <code>string category = 5;</code>
   *
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString getCategoryBytes();

  /**
   *
   *
   * <pre>
   * The URI that, if available, points to a web page outside of Security
   * Command Center where additional information about the finding can be found.
   * This field is guaranteed to be either empty or a well formed URL.
   * </pre>
   *
   * <code>string external_uri = 6;</code>
   *
   * @return The externalUri.
   */
  java.lang.String getExternalUri();
  /**
   *
   *
   * <pre>
   * The URI that, if available, points to a web page outside of Security
   * Command Center where additional information about the finding can be found.
   * This field is guaranteed to be either empty or a well formed URL.
   * </pre>
   *
   * <code>string external_uri = 6;</code>
   *
   * @return The bytes for externalUri.
   */
  com.google.protobuf.ByteString getExternalUriBytes();

  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  int getSourcePropertiesCount();
  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  boolean containsSourceProperties(java.lang.String key);
  /** Use {@link #getSourcePropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getSourceProperties();
  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getSourcePropertiesMap();
  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  com.google.protobuf.Value getSourcePropertiesOrDefault(
      java.lang.String key, com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Source specific properties. These properties are managed by the source
   * that writes the finding. The key names in the source_properties map must be
   * between 1 and 255 characters, and must start with a letter and contain
   * alphanumeric characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 7;</code>
   */
  com.google.protobuf.Value getSourcePropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. User specified security marks. These marks are entirely
   * managed by the user and come from the SecurityMarks resource that belongs
   * to the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SecurityMarks security_marks = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the securityMarks field is set.
   */
  boolean hasSecurityMarks();
  /**
   *
   *
   * <pre>
   * Output only. User specified security marks. These marks are entirely
   * managed by the user and come from the SecurityMarks resource that belongs
   * to the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SecurityMarks security_marks = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The securityMarks.
   */
  com.google.cloud.securitycenter.v1.SecurityMarks getSecurityMarks();
  /**
   *
   *
   * <pre>
   * Output only. User specified security marks. These marks are entirely
   * managed by the user and come from the SecurityMarks resource that belongs
   * to the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.SecurityMarks security_marks = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycenter.v1.SecurityMarksOrBuilder getSecurityMarksOrBuilder();

  /**
   *
   *
   * <pre>
   * The time the finding was first detected. If an existing finding is updated,
   * then this is the time the update occurred.
   * For example, if the finding represents an open firewall, this property
   * captures the time the detector believes the firewall became open. The
   * accuracy is determined by the detector. If the finding is later resolved,
   * then this time reflects when the finding was resolved. This must not
   * be set to a value greater than the current timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 9;</code>
   *
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   *
   *
   * <pre>
   * The time the finding was first detected. If an existing finding is updated,
   * then this is the time the update occurred.
   * For example, if the finding represents an open firewall, this property
   * captures the time the detector believes the firewall became open. The
   * accuracy is determined by the detector. If the finding is later resolved,
   * then this time reflects when the finding was resolved. This must not
   * be set to a value greater than the current timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 9;</code>
   *
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   *
   *
   * <pre>
   * The time the finding was first detected. If an existing finding is updated,
   * then this is the time the update occurred.
   * For example, if the finding represents an open firewall, this property
   * captures the time the detector believes the firewall became open. The
   * accuracy is determined by the detector. If the finding is later resolved,
   * then this time reflects when the finding was resolved. This must not
   * be set to a value greater than the current timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the finding was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which the finding was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which the finding was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The severity of the finding. This field is managed by the source that
   * writes the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.Severity severity = 12;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * The severity of the finding. This field is managed by the source that
   * writes the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.Severity severity = 12;</code>
   *
   * @return The severity.
   */
  com.google.cloud.securitycenter.v1.Finding.Severity getSeverity();

  /**
   *
   *
   * <pre>
   * The canonical name of the finding. It's either
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}",
   * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}" or
   * "projects/{project_number}/sources/{source_id}/findings/{finding_id}",
   * depending on the closest CRM ancestor of the resource associated with the
   * finding.
   * </pre>
   *
   * <code>string canonical_name = 14;</code>
   *
   * @return The canonicalName.
   */
  java.lang.String getCanonicalName();
  /**
   *
   *
   * <pre>
   * The canonical name of the finding. It's either
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}",
   * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}" or
   * "projects/{project_number}/sources/{source_id}/findings/{finding_id}",
   * depending on the closest CRM ancestor of the resource associated with the
   * finding.
   * </pre>
   *
   * <code>string canonical_name = 14;</code>
   *
   * @return The bytes for canonicalName.
   */
  com.google.protobuf.ByteString getCanonicalNameBytes();

  /**
   *
   *
   * <pre>
   * Indicates the mute state of a finding (either unspecified, muted, unmuted
   * or undefined). Unlike other attributes of a finding, a finding provider
   * shouldn't set the value of mute.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.Mute mute = 15;</code>
   *
   * @return The enum numeric value on the wire for mute.
   */
  int getMuteValue();
  /**
   *
   *
   * <pre>
   * Indicates the mute state of a finding (either unspecified, muted, unmuted
   * or undefined). Unlike other attributes of a finding, a finding provider
   * shouldn't set the value of mute.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.Mute mute = 15;</code>
   *
   * @return The mute.
   */
  com.google.cloud.securitycenter.v1.Finding.Mute getMute();

  /**
   *
   *
   * <pre>
   * The class of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.FindingClass finding_class = 17;</code>
   *
   * @return The enum numeric value on the wire for findingClass.
   */
  int getFindingClassValue();
  /**
   *
   *
   * <pre>
   * The class of the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding.FindingClass finding_class = 17;</code>
   *
   * @return The findingClass.
   */
  com.google.cloud.securitycenter.v1.Finding.FindingClass getFindingClass();

  /**
   *
   *
   * <pre>
   * Represents what's commonly known as an Indicator of compromise (IoC) in
   * computer forensics. This is an artifact observed on a network or in an
   * operating system that, with high confidence, indicates a computer
   * intrusion.
   * Reference: https://en.wikipedia.org/wiki/Indicator_of_compromise
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Indicator indicator = 18;</code>
   *
   * @return Whether the indicator field is set.
   */
  boolean hasIndicator();
  /**
   *
   *
   * <pre>
   * Represents what's commonly known as an Indicator of compromise (IoC) in
   * computer forensics. This is an artifact observed on a network or in an
   * operating system that, with high confidence, indicates a computer
   * intrusion.
   * Reference: https://en.wikipedia.org/wiki/Indicator_of_compromise
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Indicator indicator = 18;</code>
   *
   * @return The indicator.
   */
  com.google.cloud.securitycenter.v1.Indicator getIndicator();
  /**
   *
   *
   * <pre>
   * Represents what's commonly known as an Indicator of compromise (IoC) in
   * computer forensics. This is an artifact observed on a network or in an
   * operating system that, with high confidence, indicates a computer
   * intrusion.
   * Reference: https://en.wikipedia.org/wiki/Indicator_of_compromise
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Indicator indicator = 18;</code>
   */
  com.google.cloud.securitycenter.v1.IndicatorOrBuilder getIndicatorOrBuilder();

  /**
   *
   *
   * <pre>
   * Represents vulnerability specific fields like cve, cvss scores etc.
   * CVE stands for Common Vulnerabilities and Exposures
   * (https://cve.mitre.org/about/)
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Vulnerability vulnerability = 20;</code>
   *
   * @return Whether the vulnerability field is set.
   */
  boolean hasVulnerability();
  /**
   *
   *
   * <pre>
   * Represents vulnerability specific fields like cve, cvss scores etc.
   * CVE stands for Common Vulnerabilities and Exposures
   * (https://cve.mitre.org/about/)
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Vulnerability vulnerability = 20;</code>
   *
   * @return The vulnerability.
   */
  com.google.cloud.securitycenter.v1.Vulnerability getVulnerability();
  /**
   *
   *
   * <pre>
   * Represents vulnerability specific fields like cve, cvss scores etc.
   * CVE stands for Common Vulnerabilities and Exposures
   * (https://cve.mitre.org/about/)
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Vulnerability vulnerability = 20;</code>
   */
  com.google.cloud.securitycenter.v1.VulnerabilityOrBuilder getVulnerabilityOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The most recent time this finding was muted or unmuted.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp mute_update_time = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the muteUpdateTime field is set.
   */
  boolean hasMuteUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time this finding was muted or unmuted.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp mute_update_time = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The muteUpdateTime.
   */
  com.google.protobuf.Timestamp getMuteUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The most recent time this finding was muted or unmuted.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp mute_update_time = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getMuteUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Third party SIEM/SOAR fields within SCC, contains external
   * system information and external system finding fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.v1.ExternalSystem&gt; external_systems = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getExternalSystemsCount();
  /**
   *
   *
   * <pre>
   * Output only. Third party SIEM/SOAR fields within SCC, contains external
   * system information and external system finding fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.v1.ExternalSystem&gt; external_systems = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsExternalSystems(java.lang.String key);
  /** Use {@link #getExternalSystemsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.securitycenter.v1.ExternalSystem>
      getExternalSystems();
  /**
   *
   *
   * <pre>
   * Output only. Third party SIEM/SOAR fields within SCC, contains external
   * system information and external system finding fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.v1.ExternalSystem&gt; external_systems = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.securitycenter.v1.ExternalSystem>
      getExternalSystemsMap();
  /**
   *
   *
   * <pre>
   * Output only. Third party SIEM/SOAR fields within SCC, contains external
   * system information and external system finding fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.v1.ExternalSystem&gt; external_systems = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycenter.v1.ExternalSystem getExternalSystemsOrDefault(
      java.lang.String key, com.google.cloud.securitycenter.v1.ExternalSystem defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Third party SIEM/SOAR fields within SCC, contains external
   * system information and external system finding fields.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.v1.ExternalSystem&gt; external_systems = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycenter.v1.ExternalSystem getExternalSystemsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * MITRE ATT&amp;CK tactics and techniques related to this finding.
   * See: https://attack.mitre.org
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.MitreAttack mitre_attack = 25;</code>
   *
   * @return Whether the mitreAttack field is set.
   */
  boolean hasMitreAttack();
  /**
   *
   *
   * <pre>
   * MITRE ATT&amp;CK tactics and techniques related to this finding.
   * See: https://attack.mitre.org
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.MitreAttack mitre_attack = 25;</code>
   *
   * @return The mitreAttack.
   */
  com.google.cloud.securitycenter.v1.MitreAttack getMitreAttack();
  /**
   *
   *
   * <pre>
   * MITRE ATT&amp;CK tactics and techniques related to this finding.
   * See: https://attack.mitre.org
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.MitreAttack mitre_attack = 25;</code>
   */
  com.google.cloud.securitycenter.v1.MitreAttackOrBuilder getMitreAttackOrBuilder();

  /**
   *
   *
   * <pre>
   * Access details associated to the Finding, such as more information on the
   * caller, which method was accessed, from where, etc.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Access access = 26;</code>
   *
   * @return Whether the access field is set.
   */
  boolean hasAccess();
  /**
   *
   *
   * <pre>
   * Access details associated to the Finding, such as more information on the
   * caller, which method was accessed, from where, etc.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Access access = 26;</code>
   *
   * @return The access.
   */
  com.google.cloud.securitycenter.v1.Access getAccess();
  /**
   *
   *
   * <pre>
   * Access details associated to the Finding, such as more information on the
   * caller, which method was accessed, from where, etc.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Access access = 26;</code>
   */
  com.google.cloud.securitycenter.v1.AccessOrBuilder getAccessOrBuilder();

  /**
   *
   *
   * <pre>
   * First known as mute_annotation. Records additional information about the
   * mute operation e.g. mute config that muted the finding, user who muted the
   * finding, etc. Unlike other attributes of a finding, a finding provider
   * shouldn't set the value of mute.
   * </pre>
   *
   * <code>string mute_initiator = 28;</code>
   *
   * @return The muteInitiator.
   */
  java.lang.String getMuteInitiator();
  /**
   *
   *
   * <pre>
   * First known as mute_annotation. Records additional information about the
   * mute operation e.g. mute config that muted the finding, user who muted the
   * finding, etc. Unlike other attributes of a finding, a finding provider
   * shouldn't set the value of mute.
   * </pre>
   *
   * <code>string mute_initiator = 28;</code>
   *
   * @return The bytes for muteInitiator.
   */
  com.google.protobuf.ByteString getMuteInitiatorBytes();
}
