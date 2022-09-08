// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

public interface FunnelNextActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.FunnelNextAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The dimension column added to the funnel visualization sub report response.
   * The next action dimension returns the next dimension value of this
   * dimension after the user has attained the `i`th funnel step.
   * `nextActionDimension` currently only supports `eventName` and most Page /
   * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
   * cannot be a dimension expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
   * @return Whether the nextActionDimension field is set.
   */
  boolean hasNextActionDimension();
  /**
   * <pre>
   * The dimension column added to the funnel visualization sub report response.
   * The next action dimension returns the next dimension value of this
   * dimension after the user has attained the `i`th funnel step.
   * `nextActionDimension` currently only supports `eventName` and most Page /
   * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
   * cannot be a dimension expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
   * @return The nextActionDimension.
   */
  com.google.analytics.data.v1alpha.Dimension getNextActionDimension();
  /**
   * <pre>
   * The dimension column added to the funnel visualization sub report response.
   * The next action dimension returns the next dimension value of this
   * dimension after the user has attained the `i`th funnel step.
   * `nextActionDimension` currently only supports `eventName` and most Page /
   * Screen dimensions like `pageTitle` and `pagePath`. `nextActionDimension`
   * cannot be a dimension expression.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.Dimension next_action_dimension = 1;</code>
   */
  com.google.analytics.data.v1alpha.DimensionOrBuilder getNextActionDimensionOrBuilder();

  /**
   * <pre>
   * The maximum number of distinct values of the breakdown dimension to return
   * in the response. A `limit` of `5` is used if limit is not specified. Limit
   * must exceed zero and cannot exceed 5.
   * </pre>
   *
   * <code>optional int64 limit = 2;</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * The maximum number of distinct values of the breakdown dimension to return
   * in the response. A `limit` of `5` is used if limit is not specified. Limit
   * must exceed zero and cannot exceed 5.
   * </pre>
   *
   * <code>optional int64 limit = 2;</code>
   * @return The limit.
   */
  long getLimit();
}