// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1beta1/budget_model.proto

package com.google.cloud.billing.budgets.v1beta1;

public interface CustomPeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1beta1.CustomPeriod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The start date must be after January 1, 2017.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Required. The start date must be after January 1, 2017.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The startDate.
   */
  com.google.type.Date getStartDate();
  /**
   * <pre>
   * Required. The start date must be after January 1, 2017.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.DateOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * Optional. The end date of the time period. Budgets with elapsed end date won't be
   * processed. If unset, specifies to track all usage
   * incurred since the start_date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * Optional. The end date of the time period. Budgets with elapsed end date won't be
   * processed. If unset, specifies to track all usage
   * incurred since the start_date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The endDate.
   */
  com.google.type.Date getEndDate();
  /**
   * <pre>
   * Optional. The end date of the time period. Budgets with elapsed end date won't be
   * processed. If unset, specifies to track all usage
   * incurred since the start_date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.type.DateOrBuilder getEndDateOrBuilder();
}