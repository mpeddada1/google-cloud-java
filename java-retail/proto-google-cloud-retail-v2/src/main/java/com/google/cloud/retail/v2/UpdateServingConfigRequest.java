/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/serving_config_service.proto

package com.google.cloud.retail.v2;

/**
 *
 *
 * <pre>
 * Request for UpdateServingConfig method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.UpdateServingConfigRequest}
 */
public final class UpdateServingConfigRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.UpdateServingConfigRequest)
    UpdateServingConfigRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateServingConfigRequest.newBuilder() to construct.
  private UpdateServingConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateServingConfigRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateServingConfigRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2.ServingConfigServiceProto
        .internal_static_google_cloud_retail_v2_UpdateServingConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.ServingConfigServiceProto
        .internal_static_google_cloud_retail_v2_UpdateServingConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.UpdateServingConfigRequest.class,
            com.google.cloud.retail.v2.UpdateServingConfigRequest.Builder.class);
  }

  public static final int SERVING_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.retail.v2.ServingConfig servingConfig_;
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the servingConfig field is set.
   */
  @java.lang.Override
  public boolean hasServingConfig() {
    return servingConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The servingConfig.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ServingConfig getServingConfig() {
    return servingConfig_ == null
        ? com.google.cloud.retail.v2.ServingConfig.getDefaultInstance()
        : servingConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The ServingConfig to update.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2.ServingConfigOrBuilder getServingConfigOrBuilder() {
    return servingConfig_ == null
        ? com.google.cloud.retail.v2.ServingConfig.getDefaultInstance()
        : servingConfig_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
   * following are NOT supported:
   *
   * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (servingConfig_ != null) {
      output.writeMessage(1, getServingConfig());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (servingConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getServingConfig());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.retail.v2.UpdateServingConfigRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.UpdateServingConfigRequest other =
        (com.google.cloud.retail.v2.UpdateServingConfigRequest) obj;

    if (hasServingConfig() != other.hasServingConfig()) return false;
    if (hasServingConfig()) {
      if (!getServingConfig().equals(other.getServingConfig())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasServingConfig()) {
      hash = (37 * hash) + SERVING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getServingConfig().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.retail.v2.UpdateServingConfigRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for UpdateServingConfig method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.UpdateServingConfigRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.UpdateServingConfigRequest)
      com.google.cloud.retail.v2.UpdateServingConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2_UpdateServingConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2_UpdateServingConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.UpdateServingConfigRequest.class,
              com.google.cloud.retail.v2.UpdateServingConfigRequest.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.UpdateServingConfigRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      servingConfig_ = null;
      if (servingConfigBuilder_ != null) {
        servingConfigBuilder_.dispose();
        servingConfigBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2_UpdateServingConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.UpdateServingConfigRequest getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.UpdateServingConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.UpdateServingConfigRequest build() {
      com.google.cloud.retail.v2.UpdateServingConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.UpdateServingConfigRequest buildPartial() {
      com.google.cloud.retail.v2.UpdateServingConfigRequest result =
          new com.google.cloud.retail.v2.UpdateServingConfigRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.retail.v2.UpdateServingConfigRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.servingConfig_ =
            servingConfigBuilder_ == null ? servingConfig_ : servingConfigBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.retail.v2.UpdateServingConfigRequest) {
        return mergeFrom((com.google.cloud.retail.v2.UpdateServingConfigRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.UpdateServingConfigRequest other) {
      if (other == com.google.cloud.retail.v2.UpdateServingConfigRequest.getDefaultInstance())
        return this;
      if (other.hasServingConfig()) {
        mergeServingConfig(other.getServingConfig());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getServingConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.cloud.retail.v2.ServingConfig servingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2.ServingConfig,
            com.google.cloud.retail.v2.ServingConfig.Builder,
            com.google.cloud.retail.v2.ServingConfigOrBuilder>
        servingConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the servingConfig field is set.
     */
    public boolean hasServingConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The servingConfig.
     */
    public com.google.cloud.retail.v2.ServingConfig getServingConfig() {
      if (servingConfigBuilder_ == null) {
        return servingConfig_ == null
            ? com.google.cloud.retail.v2.ServingConfig.getDefaultInstance()
            : servingConfig_;
      } else {
        return servingConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setServingConfig(com.google.cloud.retail.v2.ServingConfig value) {
      if (servingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        servingConfig_ = value;
      } else {
        servingConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setServingConfig(
        com.google.cloud.retail.v2.ServingConfig.Builder builderForValue) {
      if (servingConfigBuilder_ == null) {
        servingConfig_ = builderForValue.build();
      } else {
        servingConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeServingConfig(com.google.cloud.retail.v2.ServingConfig value) {
      if (servingConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && servingConfig_ != null
            && servingConfig_ != com.google.cloud.retail.v2.ServingConfig.getDefaultInstance()) {
          getServingConfigBuilder().mergeFrom(value);
        } else {
          servingConfig_ = value;
        }
      } else {
        servingConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearServingConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      servingConfig_ = null;
      if (servingConfigBuilder_ != null) {
        servingConfigBuilder_.dispose();
        servingConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2.ServingConfig.Builder getServingConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getServingConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2.ServingConfigOrBuilder getServingConfigOrBuilder() {
      if (servingConfigBuilder_ != null) {
        return servingConfigBuilder_.getMessageOrBuilder();
      } else {
        return servingConfig_ == null
            ? com.google.cloud.retail.v2.ServingConfig.getDefaultInstance()
            : servingConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ServingConfig to update.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2.ServingConfig serving_config = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2.ServingConfig,
            com.google.cloud.retail.v2.ServingConfig.Builder,
            com.google.cloud.retail.v2.ServingConfigOrBuilder>
        getServingConfigFieldBuilder() {
      if (servingConfigBuilder_ == null) {
        servingConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.retail.v2.ServingConfig,
                com.google.cloud.retail.v2.ServingConfig.Builder,
                com.google.cloud.retail.v2.ServingConfigOrBuilder>(
                getServingConfig(), getParentForChildren(), isClean());
        servingConfig_ = null;
      }
      return servingConfigBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Indicates which fields in the provided
     * [ServingConfig][google.cloud.retail.v2.ServingConfig] to update. The
     * following are NOT supported:
     *
     * * [ServingConfig.name][google.cloud.retail.v2.ServingConfig.name]
     *
     * If not set, all supported fields are updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.UpdateServingConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.UpdateServingConfigRequest)
  private static final com.google.cloud.retail.v2.UpdateServingConfigRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.UpdateServingConfigRequest();
  }

  public static com.google.cloud.retail.v2.UpdateServingConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateServingConfigRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateServingConfigRequest>() {
        @java.lang.Override
        public UpdateServingConfigRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateServingConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateServingConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.UpdateServingConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
