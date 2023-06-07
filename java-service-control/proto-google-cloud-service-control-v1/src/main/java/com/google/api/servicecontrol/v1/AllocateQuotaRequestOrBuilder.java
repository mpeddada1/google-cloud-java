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
// source: google/api/servicecontrol/v1/quota_controller.proto

package com.google.api.servicecontrol.v1;

public interface AllocateQuotaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.AllocateQuotaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the service as specified in the service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   *
   *
   * <pre>
   * Name of the service as specified in the service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See [google.api.Service][google.api.Service] for the definition of a service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString getServiceNameBytes();

  /**
   *
   *
   * <pre>
   * Operation that describes the quota allocation.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
   *
   * @return Whether the allocateOperation field is set.
   */
  boolean hasAllocateOperation();
  /**
   *
   *
   * <pre>
   * Operation that describes the quota allocation.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
   *
   * @return The allocateOperation.
   */
  com.google.api.servicecontrol.v1.QuotaOperation getAllocateOperation();
  /**
   *
   *
   * <pre>
   * Operation that describes the quota allocation.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.QuotaOperation allocate_operation = 2;</code>
   */
  com.google.api.servicecontrol.v1.QuotaOperationOrBuilder getAllocateOperationOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request. If unspecified or no matching version can be found, the latest
   * one will be used.
   * </pre>
   *
   * <code>string service_config_id = 4;</code>
   *
   * @return The serviceConfigId.
   */
  java.lang.String getServiceConfigId();
  /**
   *
   *
   * <pre>
   * Specifies which version of service configuration should be used to process
   * the request. If unspecified or no matching version can be found, the latest
   * one will be used.
   * </pre>
   *
   * <code>string service_config_id = 4;</code>
   *
   * @return The bytes for serviceConfigId.
   */
  com.google.protobuf.ByteString getServiceConfigIdBytes();
}
