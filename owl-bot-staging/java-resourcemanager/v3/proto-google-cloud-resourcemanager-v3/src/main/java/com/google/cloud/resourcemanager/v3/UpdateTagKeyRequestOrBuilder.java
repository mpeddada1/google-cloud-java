// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/tag_keys.proto

package com.google.cloud.resourcemanager.v3;

public interface UpdateTagKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.UpdateTagKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The new definition of the TagKey. Only the `description` and `etag` fields
   * can be updated by this request. If the `etag` field is not empty, it
   * must match the `etag` field of the existing tag key. Otherwise,
   * `FAILED_PRECONDITION` will be returned.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tagKey field is set.
   */
  boolean hasTagKey();
  /**
   * <pre>
   * Required. The new definition of the TagKey. Only the `description` and `etag` fields
   * can be updated by this request. If the `etag` field is not empty, it
   * must match the `etag` field of the existing tag key. Otherwise,
   * `FAILED_PRECONDITION` will be returned.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagKey.
   */
  com.google.cloud.resourcemanager.v3.TagKey getTagKey();
  /**
   * <pre>
   * Required. The new definition of the TagKey. Only the `description` and `etag` fields
   * can be updated by this request. If the `etag` field is not empty, it
   * must match the `etag` field of the existing tag key. Otherwise,
   * `FAILED_PRECONDITION` will be returned.
   * </pre>
   *
   * <code>.google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.resourcemanager.v3.TagKeyOrBuilder getTagKeyOrBuilder();

  /**
   * <pre>
   * Fields to be updated. The mask may only contain `description` or
   * `etag`. If omitted entirely, both `description` and `etag` are assumed to
   * be significant.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Fields to be updated. The mask may only contain `description` or
   * `etag`. If omitted entirely, both `description` and `etag` are assumed to
   * be significant.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Fields to be updated. The mask may only contain `description` or
   * `etag`. If omitted entirely, both `description` and `etag` are assumed to
   * be significant.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Set as true to perform validations necessary for updating the resource, but
   * not actually perform the action.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}