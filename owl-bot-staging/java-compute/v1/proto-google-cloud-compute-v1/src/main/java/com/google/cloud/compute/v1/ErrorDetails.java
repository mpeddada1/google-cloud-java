// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ErrorDetails}
 */
public final class ErrorDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ErrorDetails)
    ErrorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorDetails.newBuilder() to construct.
  private ErrorDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorDetails() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ErrorDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ErrorDetails(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 25590282: {
            com.google.cloud.compute.v1.Help.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) != 0)) {
              subBuilder = help_.toBuilder();
            }
            help_ = input.readMessage(com.google.cloud.compute.v1.Help.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(help_);
              help_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 202015786: {
            com.google.cloud.compute.v1.ErrorInfo.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) != 0)) {
              subBuilder = errorInfo_.toBuilder();
            }
            errorInfo_ = input.readMessage(com.google.cloud.compute.v1.ErrorInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(errorInfo_);
              errorInfo_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case -1058670054: {
            com.google.cloud.compute.v1.LocalizedMessage.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) != 0)) {
              subBuilder = localizedMessage_.toBuilder();
            }
            localizedMessage_ = input.readMessage(com.google.cloud.compute.v1.LocalizedMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(localizedMessage_);
              localizedMessage_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ErrorDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ErrorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ErrorDetails.class, com.google.cloud.compute.v1.ErrorDetails.Builder.class);
  }

  private int bitField0_;
  public static final int ERROR_INFO_FIELD_NUMBER = 25251973;
  private com.google.cloud.compute.v1.ErrorInfo errorInfo_;
  /**
   * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
   * @return Whether the errorInfo field is set.
   */
  @java.lang.Override
  public boolean hasErrorInfo() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
   * @return The errorInfo.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ErrorInfo getErrorInfo() {
    return errorInfo_ == null ? com.google.cloud.compute.v1.ErrorInfo.getDefaultInstance() : errorInfo_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ErrorInfoOrBuilder getErrorInfoOrBuilder() {
    return errorInfo_ == null ? com.google.cloud.compute.v1.ErrorInfo.getDefaultInstance() : errorInfo_;
  }

  public static final int HELP_FIELD_NUMBER = 3198785;
  private com.google.cloud.compute.v1.Help help_;
  /**
   * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
   * @return Whether the help field is set.
   */
  @java.lang.Override
  public boolean hasHelp() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
   * @return The help.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Help getHelp() {
    return help_ == null ? com.google.cloud.compute.v1.Help.getDefaultInstance() : help_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.HelpOrBuilder getHelpOrBuilder() {
    return help_ == null ? com.google.cloud.compute.v1.Help.getDefaultInstance() : help_;
  }

  public static final int LOCALIZED_MESSAGE_FIELD_NUMBER = 404537155;
  private com.google.cloud.compute.v1.LocalizedMessage localizedMessage_;
  /**
   * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
   * @return Whether the localizedMessage field is set.
   */
  @java.lang.Override
  public boolean hasLocalizedMessage() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
   * @return The localizedMessage.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LocalizedMessage getLocalizedMessage() {
    return localizedMessage_ == null ? com.google.cloud.compute.v1.LocalizedMessage.getDefaultInstance() : localizedMessage_;
  }
  /**
   * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LocalizedMessageOrBuilder getLocalizedMessageOrBuilder() {
    return localizedMessage_ == null ? com.google.cloud.compute.v1.LocalizedMessage.getDefaultInstance() : localizedMessage_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3198785, getHelp());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(25251973, getErrorInfo());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(404537155, getLocalizedMessage());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3198785, getHelp());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(25251973, getErrorInfo());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(404537155, getLocalizedMessage());
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
    if (!(obj instanceof com.google.cloud.compute.v1.ErrorDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ErrorDetails other = (com.google.cloud.compute.v1.ErrorDetails) obj;

    if (hasErrorInfo() != other.hasErrorInfo()) return false;
    if (hasErrorInfo()) {
      if (!getErrorInfo()
          .equals(other.getErrorInfo())) return false;
    }
    if (hasHelp() != other.hasHelp()) return false;
    if (hasHelp()) {
      if (!getHelp()
          .equals(other.getHelp())) return false;
    }
    if (hasLocalizedMessage() != other.hasLocalizedMessage()) return false;
    if (hasLocalizedMessage()) {
      if (!getLocalizedMessage()
          .equals(other.getLocalizedMessage())) return false;
    }
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
    if (hasErrorInfo()) {
      hash = (37 * hash) + ERROR_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getErrorInfo().hashCode();
    }
    if (hasHelp()) {
      hash = (37 * hash) + HELP_FIELD_NUMBER;
      hash = (53 * hash) + getHelp().hashCode();
    }
    if (hasLocalizedMessage()) {
      hash = (37 * hash) + LOCALIZED_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getLocalizedMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.compute.v1.ErrorDetails prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ErrorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ErrorDetails)
      com.google.cloud.compute.v1.ErrorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ErrorDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ErrorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ErrorDetails.class, com.google.cloud.compute.v1.ErrorDetails.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ErrorDetails.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getErrorInfoFieldBuilder();
        getHelpFieldBuilder();
        getLocalizedMessageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (errorInfoBuilder_ == null) {
        errorInfo_ = null;
      } else {
        errorInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (helpBuilder_ == null) {
        help_ = null;
      } else {
        helpBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      if (localizedMessageBuilder_ == null) {
        localizedMessage_ = null;
      } else {
        localizedMessageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ErrorDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ErrorDetails getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ErrorDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ErrorDetails build() {
      com.google.cloud.compute.v1.ErrorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ErrorDetails buildPartial() {
      com.google.cloud.compute.v1.ErrorDetails result = new com.google.cloud.compute.v1.ErrorDetails(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        if (errorInfoBuilder_ == null) {
          result.errorInfo_ = errorInfo_;
        } else {
          result.errorInfo_ = errorInfoBuilder_.build();
        }
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        if (helpBuilder_ == null) {
          result.help_ = help_;
        } else {
          result.help_ = helpBuilder_.build();
        }
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (localizedMessageBuilder_ == null) {
          result.localizedMessage_ = localizedMessage_;
        } else {
          result.localizedMessage_ = localizedMessageBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.compute.v1.ErrorDetails) {
        return mergeFrom((com.google.cloud.compute.v1.ErrorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ErrorDetails other) {
      if (other == com.google.cloud.compute.v1.ErrorDetails.getDefaultInstance()) return this;
      if (other.hasErrorInfo()) {
        mergeErrorInfo(other.getErrorInfo());
      }
      if (other.hasHelp()) {
        mergeHelp(other.getHelp());
      }
      if (other.hasLocalizedMessage()) {
        mergeLocalizedMessage(other.getLocalizedMessage());
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
      com.google.cloud.compute.v1.ErrorDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.ErrorDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.cloud.compute.v1.ErrorInfo errorInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ErrorInfo, com.google.cloud.compute.v1.ErrorInfo.Builder, com.google.cloud.compute.v1.ErrorInfoOrBuilder> errorInfoBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     * @return Whether the errorInfo field is set.
     */
    public boolean hasErrorInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     * @return The errorInfo.
     */
    public com.google.cloud.compute.v1.ErrorInfo getErrorInfo() {
      if (errorInfoBuilder_ == null) {
        return errorInfo_ == null ? com.google.cloud.compute.v1.ErrorInfo.getDefaultInstance() : errorInfo_;
      } else {
        return errorInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     */
    public Builder setErrorInfo(com.google.cloud.compute.v1.ErrorInfo value) {
      if (errorInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errorInfo_ = value;
        onChanged();
      } else {
        errorInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     */
    public Builder setErrorInfo(
        com.google.cloud.compute.v1.ErrorInfo.Builder builderForValue) {
      if (errorInfoBuilder_ == null) {
        errorInfo_ = builderForValue.build();
        onChanged();
      } else {
        errorInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     */
    public Builder mergeErrorInfo(com.google.cloud.compute.v1.ErrorInfo value) {
      if (errorInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
            errorInfo_ != null &&
            errorInfo_ != com.google.cloud.compute.v1.ErrorInfo.getDefaultInstance()) {
          errorInfo_ =
            com.google.cloud.compute.v1.ErrorInfo.newBuilder(errorInfo_).mergeFrom(value).buildPartial();
        } else {
          errorInfo_ = value;
        }
        onChanged();
      } else {
        errorInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     */
    public Builder clearErrorInfo() {
      if (errorInfoBuilder_ == null) {
        errorInfo_ = null;
        onChanged();
      } else {
        errorInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     */
    public com.google.cloud.compute.v1.ErrorInfo.Builder getErrorInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getErrorInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     */
    public com.google.cloud.compute.v1.ErrorInfoOrBuilder getErrorInfoOrBuilder() {
      if (errorInfoBuilder_ != null) {
        return errorInfoBuilder_.getMessageOrBuilder();
      } else {
        return errorInfo_ == null ?
            com.google.cloud.compute.v1.ErrorInfo.getDefaultInstance() : errorInfo_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.ErrorInfo error_info = 25251973;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.ErrorInfo, com.google.cloud.compute.v1.ErrorInfo.Builder, com.google.cloud.compute.v1.ErrorInfoOrBuilder> 
        getErrorInfoFieldBuilder() {
      if (errorInfoBuilder_ == null) {
        errorInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.ErrorInfo, com.google.cloud.compute.v1.ErrorInfo.Builder, com.google.cloud.compute.v1.ErrorInfoOrBuilder>(
                getErrorInfo(),
                getParentForChildren(),
                isClean());
        errorInfo_ = null;
      }
      return errorInfoBuilder_;
    }

    private com.google.cloud.compute.v1.Help help_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Help, com.google.cloud.compute.v1.Help.Builder, com.google.cloud.compute.v1.HelpOrBuilder> helpBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     * @return Whether the help field is set.
     */
    public boolean hasHelp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     * @return The help.
     */
    public com.google.cloud.compute.v1.Help getHelp() {
      if (helpBuilder_ == null) {
        return help_ == null ? com.google.cloud.compute.v1.Help.getDefaultInstance() : help_;
      } else {
        return helpBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     */
    public Builder setHelp(com.google.cloud.compute.v1.Help value) {
      if (helpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        help_ = value;
        onChanged();
      } else {
        helpBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     */
    public Builder setHelp(
        com.google.cloud.compute.v1.Help.Builder builderForValue) {
      if (helpBuilder_ == null) {
        help_ = builderForValue.build();
        onChanged();
      } else {
        helpBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     */
    public Builder mergeHelp(com.google.cloud.compute.v1.Help value) {
      if (helpBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
            help_ != null &&
            help_ != com.google.cloud.compute.v1.Help.getDefaultInstance()) {
          help_ =
            com.google.cloud.compute.v1.Help.newBuilder(help_).mergeFrom(value).buildPartial();
        } else {
          help_ = value;
        }
        onChanged();
      } else {
        helpBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     */
    public Builder clearHelp() {
      if (helpBuilder_ == null) {
        help_ = null;
        onChanged();
      } else {
        helpBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     */
    public com.google.cloud.compute.v1.Help.Builder getHelpBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHelpFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     */
    public com.google.cloud.compute.v1.HelpOrBuilder getHelpOrBuilder() {
      if (helpBuilder_ != null) {
        return helpBuilder_.getMessageOrBuilder();
      } else {
        return help_ == null ?
            com.google.cloud.compute.v1.Help.getDefaultInstance() : help_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.Help help = 3198785;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.Help, com.google.cloud.compute.v1.Help.Builder, com.google.cloud.compute.v1.HelpOrBuilder> 
        getHelpFieldBuilder() {
      if (helpBuilder_ == null) {
        helpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Help, com.google.cloud.compute.v1.Help.Builder, com.google.cloud.compute.v1.HelpOrBuilder>(
                getHelp(),
                getParentForChildren(),
                isClean());
        help_ = null;
      }
      return helpBuilder_;
    }

    private com.google.cloud.compute.v1.LocalizedMessage localizedMessage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.LocalizedMessage, com.google.cloud.compute.v1.LocalizedMessage.Builder, com.google.cloud.compute.v1.LocalizedMessageOrBuilder> localizedMessageBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     * @return Whether the localizedMessage field is set.
     */
    public boolean hasLocalizedMessage() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     * @return The localizedMessage.
     */
    public com.google.cloud.compute.v1.LocalizedMessage getLocalizedMessage() {
      if (localizedMessageBuilder_ == null) {
        return localizedMessage_ == null ? com.google.cloud.compute.v1.LocalizedMessage.getDefaultInstance() : localizedMessage_;
      } else {
        return localizedMessageBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     */
    public Builder setLocalizedMessage(com.google.cloud.compute.v1.LocalizedMessage value) {
      if (localizedMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        localizedMessage_ = value;
        onChanged();
      } else {
        localizedMessageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     */
    public Builder setLocalizedMessage(
        com.google.cloud.compute.v1.LocalizedMessage.Builder builderForValue) {
      if (localizedMessageBuilder_ == null) {
        localizedMessage_ = builderForValue.build();
        onChanged();
      } else {
        localizedMessageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     */
    public Builder mergeLocalizedMessage(com.google.cloud.compute.v1.LocalizedMessage value) {
      if (localizedMessageBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            localizedMessage_ != null &&
            localizedMessage_ != com.google.cloud.compute.v1.LocalizedMessage.getDefaultInstance()) {
          localizedMessage_ =
            com.google.cloud.compute.v1.LocalizedMessage.newBuilder(localizedMessage_).mergeFrom(value).buildPartial();
        } else {
          localizedMessage_ = value;
        }
        onChanged();
      } else {
        localizedMessageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     */
    public Builder clearLocalizedMessage() {
      if (localizedMessageBuilder_ == null) {
        localizedMessage_ = null;
        onChanged();
      } else {
        localizedMessageBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     */
    public com.google.cloud.compute.v1.LocalizedMessage.Builder getLocalizedMessageBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getLocalizedMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     */
    public com.google.cloud.compute.v1.LocalizedMessageOrBuilder getLocalizedMessageOrBuilder() {
      if (localizedMessageBuilder_ != null) {
        return localizedMessageBuilder_.getMessageOrBuilder();
      } else {
        return localizedMessage_ == null ?
            com.google.cloud.compute.v1.LocalizedMessage.getDefaultInstance() : localizedMessage_;
      }
    }
    /**
     * <code>optional .google.cloud.compute.v1.LocalizedMessage localized_message = 404537155;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.LocalizedMessage, com.google.cloud.compute.v1.LocalizedMessage.Builder, com.google.cloud.compute.v1.LocalizedMessageOrBuilder> 
        getLocalizedMessageFieldBuilder() {
      if (localizedMessageBuilder_ == null) {
        localizedMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.LocalizedMessage, com.google.cloud.compute.v1.LocalizedMessage.Builder, com.google.cloud.compute.v1.LocalizedMessageOrBuilder>(
                getLocalizedMessage(),
                getParentForChildren(),
                isClean());
        localizedMessage_ = null;
      }
      return localizedMessageBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ErrorDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ErrorDetails)
  private static final com.google.cloud.compute.v1.ErrorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ErrorDetails();
  }

  public static com.google.cloud.compute.v1.ErrorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorDetails>
      PARSER = new com.google.protobuf.AbstractParser<ErrorDetails>() {
    @java.lang.Override
    public ErrorDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ErrorDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ErrorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
