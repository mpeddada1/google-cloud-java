// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta2/document_understanding.proto

package com.google.cloud.documentai.v1beta2;

public interface AutoMlParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta2.AutoMlParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the AutoML model.
   * Format: `projects/{project-id}/locations/{location-id}/models/{model-id}`.
   * </pre>
   *
   * <code>string model = 1;</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Resource name of the AutoML model.
   * Format: `projects/{project-id}/locations/{location-id}/models/{model-id}`.
   * </pre>
   *
   * <code>string model = 1;</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();
}