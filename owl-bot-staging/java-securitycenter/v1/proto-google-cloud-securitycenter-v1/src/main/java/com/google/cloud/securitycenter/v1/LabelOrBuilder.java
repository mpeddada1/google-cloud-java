// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/label.proto

package com.google.cloud.securitycenter.v1;

public interface LabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Label)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Label name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Label name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Label value.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * Label value.
   * </pre>
   *
   * <code>string value = 2;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}