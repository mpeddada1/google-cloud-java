// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1alpha/metastore.proto

package com.google.cloud.metastore.v1alpha;

public interface LakeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.Lake)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Lake resource name.
   * Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The Lake resource name.
   * Example:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}