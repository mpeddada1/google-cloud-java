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
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

/**
 *
 *
 * <pre>
 * Instance AUTH string details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1.InstanceAuthString}
 */
public final class InstanceAuthString extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1.InstanceAuthString)
    InstanceAuthStringOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstanceAuthString.newBuilder() to construct.
  private InstanceAuthString(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceAuthString() {
    authString_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceAuthString();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
        .internal_static_google_cloud_redis_v1_InstanceAuthString_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
        .internal_static_google_cloud_redis_v1_InstanceAuthString_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1.InstanceAuthString.class,
            com.google.cloud.redis.v1.InstanceAuthString.Builder.class);
  }

  public static final int AUTH_STRING_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object authString_ = "";
  /**
   *
   *
   * <pre>
   * AUTH string set on the instance.
   * </pre>
   *
   * <code>string auth_string = 1;</code>
   *
   * @return The authString.
   */
  @java.lang.Override
  public java.lang.String getAuthString() {
    java.lang.Object ref = authString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authString_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * AUTH string set on the instance.
   * </pre>
   *
   * <code>string auth_string = 1;</code>
   *
   * @return The bytes for authString.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAuthStringBytes() {
    java.lang.Object ref = authString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      authString_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authString_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, authString_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authString_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, authString_);
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
    if (!(obj instanceof com.google.cloud.redis.v1.InstanceAuthString)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1.InstanceAuthString other =
        (com.google.cloud.redis.v1.InstanceAuthString) obj;

    if (!getAuthString().equals(other.getAuthString())) return false;
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
    hash = (37 * hash) + AUTH_STRING_FIELD_NUMBER;
    hash = (53 * hash) + getAuthString().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1.InstanceAuthString parseFrom(
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

  public static Builder newBuilder(com.google.cloud.redis.v1.InstanceAuthString prototype) {
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
   * Instance AUTH string details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1.InstanceAuthString}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1.InstanceAuthString)
      com.google.cloud.redis.v1.InstanceAuthStringOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_InstanceAuthString_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_InstanceAuthString_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1.InstanceAuthString.class,
              com.google.cloud.redis.v1.InstanceAuthString.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1.InstanceAuthString.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      authString_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.v1.CloudRedisServiceV1Proto
          .internal_static_google_cloud_redis_v1_InstanceAuthString_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.InstanceAuthString getDefaultInstanceForType() {
      return com.google.cloud.redis.v1.InstanceAuthString.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.InstanceAuthString build() {
      com.google.cloud.redis.v1.InstanceAuthString result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1.InstanceAuthString buildPartial() {
      com.google.cloud.redis.v1.InstanceAuthString result =
          new com.google.cloud.redis.v1.InstanceAuthString(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.redis.v1.InstanceAuthString result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authString_ = authString_;
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
      if (other instanceof com.google.cloud.redis.v1.InstanceAuthString) {
        return mergeFrom((com.google.cloud.redis.v1.InstanceAuthString) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1.InstanceAuthString other) {
      if (other == com.google.cloud.redis.v1.InstanceAuthString.getDefaultInstance()) return this;
      if (!other.getAuthString().isEmpty()) {
        authString_ = other.authString_;
        bitField0_ |= 0x00000001;
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
                authString_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object authString_ = "";
    /**
     *
     *
     * <pre>
     * AUTH string set on the instance.
     * </pre>
     *
     * <code>string auth_string = 1;</code>
     *
     * @return The authString.
     */
    public java.lang.String getAuthString() {
      java.lang.Object ref = authString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * AUTH string set on the instance.
     * </pre>
     *
     * <code>string auth_string = 1;</code>
     *
     * @return The bytes for authString.
     */
    public com.google.protobuf.ByteString getAuthStringBytes() {
      java.lang.Object ref = authString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        authString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * AUTH string set on the instance.
     * </pre>
     *
     * <code>string auth_string = 1;</code>
     *
     * @param value The authString to set.
     * @return This builder for chaining.
     */
    public Builder setAuthString(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      authString_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * AUTH string set on the instance.
     * </pre>
     *
     * <code>string auth_string = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAuthString() {
      authString_ = getDefaultInstance().getAuthString();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * AUTH string set on the instance.
     * </pre>
     *
     * <code>string auth_string = 1;</code>
     *
     * @param value The bytes for authString to set.
     * @return This builder for chaining.
     */
    public Builder setAuthStringBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      authString_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1.InstanceAuthString)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1.InstanceAuthString)
  private static final com.google.cloud.redis.v1.InstanceAuthString DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1.InstanceAuthString();
  }

  public static com.google.cloud.redis.v1.InstanceAuthString getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstanceAuthString> PARSER =
      new com.google.protobuf.AbstractParser<InstanceAuthString>() {
        @java.lang.Override
        public InstanceAuthString parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstanceAuthString> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceAuthString> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1.InstanceAuthString getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
