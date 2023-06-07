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
// source: google/cloud/securitycenter/v1/exfiltration.proto

package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Resource that has been exfiltrated or exfiltrated_to.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.ExfilResource}
 */
public final class ExfilResource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.ExfilResource)
    ExfilResourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExfilResource.newBuilder() to construct.
  private ExfilResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExfilResource() {
    name_ = "";
    components_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExfilResource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.ExfiltrationProto
        .internal_static_google_cloud_securitycenter_v1_ExfilResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.ExfiltrationProto
        .internal_static_google_cloud_securitycenter_v1_ExfilResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.ExfilResource.class,
            com.google.cloud.securitycenter.v1.ExfilResource.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Resource's URI (https://google.aip.dev/122#full-resource-names)
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource's URI (https://google.aip.dev/122#full-resource-names)
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMPONENTS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList components_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Subcomponents of the asset that is exfiltrated - these could be
   * URIs used during exfiltration, table names, databases, filenames, etc.
   * For example, multiple tables may be exfiltrated from the same CloudSQL
   * instance, or multiple files from the same Cloud Storage bucket.
   * </pre>
   *
   * <code>repeated string components = 2;</code>
   *
   * @return A list containing the components.
   */
  public com.google.protobuf.ProtocolStringList getComponentsList() {
    return components_;
  }
  /**
   *
   *
   * <pre>
   * Subcomponents of the asset that is exfiltrated - these could be
   * URIs used during exfiltration, table names, databases, filenames, etc.
   * For example, multiple tables may be exfiltrated from the same CloudSQL
   * instance, or multiple files from the same Cloud Storage bucket.
   * </pre>
   *
   * <code>repeated string components = 2;</code>
   *
   * @return The count of components.
   */
  public int getComponentsCount() {
    return components_.size();
  }
  /**
   *
   *
   * <pre>
   * Subcomponents of the asset that is exfiltrated - these could be
   * URIs used during exfiltration, table names, databases, filenames, etc.
   * For example, multiple tables may be exfiltrated from the same CloudSQL
   * instance, or multiple files from the same Cloud Storage bucket.
   * </pre>
   *
   * <code>repeated string components = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The components at the given index.
   */
  public java.lang.String getComponents(int index) {
    return components_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Subcomponents of the asset that is exfiltrated - these could be
   * URIs used during exfiltration, table names, databases, filenames, etc.
   * For example, multiple tables may be exfiltrated from the same CloudSQL
   * instance, or multiple files from the same Cloud Storage bucket.
   * </pre>
   *
   * <code>repeated string components = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the components at the given index.
   */
  public com.google.protobuf.ByteString getComponentsBytes(int index) {
    return components_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < components_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, components_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < components_.size(); i++) {
        dataSize += computeStringSizeNoTag(components_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getComponentsList().size();
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.ExfilResource)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.ExfilResource other =
        (com.google.cloud.securitycenter.v1.ExfilResource) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getComponentsList().equals(other.getComponentsList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getComponentsCount() > 0) {
      hash = (37 * hash) + COMPONENTS_FIELD_NUMBER;
      hash = (53 * hash) + getComponentsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v1.ExfilResource prototype) {
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
   * Resource that has been exfiltrated or exfiltrated_to.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.ExfilResource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.ExfilResource)
      com.google.cloud.securitycenter.v1.ExfilResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.ExfiltrationProto
          .internal_static_google_cloud_securitycenter_v1_ExfilResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.ExfiltrationProto
          .internal_static_google_cloud_securitycenter_v1_ExfilResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.ExfilResource.class,
              com.google.cloud.securitycenter.v1.ExfilResource.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.ExfilResource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      components_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.ExfiltrationProto
          .internal_static_google_cloud_securitycenter_v1_ExfilResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ExfilResource getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.ExfilResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ExfilResource build() {
      com.google.cloud.securitycenter.v1.ExfilResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.ExfilResource buildPartial() {
      com.google.cloud.securitycenter.v1.ExfilResource result =
          new com.google.cloud.securitycenter.v1.ExfilResource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.ExfilResource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        components_.makeImmutable();
        result.components_ = components_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.ExfilResource) {
        return mergeFrom((com.google.cloud.securitycenter.v1.ExfilResource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.ExfilResource other) {
      if (other == com.google.cloud.securitycenter.v1.ExfilResource.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.components_.isEmpty()) {
        if (components_.isEmpty()) {
          components_ = other.components_;
          bitField0_ |= 0x00000002;
        } else {
          ensureComponentsIsMutable();
          components_.addAll(other.components_);
        }
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureComponentsIsMutable();
                components_.add(s);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Resource's URI (https://google.aip.dev/122#full-resource-names)
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource's URI (https://google.aip.dev/122#full-resource-names)
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource's URI (https://google.aip.dev/122#full-resource-names)
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource's URI (https://google.aip.dev/122#full-resource-names)
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource's URI (https://google.aip.dev/122#full-resource-names)
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList components_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureComponentsIsMutable() {
      if (!components_.isModifiable()) {
        components_ = new com.google.protobuf.LazyStringArrayList(components_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @return A list containing the components.
     */
    public com.google.protobuf.ProtocolStringList getComponentsList() {
      components_.makeImmutable();
      return components_;
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @return The count of components.
     */
    public int getComponentsCount() {
      return components_.size();
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The components at the given index.
     */
    public java.lang.String getComponents(int index) {
      return components_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the components at the given index.
     */
    public com.google.protobuf.ByteString getComponentsBytes(int index) {
      return components_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The components to set.
     * @return This builder for chaining.
     */
    public Builder setComponents(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureComponentsIsMutable();
      components_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @param value The components to add.
     * @return This builder for chaining.
     */
    public Builder addComponents(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureComponentsIsMutable();
      components_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @param values The components to add.
     * @return This builder for chaining.
     */
    public Builder addAllComponents(java.lang.Iterable<java.lang.String> values) {
      ensureComponentsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, components_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearComponents() {
      components_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Subcomponents of the asset that is exfiltrated - these could be
     * URIs used during exfiltration, table names, databases, filenames, etc.
     * For example, multiple tables may be exfiltrated from the same CloudSQL
     * instance, or multiple files from the same Cloud Storage bucket.
     * </pre>
     *
     * <code>repeated string components = 2;</code>
     *
     * @param value The bytes of the components to add.
     * @return This builder for chaining.
     */
    public Builder addComponentsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureComponentsIsMutable();
      components_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.ExfilResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.ExfilResource)
  private static final com.google.cloud.securitycenter.v1.ExfilResource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.ExfilResource();
  }

  public static com.google.cloud.securitycenter.v1.ExfilResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExfilResource> PARSER =
      new com.google.protobuf.AbstractParser<ExfilResource>() {
        @java.lang.Override
        public ExfilResource parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExfilResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExfilResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.ExfilResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
