// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/policytagmanager.proto

package com.google.cloud.datacatalog.v1;

public interface DeleteTaxonomyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.DeleteTaxonomyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the taxonomy to delete.
   * Note: All policy tags in this taxonomy are also deleted.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Resource name of the taxonomy to delete.
   * Note: All policy tags in this taxonomy are also deleted.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}