// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 * <pre>
 * Metrics related to challenges.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.ChallengeMetrics}
 */
public final class ChallengeMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.ChallengeMetrics)
    ChallengeMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChallengeMetrics.newBuilder() to construct.
  private ChallengeMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChallengeMetrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChallengeMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChallengeMetrics(
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
          case 8: {

            pageloadCount_ = input.readInt64();
            break;
          }
          case 16: {

            nocaptchaCount_ = input.readInt64();
            break;
          }
          case 24: {

            failedCount_ = input.readInt64();
            break;
          }
          case 32: {

            passedCount_ = input.readInt64();
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
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ChallengeMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ChallengeMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.ChallengeMetrics.class, com.google.recaptchaenterprise.v1.ChallengeMetrics.Builder.class);
  }

  public static final int PAGELOAD_COUNT_FIELD_NUMBER = 1;
  private long pageloadCount_;
  /**
   * <pre>
   * Count of reCAPTCHA checkboxes or badges rendered. This is mostly equivalent
   * to a count of pageloads for pages that include reCAPTCHA.
   * </pre>
   *
   * <code>int64 pageload_count = 1;</code>
   * @return The pageloadCount.
   */
  @java.lang.Override
  public long getPageloadCount() {
    return pageloadCount_;
  }

  public static final int NOCAPTCHA_COUNT_FIELD_NUMBER = 2;
  private long nocaptchaCount_;
  /**
   * <pre>
   * Count of nocaptchas (successful verification without a challenge) issued.
   * </pre>
   *
   * <code>int64 nocaptcha_count = 2;</code>
   * @return The nocaptchaCount.
   */
  @java.lang.Override
  public long getNocaptchaCount() {
    return nocaptchaCount_;
  }

  public static final int FAILED_COUNT_FIELD_NUMBER = 3;
  private long failedCount_;
  /**
   * <pre>
   * Count of submitted challenge solutions that were incorrect or otherwise
   * deemed suspicious such that a subsequent challenge was triggered.
   * </pre>
   *
   * <code>int64 failed_count = 3;</code>
   * @return The failedCount.
   */
  @java.lang.Override
  public long getFailedCount() {
    return failedCount_;
  }

  public static final int PASSED_COUNT_FIELD_NUMBER = 4;
  private long passedCount_;
  /**
   * <pre>
   * Count of nocaptchas (successful verification without a challenge) plus
   * submitted challenge solutions that were correct and resulted in
   * verification.
   * </pre>
   *
   * <code>int64 passed_count = 4;</code>
   * @return The passedCount.
   */
  @java.lang.Override
  public long getPassedCount() {
    return passedCount_;
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
    if (pageloadCount_ != 0L) {
      output.writeInt64(1, pageloadCount_);
    }
    if (nocaptchaCount_ != 0L) {
      output.writeInt64(2, nocaptchaCount_);
    }
    if (failedCount_ != 0L) {
      output.writeInt64(3, failedCount_);
    }
    if (passedCount_ != 0L) {
      output.writeInt64(4, passedCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageloadCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, pageloadCount_);
    }
    if (nocaptchaCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, nocaptchaCount_);
    }
    if (failedCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, failedCount_);
    }
    if (passedCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, passedCount_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.ChallengeMetrics)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.ChallengeMetrics other = (com.google.recaptchaenterprise.v1.ChallengeMetrics) obj;

    if (getPageloadCount()
        != other.getPageloadCount()) return false;
    if (getNocaptchaCount()
        != other.getNocaptchaCount()) return false;
    if (getFailedCount()
        != other.getFailedCount()) return false;
    if (getPassedCount()
        != other.getPassedCount()) return false;
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
    hash = (37 * hash) + PAGELOAD_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPageloadCount());
    hash = (37 * hash) + NOCAPTCHA_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNocaptchaCount());
    hash = (37 * hash) + FAILED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFailedCount());
    hash = (37 * hash) + PASSED_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPassedCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.recaptchaenterprise.v1.ChallengeMetrics parseFrom(
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
  public static Builder newBuilder(com.google.recaptchaenterprise.v1.ChallengeMetrics prototype) {
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
   * Metrics related to challenges.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.ChallengeMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.ChallengeMetrics)
      com.google.recaptchaenterprise.v1.ChallengeMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ChallengeMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ChallengeMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.ChallengeMetrics.class, com.google.recaptchaenterprise.v1.ChallengeMetrics.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.ChallengeMetrics.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pageloadCount_ = 0L;

      nocaptchaCount_ = 0L;

      failedCount_ = 0L;

      passedCount_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto.internal_static_google_cloud_recaptchaenterprise_v1_ChallengeMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ChallengeMetrics getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.ChallengeMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ChallengeMetrics build() {
      com.google.recaptchaenterprise.v1.ChallengeMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ChallengeMetrics buildPartial() {
      com.google.recaptchaenterprise.v1.ChallengeMetrics result = new com.google.recaptchaenterprise.v1.ChallengeMetrics(this);
      result.pageloadCount_ = pageloadCount_;
      result.nocaptchaCount_ = nocaptchaCount_;
      result.failedCount_ = failedCount_;
      result.passedCount_ = passedCount_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.ChallengeMetrics) {
        return mergeFrom((com.google.recaptchaenterprise.v1.ChallengeMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.ChallengeMetrics other) {
      if (other == com.google.recaptchaenterprise.v1.ChallengeMetrics.getDefaultInstance()) return this;
      if (other.getPageloadCount() != 0L) {
        setPageloadCount(other.getPageloadCount());
      }
      if (other.getNocaptchaCount() != 0L) {
        setNocaptchaCount(other.getNocaptchaCount());
      }
      if (other.getFailedCount() != 0L) {
        setFailedCount(other.getFailedCount());
      }
      if (other.getPassedCount() != 0L) {
        setPassedCount(other.getPassedCount());
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
      com.google.recaptchaenterprise.v1.ChallengeMetrics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.recaptchaenterprise.v1.ChallengeMetrics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long pageloadCount_ ;
    /**
     * <pre>
     * Count of reCAPTCHA checkboxes or badges rendered. This is mostly equivalent
     * to a count of pageloads for pages that include reCAPTCHA.
     * </pre>
     *
     * <code>int64 pageload_count = 1;</code>
     * @return The pageloadCount.
     */
    @java.lang.Override
    public long getPageloadCount() {
      return pageloadCount_;
    }
    /**
     * <pre>
     * Count of reCAPTCHA checkboxes or badges rendered. This is mostly equivalent
     * to a count of pageloads for pages that include reCAPTCHA.
     * </pre>
     *
     * <code>int64 pageload_count = 1;</code>
     * @param value The pageloadCount to set.
     * @return This builder for chaining.
     */
    public Builder setPageloadCount(long value) {
      
      pageloadCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of reCAPTCHA checkboxes or badges rendered. This is mostly equivalent
     * to a count of pageloads for pages that include reCAPTCHA.
     * </pre>
     *
     * <code>int64 pageload_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageloadCount() {
      
      pageloadCount_ = 0L;
      onChanged();
      return this;
    }

    private long nocaptchaCount_ ;
    /**
     * <pre>
     * Count of nocaptchas (successful verification without a challenge) issued.
     * </pre>
     *
     * <code>int64 nocaptcha_count = 2;</code>
     * @return The nocaptchaCount.
     */
    @java.lang.Override
    public long getNocaptchaCount() {
      return nocaptchaCount_;
    }
    /**
     * <pre>
     * Count of nocaptchas (successful verification without a challenge) issued.
     * </pre>
     *
     * <code>int64 nocaptcha_count = 2;</code>
     * @param value The nocaptchaCount to set.
     * @return This builder for chaining.
     */
    public Builder setNocaptchaCount(long value) {
      
      nocaptchaCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of nocaptchas (successful verification without a challenge) issued.
     * </pre>
     *
     * <code>int64 nocaptcha_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNocaptchaCount() {
      
      nocaptchaCount_ = 0L;
      onChanged();
      return this;
    }

    private long failedCount_ ;
    /**
     * <pre>
     * Count of submitted challenge solutions that were incorrect or otherwise
     * deemed suspicious such that a subsequent challenge was triggered.
     * </pre>
     *
     * <code>int64 failed_count = 3;</code>
     * @return The failedCount.
     */
    @java.lang.Override
    public long getFailedCount() {
      return failedCount_;
    }
    /**
     * <pre>
     * Count of submitted challenge solutions that were incorrect or otherwise
     * deemed suspicious such that a subsequent challenge was triggered.
     * </pre>
     *
     * <code>int64 failed_count = 3;</code>
     * @param value The failedCount to set.
     * @return This builder for chaining.
     */
    public Builder setFailedCount(long value) {
      
      failedCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of submitted challenge solutions that were incorrect or otherwise
     * deemed suspicious such that a subsequent challenge was triggered.
     * </pre>
     *
     * <code>int64 failed_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedCount() {
      
      failedCount_ = 0L;
      onChanged();
      return this;
    }

    private long passedCount_ ;
    /**
     * <pre>
     * Count of nocaptchas (successful verification without a challenge) plus
     * submitted challenge solutions that were correct and resulted in
     * verification.
     * </pre>
     *
     * <code>int64 passed_count = 4;</code>
     * @return The passedCount.
     */
    @java.lang.Override
    public long getPassedCount() {
      return passedCount_;
    }
    /**
     * <pre>
     * Count of nocaptchas (successful verification without a challenge) plus
     * submitted challenge solutions that were correct and resulted in
     * verification.
     * </pre>
     *
     * <code>int64 passed_count = 4;</code>
     * @param value The passedCount to set.
     * @return This builder for chaining.
     */
    public Builder setPassedCount(long value) {
      
      passedCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of nocaptchas (successful verification without a challenge) plus
     * submitted challenge solutions that were correct and resulted in
     * verification.
     * </pre>
     *
     * <code>int64 passed_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassedCount() {
      
      passedCount_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.ChallengeMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.ChallengeMetrics)
  private static final com.google.recaptchaenterprise.v1.ChallengeMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.ChallengeMetrics();
  }

  public static com.google.recaptchaenterprise.v1.ChallengeMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChallengeMetrics>
      PARSER = new com.google.protobuf.AbstractParser<ChallengeMetrics>() {
    @java.lang.Override
    public ChallengeMetrics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChallengeMetrics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChallengeMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChallengeMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.ChallengeMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
