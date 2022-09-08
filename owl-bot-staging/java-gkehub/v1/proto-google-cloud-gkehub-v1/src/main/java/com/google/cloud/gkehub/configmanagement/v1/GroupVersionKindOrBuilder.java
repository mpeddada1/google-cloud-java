// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1;

public interface GroupVersionKindOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1.GroupVersionKind)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Kubernetes Group
   * </pre>
   *
   * <code>string group = 1;</code>
   * @return The group.
   */
  java.lang.String getGroup();
  /**
   * <pre>
   * Kubernetes Group
   * </pre>
   *
   * <code>string group = 1;</code>
   * @return The bytes for group.
   */
  com.google.protobuf.ByteString
      getGroupBytes();

  /**
   * <pre>
   * Kubernetes Version
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Kubernetes Version
   * </pre>
   *
   * <code>string version = 2;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <pre>
   * Kubernetes Kind
   * </pre>
   *
   * <code>string kind = 3;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * Kubernetes Kind
   * </pre>
   *
   * <code>string kind = 3;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();
}