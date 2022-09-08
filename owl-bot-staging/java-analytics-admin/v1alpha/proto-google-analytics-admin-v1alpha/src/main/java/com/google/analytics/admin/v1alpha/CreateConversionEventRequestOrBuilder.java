// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface CreateConversionEventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateConversionEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the conversionEvent field is set.
   */
  boolean hasConversionEvent();
  /**
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The conversionEvent.
   */
  com.google.analytics.admin.v1alpha.ConversionEvent getConversionEvent();
  /**
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.analytics.admin.v1alpha.ConversionEventOrBuilder getConversionEventOrBuilder();

  /**
   * <pre>
   * Required. The resource name of the parent property where this conversion event will
   * be created. Format: properties/123
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The resource name of the parent property where this conversion event will
   * be created. Format: properties/123
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();
}