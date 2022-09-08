// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

package com.google.analytics.data.v1alpha;

/**
 * <pre>
 * Conditions tell Analytics what data to include in or exclude from the
 * segment.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.EventSegmentConditionGroup}
 */
public final class EventSegmentConditionGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.EventSegmentConditionGroup)
    EventSegmentConditionGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventSegmentConditionGroup.newBuilder() to construct.
  private EventSegmentConditionGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventSegmentConditionGroup() {
    conditionScoping_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventSegmentConditionGroup();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventSegmentConditionGroup(
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
            int rawValue = input.readEnum();

            conditionScoping_ = rawValue;
            break;
          }
          case 18: {
            com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder subBuilder = null;
            if (segmentFilterExpression_ != null) {
              subBuilder = segmentFilterExpression_.toBuilder();
            }
            segmentFilterExpression_ = input.readMessage(com.google.analytics.data.v1alpha.SegmentFilterExpression.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(segmentFilterExpression_);
              segmentFilterExpression_ = subBuilder.buildPartial();
            }

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
    return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_EventSegmentConditionGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_EventSegmentConditionGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.EventSegmentConditionGroup.class, com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder.class);
  }

  public static final int CONDITION_SCOPING_FIELD_NUMBER = 1;
  private int conditionScoping_;
  /**
   * <pre>
   * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
   * Optional. If unspecified, a `conditionScoping` of
   * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
   * @return The enum numeric value on the wire for conditionScoping.
   */
  @java.lang.Override public int getConditionScopingValue() {
    return conditionScoping_;
  }
  /**
   * <pre>
   * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
   * Optional. If unspecified, a `conditionScoping` of
   * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
   * @return The conditionScoping.
   */
  @java.lang.Override public com.google.analytics.data.v1alpha.EventCriteriaScoping getConditionScoping() {
    @SuppressWarnings("deprecation")
    com.google.analytics.data.v1alpha.EventCriteriaScoping result = com.google.analytics.data.v1alpha.EventCriteriaScoping.valueOf(conditionScoping_);
    return result == null ? com.google.analytics.data.v1alpha.EventCriteriaScoping.UNRECOGNIZED : result;
  }

  public static final int SEGMENT_FILTER_EXPRESSION_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.SegmentFilterExpression segmentFilterExpression_;
  /**
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
   * @return Whether the segmentFilterExpression field is set.
   */
  @java.lang.Override
  public boolean hasSegmentFilterExpression() {
    return segmentFilterExpression_ != null;
  }
  /**
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
   * @return The segmentFilterExpression.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SegmentFilterExpression getSegmentFilterExpression() {
    return segmentFilterExpression_ == null ? com.google.analytics.data.v1alpha.SegmentFilterExpression.getDefaultInstance() : segmentFilterExpression_;
  }
  /**
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder getSegmentFilterExpressionOrBuilder() {
    return getSegmentFilterExpression();
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
    if (conditionScoping_ != com.google.analytics.data.v1alpha.EventCriteriaScoping.EVENT_CRITERIA_SCOPING_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, conditionScoping_);
    }
    if (segmentFilterExpression_ != null) {
      output.writeMessage(2, getSegmentFilterExpression());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conditionScoping_ != com.google.analytics.data.v1alpha.EventCriteriaScoping.EVENT_CRITERIA_SCOPING_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, conditionScoping_);
    }
    if (segmentFilterExpression_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSegmentFilterExpression());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.EventSegmentConditionGroup)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.EventSegmentConditionGroup other = (com.google.analytics.data.v1alpha.EventSegmentConditionGroup) obj;

    if (conditionScoping_ != other.conditionScoping_) return false;
    if (hasSegmentFilterExpression() != other.hasSegmentFilterExpression()) return false;
    if (hasSegmentFilterExpression()) {
      if (!getSegmentFilterExpression()
          .equals(other.getSegmentFilterExpression())) return false;
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
    hash = (37 * hash) + CONDITION_SCOPING_FIELD_NUMBER;
    hash = (53 * hash) + conditionScoping_;
    if (hasSegmentFilterExpression()) {
      hash = (37 * hash) + SEGMENT_FILTER_EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentFilterExpression().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup parseFrom(
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
  public static Builder newBuilder(com.google.analytics.data.v1alpha.EventSegmentConditionGroup prototype) {
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
   * Conditions tell Analytics what data to include in or exclude from the
   * segment.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.EventSegmentConditionGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.EventSegmentConditionGroup)
      com.google.analytics.data.v1alpha.EventSegmentConditionGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_EventSegmentConditionGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_EventSegmentConditionGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.EventSegmentConditionGroup.class, com.google.analytics.data.v1alpha.EventSegmentConditionGroup.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.EventSegmentConditionGroup.newBuilder()
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
      conditionScoping_ = 0;

      if (segmentFilterExpressionBuilder_ == null) {
        segmentFilterExpression_ = null;
      } else {
        segmentFilterExpression_ = null;
        segmentFilterExpressionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto.internal_static_google_analytics_data_v1alpha_EventSegmentConditionGroup_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentConditionGroup getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.EventSegmentConditionGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentConditionGroup build() {
      com.google.analytics.data.v1alpha.EventSegmentConditionGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventSegmentConditionGroup buildPartial() {
      com.google.analytics.data.v1alpha.EventSegmentConditionGroup result = new com.google.analytics.data.v1alpha.EventSegmentConditionGroup(this);
      result.conditionScoping_ = conditionScoping_;
      if (segmentFilterExpressionBuilder_ == null) {
        result.segmentFilterExpression_ = segmentFilterExpression_;
      } else {
        result.segmentFilterExpression_ = segmentFilterExpressionBuilder_.build();
      }
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
      if (other instanceof com.google.analytics.data.v1alpha.EventSegmentConditionGroup) {
        return mergeFrom((com.google.analytics.data.v1alpha.EventSegmentConditionGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.EventSegmentConditionGroup other) {
      if (other == com.google.analytics.data.v1alpha.EventSegmentConditionGroup.getDefaultInstance()) return this;
      if (other.conditionScoping_ != 0) {
        setConditionScopingValue(other.getConditionScopingValue());
      }
      if (other.hasSegmentFilterExpression()) {
        mergeSegmentFilterExpression(other.getSegmentFilterExpression());
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
      com.google.analytics.data.v1alpha.EventSegmentConditionGroup parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.analytics.data.v1alpha.EventSegmentConditionGroup) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int conditionScoping_ = 0;
    /**
     * <pre>
     * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
     * Optional. If unspecified, a `conditionScoping` of
     * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
     * @return The enum numeric value on the wire for conditionScoping.
     */
    @java.lang.Override public int getConditionScopingValue() {
      return conditionScoping_;
    }
    /**
     * <pre>
     * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
     * Optional. If unspecified, a `conditionScoping` of
     * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
     * @param value The enum numeric value on the wire for conditionScoping to set.
     * @return This builder for chaining.
     */
    public Builder setConditionScopingValue(int value) {
      
      conditionScoping_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
     * Optional. If unspecified, a `conditionScoping` of
     * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
     * @return The conditionScoping.
     */
    @java.lang.Override
    public com.google.analytics.data.v1alpha.EventCriteriaScoping getConditionScoping() {
      @SuppressWarnings("deprecation")
      com.google.analytics.data.v1alpha.EventCriteriaScoping result = com.google.analytics.data.v1alpha.EventCriteriaScoping.valueOf(conditionScoping_);
      return result == null ? com.google.analytics.data.v1alpha.EventCriteriaScoping.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
     * Optional. If unspecified, a `conditionScoping` of
     * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
     * @param value The conditionScoping to set.
     * @return This builder for chaining.
     */
    public Builder setConditionScoping(com.google.analytics.data.v1alpha.EventCriteriaScoping value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      conditionScoping_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
     * Optional. If unspecified, a `conditionScoping` of
     * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConditionScoping() {
      
      conditionScoping_ = 0;
      onChanged();
      return this;
    }

    private com.google.analytics.data.v1alpha.SegmentFilterExpression segmentFilterExpression_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.data.v1alpha.SegmentFilterExpression, com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder, com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder> segmentFilterExpressionBuilder_;
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     * @return Whether the segmentFilterExpression field is set.
     */
    public boolean hasSegmentFilterExpression() {
      return segmentFilterExpressionBuilder_ != null || segmentFilterExpression_ != null;
    }
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     * @return The segmentFilterExpression.
     */
    public com.google.analytics.data.v1alpha.SegmentFilterExpression getSegmentFilterExpression() {
      if (segmentFilterExpressionBuilder_ == null) {
        return segmentFilterExpression_ == null ? com.google.analytics.data.v1alpha.SegmentFilterExpression.getDefaultInstance() : segmentFilterExpression_;
      } else {
        return segmentFilterExpressionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     */
    public Builder setSegmentFilterExpression(com.google.analytics.data.v1alpha.SegmentFilterExpression value) {
      if (segmentFilterExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        segmentFilterExpression_ = value;
        onChanged();
      } else {
        segmentFilterExpressionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     */
    public Builder setSegmentFilterExpression(
        com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder builderForValue) {
      if (segmentFilterExpressionBuilder_ == null) {
        segmentFilterExpression_ = builderForValue.build();
        onChanged();
      } else {
        segmentFilterExpressionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     */
    public Builder mergeSegmentFilterExpression(com.google.analytics.data.v1alpha.SegmentFilterExpression value) {
      if (segmentFilterExpressionBuilder_ == null) {
        if (segmentFilterExpression_ != null) {
          segmentFilterExpression_ =
            com.google.analytics.data.v1alpha.SegmentFilterExpression.newBuilder(segmentFilterExpression_).mergeFrom(value).buildPartial();
        } else {
          segmentFilterExpression_ = value;
        }
        onChanged();
      } else {
        segmentFilterExpressionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     */
    public Builder clearSegmentFilterExpression() {
      if (segmentFilterExpressionBuilder_ == null) {
        segmentFilterExpression_ = null;
        onChanged();
      } else {
        segmentFilterExpression_ = null;
        segmentFilterExpressionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     */
    public com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder getSegmentFilterExpressionBuilder() {
      
      onChanged();
      return getSegmentFilterExpressionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     */
    public com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder getSegmentFilterExpressionOrBuilder() {
      if (segmentFilterExpressionBuilder_ != null) {
        return segmentFilterExpressionBuilder_.getMessageOrBuilder();
      } else {
        return segmentFilterExpression_ == null ?
            com.google.analytics.data.v1alpha.SegmentFilterExpression.getDefaultInstance() : segmentFilterExpression_;
      }
    }
    /**
     * <pre>
     * Data is included or excluded from the segment based on if it matches
     * this expression. Expressions express criteria on dimension, metrics,
     * and/or parameters.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.analytics.data.v1alpha.SegmentFilterExpression, com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder, com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder> 
        getSegmentFilterExpressionFieldBuilder() {
      if (segmentFilterExpressionBuilder_ == null) {
        segmentFilterExpressionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.SegmentFilterExpression, com.google.analytics.data.v1alpha.SegmentFilterExpression.Builder, com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder>(
                getSegmentFilterExpression(),
                getParentForChildren(),
                isClean());
        segmentFilterExpression_ = null;
      }
      return segmentFilterExpressionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.EventSegmentConditionGroup)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.EventSegmentConditionGroup)
  private static final com.google.analytics.data.v1alpha.EventSegmentConditionGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.EventSegmentConditionGroup();
  }

  public static com.google.analytics.data.v1alpha.EventSegmentConditionGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventSegmentConditionGroup>
      PARSER = new com.google.protobuf.AbstractParser<EventSegmentConditionGroup>() {
    @java.lang.Override
    public EventSegmentConditionGroup parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventSegmentConditionGroup(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventSegmentConditionGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventSegmentConditionGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.EventSegmentConditionGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
