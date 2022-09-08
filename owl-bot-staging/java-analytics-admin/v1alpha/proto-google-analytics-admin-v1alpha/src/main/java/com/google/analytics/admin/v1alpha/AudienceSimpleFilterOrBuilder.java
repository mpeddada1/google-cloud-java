// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/audience.proto

package com.google.analytics.admin.v1alpha;

public interface AudienceSimpleFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AudienceSimpleFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Immutable. Specifies the scope for this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   * <pre>
   * Required. Immutable. Specifies the scope for this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterScope scope = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The scope.
   */
  com.google.analytics.admin.v1alpha.AudienceFilterScope getScope();

  /**
   * <pre>
   * Required. Immutable. A logical expression of Audience dimension, metric, or event filters.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the filterExpression field is set.
   */
  boolean hasFilterExpression();
  /**
   * <pre>
   * Required. Immutable. A logical expression of Audience dimension, metric, or event filters.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The filterExpression.
   */
  com.google.analytics.admin.v1alpha.AudienceFilterExpression getFilterExpression();
  /**
   * <pre>
   * Required. Immutable. A logical expression of Audience dimension, metric, or event filters.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceFilterExpression filter_expression = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder getFilterExpressionOrBuilder();
}