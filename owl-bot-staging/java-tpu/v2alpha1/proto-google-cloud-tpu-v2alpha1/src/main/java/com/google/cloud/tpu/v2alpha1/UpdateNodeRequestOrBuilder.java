// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

package com.google.cloud.tpu.v2alpha1;

public interface UpdateNodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.UpdateNodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Mask of fields from [Node][Tpu.Node] to update.
   * Supported fields: None.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields from [Node][Tpu.Node] to update.
   * Supported fields: None.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Mask of fields from [Node][Tpu.Node] to update.
   * Supported fields: None.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. The node. Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.Node node = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   * <pre>
   * Required. The node. Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.Node node = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The node.
   */
  com.google.cloud.tpu.v2alpha1.Node getNode();
  /**
   * <pre>
   * Required. The node. Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.Node node = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.tpu.v2alpha1.NodeOrBuilder getNodeOrBuilder();
}