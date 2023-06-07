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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Score distribution.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.ScoreDistribution}
 */
public final class ScoreDistribution extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.ScoreDistribution)
    ScoreDistributionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ScoreDistribution.newBuilder() to construct.
  private ScoreDistribution(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ScoreDistribution() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ScoreDistribution();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_ScoreDistribution_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetScoreBuckets();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_ScoreDistribution_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.ScoreDistribution.class,
            com.google.recaptchaenterprise.v1.ScoreDistribution.Builder.class);
  }

  public static final int SCORE_BUCKETS_FIELD_NUMBER = 1;

  private static final class ScoreBucketsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.Integer, java.lang.Long>newDefaultInstance(
            com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
                .internal_static_google_cloud_recaptchaenterprise_v1_ScoreDistribution_ScoreBucketsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.INT32,
            0,
            com.google.protobuf.WireFormat.FieldType.INT64,
            0L);
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long> scoreBuckets_;

  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
      internalGetScoreBuckets() {
    if (scoreBuckets_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ScoreBucketsDefaultEntryHolder.defaultEntry);
    }
    return scoreBuckets_;
  }

  public int getScoreBucketsCount() {
    return internalGetScoreBuckets().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  @java.lang.Override
  public boolean containsScoreBuckets(int key) {

    return internalGetScoreBuckets().getMap().containsKey(key);
  }
  /** Use {@link #getScoreBucketsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Long> getScoreBuckets() {
    return getScoreBucketsMap();
  }
  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, java.lang.Long> getScoreBucketsMap() {
    return internalGetScoreBuckets().getMap();
  }
  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  @java.lang.Override
  public long getScoreBucketsOrDefault(int key, long defaultValue) {

    java.util.Map<java.lang.Integer, java.lang.Long> map = internalGetScoreBuckets().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Map key is score value multiplied by 100. The scores are discrete values
   * between [0, 1]. The maximum number of buckets is on order of a few dozen,
   * but typically much lower (ie. 10).
   * </pre>
   *
   * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
   */
  @java.lang.Override
  public long getScoreBucketsOrThrow(int key) {

    java.util.Map<java.lang.Integer, java.lang.Long> map = internalGetScoreBuckets().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeIntegerMapTo(
        output, internalGetScoreBuckets(), ScoreBucketsDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> entry :
        internalGetScoreBuckets().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long> scoreBuckets__ =
          ScoreBucketsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, scoreBuckets__);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.ScoreDistribution)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.ScoreDistribution other =
        (com.google.recaptchaenterprise.v1.ScoreDistribution) obj;

    if (!internalGetScoreBuckets().equals(other.internalGetScoreBuckets())) return false;
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
    if (!internalGetScoreBuckets().getMap().isEmpty()) {
      hash = (37 * hash) + SCORE_BUCKETS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetScoreBuckets().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution parseFrom(
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

  public static Builder newBuilder(com.google.recaptchaenterprise.v1.ScoreDistribution prototype) {
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
   * Score distribution.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.ScoreDistribution}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.ScoreDistribution)
      com.google.recaptchaenterprise.v1.ScoreDistributionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_ScoreDistribution_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetScoreBuckets();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableScoreBuckets();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_ScoreDistribution_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.ScoreDistribution.class,
              com.google.recaptchaenterprise.v1.ScoreDistribution.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.ScoreDistribution.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableScoreBuckets().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_ScoreDistribution_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ScoreDistribution getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.ScoreDistribution.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ScoreDistribution build() {
      com.google.recaptchaenterprise.v1.ScoreDistribution result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ScoreDistribution buildPartial() {
      com.google.recaptchaenterprise.v1.ScoreDistribution result =
          new com.google.recaptchaenterprise.v1.ScoreDistribution(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.ScoreDistribution result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scoreBuckets_ = internalGetScoreBuckets();
        result.scoreBuckets_.makeImmutable();
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
      if (other instanceof com.google.recaptchaenterprise.v1.ScoreDistribution) {
        return mergeFrom((com.google.recaptchaenterprise.v1.ScoreDistribution) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.ScoreDistribution other) {
      if (other == com.google.recaptchaenterprise.v1.ScoreDistribution.getDefaultInstance())
        return this;
      internalGetMutableScoreBuckets().mergeFrom(other.internalGetScoreBuckets());
      bitField0_ |= 0x00000001;
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
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long> scoreBuckets__ =
                    input.readMessage(
                        ScoreBucketsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableScoreBuckets()
                    .getMutableMap()
                    .put(scoreBuckets__.getKey(), scoreBuckets__.getValue());
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

    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long> scoreBuckets_;

    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
        internalGetScoreBuckets() {
      if (scoreBuckets_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ScoreBucketsDefaultEntryHolder.defaultEntry);
      }
      return scoreBuckets_;
    }

    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
        internalGetMutableScoreBuckets() {
      if (scoreBuckets_ == null) {
        scoreBuckets_ =
            com.google.protobuf.MapField.newMapField(ScoreBucketsDefaultEntryHolder.defaultEntry);
      }
      if (!scoreBuckets_.isMutable()) {
        scoreBuckets_ = scoreBuckets_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return scoreBuckets_;
    }

    public int getScoreBucketsCount() {
      return internalGetScoreBuckets().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Map key is score value multiplied by 100. The scores are discrete values
     * between [0, 1]. The maximum number of buckets is on order of a few dozen,
     * but typically much lower (ie. 10).
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
     */
    @java.lang.Override
    public boolean containsScoreBuckets(int key) {

      return internalGetScoreBuckets().getMap().containsKey(key);
    }
    /** Use {@link #getScoreBucketsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long> getScoreBuckets() {
      return getScoreBucketsMap();
    }
    /**
     *
     *
     * <pre>
     * Map key is score value multiplied by 100. The scores are discrete values
     * between [0, 1]. The maximum number of buckets is on order of a few dozen,
     * but typically much lower (ie. 10).
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Long> getScoreBucketsMap() {
      return internalGetScoreBuckets().getMap();
    }
    /**
     *
     *
     * <pre>
     * Map key is score value multiplied by 100. The scores are discrete values
     * between [0, 1]. The maximum number of buckets is on order of a few dozen,
     * but typically much lower (ie. 10).
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
     */
    @java.lang.Override
    public long getScoreBucketsOrDefault(int key, long defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Long> map = internalGetScoreBuckets().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Map key is score value multiplied by 100. The scores are discrete values
     * between [0, 1]. The maximum number of buckets is on order of a few dozen,
     * but typically much lower (ie. 10).
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
     */
    @java.lang.Override
    public long getScoreBucketsOrThrow(int key) {

      java.util.Map<java.lang.Integer, java.lang.Long> map = internalGetScoreBuckets().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearScoreBuckets() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableScoreBuckets().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map key is score value multiplied by 100. The scores are discrete values
     * between [0, 1]. The maximum number of buckets is on order of a few dozen,
     * but typically much lower (ie. 10).
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
     */
    public Builder removeScoreBuckets(int key) {

      internalGetMutableScoreBuckets().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long> getMutableScoreBuckets() {
      bitField0_ |= 0x00000001;
      return internalGetMutableScoreBuckets().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Map key is score value multiplied by 100. The scores are discrete values
     * between [0, 1]. The maximum number of buckets is on order of a few dozen,
     * but typically much lower (ie. 10).
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
     */
    public Builder putScoreBuckets(int key, long value) {

      internalGetMutableScoreBuckets().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Map key is score value multiplied by 100. The scores are discrete values
     * between [0, 1]. The maximum number of buckets is on order of a few dozen,
     * but typically much lower (ie. 10).
     * </pre>
     *
     * <code>map&lt;int32, int64&gt; score_buckets = 1;</code>
     */
    public Builder putAllScoreBuckets(java.util.Map<java.lang.Integer, java.lang.Long> values) {
      internalGetMutableScoreBuckets().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.ScoreDistribution)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.ScoreDistribution)
  private static final com.google.recaptchaenterprise.v1.ScoreDistribution DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.ScoreDistribution();
  }

  public static com.google.recaptchaenterprise.v1.ScoreDistribution getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScoreDistribution> PARSER =
      new com.google.protobuf.AbstractParser<ScoreDistribution>() {
        @java.lang.Override
        public ScoreDistribution parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScoreDistribution> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScoreDistribution> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.ScoreDistribution getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
