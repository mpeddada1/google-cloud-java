// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1/budget_model.proto

package com.google.cloud.billing.budgets.v1;

public interface BudgetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1.Budget)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Resource name of the budget.
   * The resource name implies the scope of a budget. Values are of the form
   * `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. Resource name of the budget.
   * The resource name implies the scope of a budget. Values are of the form
   * `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * User data for display name in UI. The name must be less than or equal to 60
   * characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * User data for display name in UI. The name must be less than or equal to 60
   * characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Optional. Filters that define which resources are used to compute the
   * actual spend against the budget amount, such as projects, services, and the
   * budget's time period, as well as other filters.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.Filter budget_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the budgetFilter field is set.
   */
  boolean hasBudgetFilter();
  /**
   * <pre>
   * Optional. Filters that define which resources are used to compute the
   * actual spend against the budget amount, such as projects, services, and the
   * budget's time period, as well as other filters.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.Filter budget_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The budgetFilter.
   */
  com.google.cloud.billing.budgets.v1.Filter getBudgetFilter();
  /**
   * <pre>
   * Optional. Filters that define which resources are used to compute the
   * actual spend against the budget amount, such as projects, services, and the
   * budget's time period, as well as other filters.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.Filter budget_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.billing.budgets.v1.FilterOrBuilder getBudgetFilterOrBuilder();

  /**
   * <pre>
   * Required. Budgeted amount.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.BudgetAmount amount = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <pre>
   * Required. Budgeted amount.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.BudgetAmount amount = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The amount.
   */
  com.google.cloud.billing.budgets.v1.BudgetAmount getAmount();
  /**
   * <pre>
   * Required. Budgeted amount.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.BudgetAmount amount = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.billing.budgets.v1.BudgetAmountOrBuilder getAmountOrBuilder();

  /**
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.billing.budgets.v1.ThresholdRule> 
      getThresholdRulesList();
  /**
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.billing.budgets.v1.ThresholdRule getThresholdRules(int index);
  /**
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getThresholdRulesCount();
  /**
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.billing.budgets.v1.ThresholdRuleOrBuilder> 
      getThresholdRulesOrBuilderList();
  /**
   * <pre>
   * Optional. Rules that trigger alerts (notifications of thresholds
   * being crossed) when spend exceeds the specified percentages of the budget.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1.ThresholdRule threshold_rules = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.billing.budgets.v1.ThresholdRuleOrBuilder getThresholdRulesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Rules to apply to notifications sent based on budget spend and
   * thresholds.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.NotificationsRule notifications_rule = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the notificationsRule field is set.
   */
  boolean hasNotificationsRule();
  /**
   * <pre>
   * Optional. Rules to apply to notifications sent based on budget spend and
   * thresholds.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.NotificationsRule notifications_rule = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The notificationsRule.
   */
  com.google.cloud.billing.budgets.v1.NotificationsRule getNotificationsRule();
  /**
   * <pre>
   * Optional. Rules to apply to notifications sent based on budget spend and
   * thresholds.
   * </pre>
   *
   * <code>.google.cloud.billing.budgets.v1.NotificationsRule notifications_rule = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.billing.budgets.v1.NotificationsRuleOrBuilder getNotificationsRuleOrBuilder();

  /**
   * <pre>
   * Optional. Etag to validate that the object is unchanged for a
   * read-modify-write operation.
   * An empty etag will cause an update to overwrite other changes.
   * </pre>
   *
   * <code>string etag = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   * <pre>
   * Optional. Etag to validate that the object is unchanged for a
   * read-modify-write operation.
   * An empty etag will cause an update to overwrite other changes.
   * </pre>
   *
   * <code>string etag = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString
      getEtagBytes();
}