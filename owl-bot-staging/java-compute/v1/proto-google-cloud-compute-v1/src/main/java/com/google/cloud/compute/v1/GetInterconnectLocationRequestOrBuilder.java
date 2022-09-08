// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetInterconnectLocationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetInterconnectLocationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the interconnect location to return.
   * </pre>
   *
   * <code>string interconnect_location = 492235846 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The interconnectLocation.
   */
  java.lang.String getInterconnectLocation();
  /**
   * <pre>
   * Name of the interconnect location to return.
   * </pre>
   *
   * <code>string interconnect_location = 492235846 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for interconnectLocation.
   */
  com.google.protobuf.ByteString
      getInterconnectLocationBytes();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();
}