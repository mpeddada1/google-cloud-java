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
// source: google/cloud/retail/v2beta/serving_config_service.proto

package com.google.cloud.retail.v2beta;

public interface CreateServingConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.CreateServingConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of parent. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of parent. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to create.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the servingConfig field is set.
   */
  boolean hasServingConfig();
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to create.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The servingConfig.
   */
  com.google.cloud.retail.v2beta.ServingConfig getServingConfig();
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to create.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.ServingConfig serving_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.ServingConfigOrBuilder getServingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the ServingConfig, which will become the final
   * component of the ServingConfig's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-_/.
   * </pre>
   *
   * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The servingConfigId.
   */
  java.lang.String getServingConfigId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the ServingConfig, which will become the final
   * component of the ServingConfig's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-_/.
   * </pre>
   *
   * <code>string serving_config_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for servingConfigId.
   */
  com.google.protobuf.ByteString getServingConfigIdBytes();
}
