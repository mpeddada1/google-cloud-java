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
// source: google/cloud/resourcesettings/v1/resource_settings.proto

package com.google.cloud.resourcesettings.v1;

/**
 *
 *
 * <pre>
 * The response from ListSettings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcesettings.v1.ListSettingsResponse}
 */
public final class ListSettingsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcesettings.v1.ListSettingsResponse)
    ListSettingsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSettingsResponse.newBuilder() to construct.
  private ListSettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSettingsResponse() {
    settings_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSettingsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
        .internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
        .internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcesettings.v1.ListSettingsResponse.class,
            com.google.cloud.resourcesettings.v1.ListSettingsResponse.Builder.class);
  }

  public static final int SETTINGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.resourcesettings.v1.Setting> settings_;
  /**
   *
   *
   * <pre>
   * A list of settings that are available at the specified Cloud resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.resourcesettings.v1.Setting> getSettingsList() {
    return settings_;
  }
  /**
   *
   *
   * <pre>
   * A list of settings that are available at the specified Cloud resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.resourcesettings.v1.SettingOrBuilder>
      getSettingsOrBuilderList() {
    return settings_;
  }
  /**
   *
   *
   * <pre>
   * A list of settings that are available at the specified Cloud resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
   */
  @java.lang.Override
  public int getSettingsCount() {
    return settings_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of settings that are available at the specified Cloud resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcesettings.v1.Setting getSettings(int index) {
    return settings_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of settings that are available at the specified Cloud resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.resourcesettings.v1.SettingOrBuilder getSettingsOrBuilder(int index) {
    return settings_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Unused. A page token used to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Unused. A page token used to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < settings_.size(); i++) {
      output.writeMessage(1, settings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < settings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, settings_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.resourcesettings.v1.ListSettingsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcesettings.v1.ListSettingsResponse other =
        (com.google.cloud.resourcesettings.v1.ListSettingsResponse) obj;

    if (!getSettingsList().equals(other.getSettingsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getSettingsCount() > 0) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettingsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse parseFrom(
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
      com.google.cloud.resourcesettings.v1.ListSettingsResponse prototype) {
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
   * The response from ListSettings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcesettings.v1.ListSettingsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcesettings.v1.ListSettingsResponse)
      com.google.cloud.resourcesettings.v1.ListSettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
          .internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
          .internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcesettings.v1.ListSettingsResponse.class,
              com.google.cloud.resourcesettings.v1.ListSettingsResponse.Builder.class);
    }

    // Construct using com.google.cloud.resourcesettings.v1.ListSettingsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (settingsBuilder_ == null) {
        settings_ = java.util.Collections.emptyList();
      } else {
        settings_ = null;
        settingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
          .internal_static_google_cloud_resourcesettings_v1_ListSettingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcesettings.v1.ListSettingsResponse getDefaultInstanceForType() {
      return com.google.cloud.resourcesettings.v1.ListSettingsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcesettings.v1.ListSettingsResponse build() {
      com.google.cloud.resourcesettings.v1.ListSettingsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcesettings.v1.ListSettingsResponse buildPartial() {
      com.google.cloud.resourcesettings.v1.ListSettingsResponse result =
          new com.google.cloud.resourcesettings.v1.ListSettingsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.resourcesettings.v1.ListSettingsResponse result) {
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          settings_ = java.util.Collections.unmodifiableList(settings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.resourcesettings.v1.ListSettingsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.resourcesettings.v1.ListSettingsResponse) {
        return mergeFrom((com.google.cloud.resourcesettings.v1.ListSettingsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcesettings.v1.ListSettingsResponse other) {
      if (other == com.google.cloud.resourcesettings.v1.ListSettingsResponse.getDefaultInstance())
        return this;
      if (settingsBuilder_ == null) {
        if (!other.settings_.isEmpty()) {
          if (settings_.isEmpty()) {
            settings_ = other.settings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSettingsIsMutable();
            settings_.addAll(other.settings_);
          }
          onChanged();
        }
      } else {
        if (!other.settings_.isEmpty()) {
          if (settingsBuilder_.isEmpty()) {
            settingsBuilder_.dispose();
            settingsBuilder_ = null;
            settings_ = other.settings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            settingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSettingsFieldBuilder()
                    : null;
          } else {
            settingsBuilder_.addAllMessages(other.settings_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                com.google.cloud.resourcesettings.v1.Setting m =
                    input.readMessage(
                        com.google.cloud.resourcesettings.v1.Setting.parser(), extensionRegistry);
                if (settingsBuilder_ == null) {
                  ensureSettingsIsMutable();
                  settings_.add(m);
                } else {
                  settingsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.resourcesettings.v1.Setting> settings_ =
        java.util.Collections.emptyList();

    private void ensureSettingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        settings_ =
            new java.util.ArrayList<com.google.cloud.resourcesettings.v1.Setting>(settings_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.resourcesettings.v1.Setting,
            com.google.cloud.resourcesettings.v1.Setting.Builder,
            com.google.cloud.resourcesettings.v1.SettingOrBuilder>
        settingsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcesettings.v1.Setting> getSettingsList() {
      if (settingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(settings_);
      } else {
        return settingsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public int getSettingsCount() {
      if (settingsBuilder_ == null) {
        return settings_.size();
      } else {
        return settingsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public com.google.cloud.resourcesettings.v1.Setting getSettings(int index) {
      if (settingsBuilder_ == null) {
        return settings_.get(index);
      } else {
        return settingsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder setSettings(int index, com.google.cloud.resourcesettings.v1.Setting value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.set(index, value);
        onChanged();
      } else {
        settingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder setSettings(
        int index, com.google.cloud.resourcesettings.v1.Setting.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.set(index, builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder addSettings(com.google.cloud.resourcesettings.v1.Setting value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.add(value);
        onChanged();
      } else {
        settingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder addSettings(int index, com.google.cloud.resourcesettings.v1.Setting value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.add(index, value);
        onChanged();
      } else {
        settingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder addSettings(
        com.google.cloud.resourcesettings.v1.Setting.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.add(builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder addSettings(
        int index, com.google.cloud.resourcesettings.v1.Setting.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.add(index, builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder addAllSettings(
        java.lang.Iterable<? extends com.google.cloud.resourcesettings.v1.Setting> values) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, settings_);
        onChanged();
      } else {
        settingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        settingsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public Builder removeSettings(int index) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.remove(index);
        onChanged();
      } else {
        settingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public com.google.cloud.resourcesettings.v1.Setting.Builder getSettingsBuilder(int index) {
      return getSettingsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public com.google.cloud.resourcesettings.v1.SettingOrBuilder getSettingsOrBuilder(int index) {
      if (settingsBuilder_ == null) {
        return settings_.get(index);
      } else {
        return settingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.resourcesettings.v1.SettingOrBuilder>
        getSettingsOrBuilderList() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(settings_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public com.google.cloud.resourcesettings.v1.Setting.Builder addSettingsBuilder() {
      return getSettingsFieldBuilder()
          .addBuilder(com.google.cloud.resourcesettings.v1.Setting.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public com.google.cloud.resourcesettings.v1.Setting.Builder addSettingsBuilder(int index) {
      return getSettingsFieldBuilder()
          .addBuilder(index, com.google.cloud.resourcesettings.v1.Setting.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of settings that are available at the specified Cloud resource.
     * </pre>
     *
     * <code>repeated .google.cloud.resourcesettings.v1.Setting settings = 1;</code>
     */
    public java.util.List<com.google.cloud.resourcesettings.v1.Setting.Builder>
        getSettingsBuilderList() {
      return getSettingsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.resourcesettings.v1.Setting,
            com.google.cloud.resourcesettings.v1.Setting.Builder,
            com.google.cloud.resourcesettings.v1.SettingOrBuilder>
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.resourcesettings.v1.Setting,
                com.google.cloud.resourcesettings.v1.Setting.Builder,
                com.google.cloud.resourcesettings.v1.SettingOrBuilder>(
                settings_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Unused. A page token used to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Unused. A page token used to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Unused. A page token used to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Unused. A page token used to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Unused. A page token used to retrieve the next page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcesettings.v1.ListSettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcesettings.v1.ListSettingsResponse)
  private static final com.google.cloud.resourcesettings.v1.ListSettingsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcesettings.v1.ListSettingsResponse();
  }

  public static com.google.cloud.resourcesettings.v1.ListSettingsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSettingsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSettingsResponse>() {
        @java.lang.Override
        public ListSettingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcesettings.v1.ListSettingsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
