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
// source: google/cloud/documentai/v1beta3/document_processor_service.proto

package com.google.cloud.documentai.v1beta3;

/**
 *
 *
 * <pre>
 * Request message for the process document method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.ProcessRequest}
 */
public final class ProcessRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.ProcessRequest)
    ProcessRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ProcessRequest.newBuilder() to construct.
  private ProcessRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProcessRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProcessRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ProcessRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.documentai.v1beta3.Document.Builder subBuilder = null;
              if (document_ != null) {
                subBuilder = document_.toBuilder();
              }
              document_ =
                  input.readMessage(
                      com.google.cloud.documentai.v1beta3.Document.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(document_);
                document_ = subBuilder.buildPartial();
              }

              break;
            }
          case 24:
            {
              skipHumanReview_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1beta3_ProcessRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1beta3_ProcessRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.ProcessRequest.class,
            com.google.cloud.documentai.v1beta3.ProcessRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The processor resource name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. The processor resource name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int DOCUMENT_FIELD_NUMBER = 2;
  private com.google.cloud.documentai.v1beta3.Document document_;
  /**
   *
   *
   * <pre>
   * The document payload, the [content] and [mime_type] fields must be set.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
   *
   * @return Whether the document field is set.
   */
  @java.lang.Override
  public boolean hasDocument() {
    return document_ != null;
  }
  /**
   *
   *
   * <pre>
   * The document payload, the [content] and [mime_type] fields must be set.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
   *
   * @return The document.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.Document getDocument() {
    return document_ == null
        ? com.google.cloud.documentai.v1beta3.Document.getDefaultInstance()
        : document_;
  }
  /**
   *
   *
   * <pre>
   * The document payload, the [content] and [mime_type] fields must be set.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.DocumentOrBuilder getDocumentOrBuilder() {
    return getDocument();
  }

  public static final int SKIP_HUMAN_REVIEW_FIELD_NUMBER = 3;
  private boolean skipHumanReview_;
  /**
   *
   *
   * <pre>
   * Whether Human Review feature should be skipped for this request. Default to
   * false.
   * </pre>
   *
   * <code>bool skip_human_review = 3;</code>
   *
   * @return The skipHumanReview.
   */
  @java.lang.Override
  public boolean getSkipHumanReview() {
    return skipHumanReview_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (document_ != null) {
      output.writeMessage(2, getDocument());
    }
    if (skipHumanReview_ != false) {
      output.writeBool(3, skipHumanReview_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (document_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDocument());
    }
    if (skipHumanReview_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, skipHumanReview_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.ProcessRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.ProcessRequest other =
        (com.google.cloud.documentai.v1beta3.ProcessRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument().equals(other.getDocument())) return false;
    }
    if (getSkipHumanReview() != other.getSkipHumanReview()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    hash = (37 * hash) + SKIP_HUMAN_REVIEW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSkipHumanReview());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.documentai.v1beta3.ProcessRequest prototype) {
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
   * Request message for the process document method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.ProcessRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.ProcessRequest)
      com.google.cloud.documentai.v1beta3.ProcessRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1beta3_ProcessRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1beta3_ProcessRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.ProcessRequest.class,
              com.google.cloud.documentai.v1beta3.ProcessRequest.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.ProcessRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (documentBuilder_ == null) {
        document_ = null;
      } else {
        document_ = null;
        documentBuilder_ = null;
      }
      skipHumanReview_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1beta3_ProcessRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessRequest getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.ProcessRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessRequest build() {
      com.google.cloud.documentai.v1beta3.ProcessRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessRequest buildPartial() {
      com.google.cloud.documentai.v1beta3.ProcessRequest result =
          new com.google.cloud.documentai.v1beta3.ProcessRequest(this);
      result.name_ = name_;
      if (documentBuilder_ == null) {
        result.document_ = document_;
      } else {
        result.document_ = documentBuilder_.build();
      }
      result.skipHumanReview_ = skipHumanReview_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.documentai.v1beta3.ProcessRequest) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.ProcessRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.ProcessRequest other) {
      if (other == com.google.cloud.documentai.v1beta3.ProcessRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
      }
      if (other.getSkipHumanReview() != false) {
        setSkipHumanReview(other.getSkipHumanReview());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.documentai.v1beta3.ProcessRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.documentai.v1beta3.ProcessRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The processor resource name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The processor resource name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The processor resource name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The processor resource name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The processor resource name.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
      onChanged();
      return this;
    }

    private com.google.cloud.documentai.v1beta3.Document document_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.Document,
            com.google.cloud.documentai.v1beta3.Document.Builder,
            com.google.cloud.documentai.v1beta3.DocumentOrBuilder>
        documentBuilder_;
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     *
     * @return Whether the document field is set.
     */
    public boolean hasDocument() {
      return documentBuilder_ != null || document_ != null;
    }
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     *
     * @return The document.
     */
    public com.google.cloud.documentai.v1beta3.Document getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null
            ? com.google.cloud.documentai.v1beta3.Document.getDefaultInstance()
            : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     */
    public Builder setDocument(com.google.cloud.documentai.v1beta3.Document value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
        onChanged();
      } else {
        documentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     */
    public Builder setDocument(
        com.google.cloud.documentai.v1beta3.Document.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
        onChanged();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     */
    public Builder mergeDocument(com.google.cloud.documentai.v1beta3.Document value) {
      if (documentBuilder_ == null) {
        if (document_ != null) {
          document_ =
              com.google.cloud.documentai.v1beta3.Document.newBuilder(document_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          document_ = value;
        }
        onChanged();
      } else {
        documentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     */
    public Builder clearDocument() {
      if (documentBuilder_ == null) {
        document_ = null;
        onChanged();
      } else {
        document_ = null;
        documentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     */
    public com.google.cloud.documentai.v1beta3.Document.Builder getDocumentBuilder() {

      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     */
    public com.google.cloud.documentai.v1beta3.DocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null
            ? com.google.cloud.documentai.v1beta3.Document.getDefaultInstance()
            : document_;
      }
    }
    /**
     *
     *
     * <pre>
     * The document payload, the [content] and [mime_type] fields must be set.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.Document document = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.Document,
            com.google.cloud.documentai.v1beta3.Document.Builder,
            com.google.cloud.documentai.v1beta3.DocumentOrBuilder>
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1beta3.Document,
                com.google.cloud.documentai.v1beta3.Document.Builder,
                com.google.cloud.documentai.v1beta3.DocumentOrBuilder>(
                getDocument(), getParentForChildren(), isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    private boolean skipHumanReview_;
    /**
     *
     *
     * <pre>
     * Whether Human Review feature should be skipped for this request. Default to
     * false.
     * </pre>
     *
     * <code>bool skip_human_review = 3;</code>
     *
     * @return The skipHumanReview.
     */
    @java.lang.Override
    public boolean getSkipHumanReview() {
      return skipHumanReview_;
    }
    /**
     *
     *
     * <pre>
     * Whether Human Review feature should be skipped for this request. Default to
     * false.
     * </pre>
     *
     * <code>bool skip_human_review = 3;</code>
     *
     * @param value The skipHumanReview to set.
     * @return This builder for chaining.
     */
    public Builder setSkipHumanReview(boolean value) {

      skipHumanReview_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether Human Review feature should be skipped for this request. Default to
     * false.
     * </pre>
     *
     * <code>bool skip_human_review = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkipHumanReview() {

      skipHumanReview_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.ProcessRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.ProcessRequest)
  private static final com.google.cloud.documentai.v1beta3.ProcessRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.ProcessRequest();
  }

  public static com.google.cloud.documentai.v1beta3.ProcessRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessRequest> PARSER =
      new com.google.protobuf.AbstractParser<ProcessRequest>() {
        @java.lang.Override
        public ProcessRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ProcessRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ProcessRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.ProcessRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
