// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

public interface WorkerReleasedEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.WorkerReleasedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The zone the worker was running in.
   * </pre>
   *
   * <code>string zone = 1;</code>
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   * <pre>
   * The zone the worker was running in.
   * </pre>
   *
   * <code>string zone = 1;</code>
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * The worker's instance name.
   * </pre>
   *
   * <code>string instance = 2;</code>
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   * <pre>
   * The worker's instance name.
   * </pre>
   *
   * <code>string instance = 2;</code>
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString
      getInstanceBytes();
}