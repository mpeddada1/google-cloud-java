// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/beyondcorp/appconnections/v1/app_connections_service.proto

package com.google.cloud.beyondcorp.appconnections.v1;

public interface GetAppConnectionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.beyondcorp.appconnections.v1.GetAppConnectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. BeyondCorp AppConnection name using the form:
   * `projects/{project_id}/locations/{location_id}/appConnections/{app_connection_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. BeyondCorp AppConnection name using the form:
   * `projects/{project_id}/locations/{location_id}/appConnections/{app_connection_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}