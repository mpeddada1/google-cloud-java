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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NetworkEndpointGroupAppEngineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkEndpointGroupAppEngine)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: "default", "my-service".
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();
  /**
   *
   *
   * <pre>
   * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: "default", "my-service".
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: "default", "my-service".
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "&lt;service&gt;-dot-appname.appspot.com/&lt;version&gt;". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   *
   * @return Whether the urlMask field is set.
   */
  boolean hasUrlMask();
  /**
   *
   *
   * <pre>
   * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "&lt;service&gt;-dot-appname.appspot.com/&lt;version&gt;". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   *
   * @return The urlMask.
   */
  java.lang.String getUrlMask();
  /**
   *
   *
   * <pre>
   * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "&lt;service&gt;-dot-appname.appspot.com/&lt;version&gt;". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
   * </pre>
   *
   * <code>optional string url_mask = 103352252;</code>
   *
   * @return The bytes for urlMask.
   */
  com.google.protobuf.ByteString getUrlMaskBytes();

  /**
   *
   *
   * <pre>
   * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: "v1", "v2".
   * </pre>
   *
   * <code>optional string version = 351608024;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: "v1", "v2".
   * </pre>
   *
   * <code>optional string version = 351608024;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: "v1", "v2".
   * </pre>
   *
   * <code>optional string version = 351608024;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}