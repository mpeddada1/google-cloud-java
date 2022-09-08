// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface UpdateGoogleAdsLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.UpdateGoogleAdsLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The GoogleAdsLink to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 1;</code>
   * @return Whether the googleAdsLink field is set.
   */
  boolean hasGoogleAdsLink();
  /**
   * <pre>
   * The GoogleAdsLink to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 1;</code>
   * @return The googleAdsLink.
   */
  com.google.analytics.admin.v1alpha.GoogleAdsLink getGoogleAdsLink();
  /**
   * <pre>
   * The GoogleAdsLink to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.GoogleAdsLink google_ads_link = 1;</code>
   */
  com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder getGoogleAdsLinkOrBuilder();

  /**
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake case
   * (e.g., "field_to_update"). Omitted fields will not be updated. To replace
   * the entire entity, use one path with the string "*" to match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake case
   * (e.g., "field_to_update"). Omitted fields will not be updated. To replace
   * the entire entity, use one path with the string "*" to match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake case
   * (e.g., "field_to_update"). Omitted fields will not be updated. To replace
   * the entire entity, use one path with the string "*" to match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}