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
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public interface UpdateSettingsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.UpdateSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The settings to update.
   *
   * The settings' `name` field is used to identify the settings to be updated.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the settings field is set.
   */
  boolean hasSettings();
  /**
   *
   *
   * <pre>
   * Required. The settings to update.
   *
   * The settings' `name` field is used to identify the settings to be updated.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The settings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.Settings getSettings();
  /**
   *
   *
   * <pre>
   * Required. The settings to update.
   *
   * The settings' `name` field is used to identify the settings to be updated.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder getSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to be updated on the settings.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated on the settings.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to be updated on the settings.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
