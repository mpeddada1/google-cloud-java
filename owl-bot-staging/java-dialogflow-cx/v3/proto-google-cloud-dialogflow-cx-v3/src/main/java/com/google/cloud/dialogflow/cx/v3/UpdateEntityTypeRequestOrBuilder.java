// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/entity_type.proto

package com.google.cloud.dialogflow.cx.v3;

public interface UpdateEntityTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.UpdateEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the entityType field is set.
   */
  boolean hasEntityType();
  /**
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entityType.
   */
  com.google.cloud.dialogflow.cx.v3.EntityType getEntityType();
  /**
   * <pre>
   * Required. The entity type to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.EntityType entity_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dialogflow.cx.v3.EntityTypeOrBuilder getEntityTypeOrBuilder();

  /**
   * <pre>
   * The language of the following fields in `entity_type`:
   * *   `EntityType.entities.value`
   * *   `EntityType.entities.synonyms`
   * *   `EntityType.excluded_phrases.value`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The language of the following fields in `entity_type`:
   * *   `EntityType.entities.value`
   * *   `EntityType.entities.synonyms`
   * *   `EntityType.excluded_phrases.value`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/cx/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}