// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * A request message for RegionNetworkFirewallPolicies.GetRule. See the method description for details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest}
 */
public final class GetRuleRegionNetworkFirewallPolicyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest)
    GetRuleRegionNetworkFirewallPolicyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRuleRegionNetworkFirewallPolicyRequest.newBuilder() to construct.
  private GetRuleRegionNetworkFirewallPolicyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRuleRegionNetworkFirewallPolicyRequest() {
    firewallPolicy_ = "";
    project_ = "";
    region_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRuleRegionNetworkFirewallPolicyRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetRuleRegionNetworkFirewallPolicyRequest(
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
          case 1111570338: {
            java.lang.String s = input.readStringRequireUtf8();

            region_ = s;
            break;
          }
          case 1820481738: {
            java.lang.String s = input.readStringRequireUtf8();

            project_ = s;
            break;
          }
          case -733754080: {
            bitField0_ |= 0x00000001;
            priority_ = input.readInt32();
            break;
          }
          case -309581174: {
            java.lang.String s = input.readStringRequireUtf8();

            firewallPolicy_ = s;
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
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleRegionNetworkFirewallPolicyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleRegionNetworkFirewallPolicyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest.class, com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FIREWALL_POLICY_FIELD_NUMBER = 498173265;
  private volatile java.lang.Object firewallPolicy_;
  /**
   * <pre>
   * Name of the firewall policy to which the queried rule belongs.
   * </pre>
   *
   * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The firewallPolicy.
   */
  @java.lang.Override
  public java.lang.String getFirewallPolicy() {
    java.lang.Object ref = firewallPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firewallPolicy_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the firewall policy to which the queried rule belongs.
   * </pre>
   *
   * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for firewallPolicy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFirewallPolicyBytes() {
    java.lang.Object ref = firewallPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firewallPolicy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIORITY_FIELD_NUMBER = 445151652;
  private int priority_;
  /**
   * <pre>
   * The priority of the rule to get from the firewall policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return Whether the priority field is set.
   */
  @java.lang.Override
  public boolean hasPriority() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The priority of the rule to get from the firewall policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return The priority.
   */
  @java.lang.Override
  public int getPriority() {
    return priority_;
  }

  public static final int PROJECT_FIELD_NUMBER = 227560217;
  private volatile java.lang.Object project_;
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  @java.lang.Override
  public java.lang.String getProject() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      project_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectBytes() {
    java.lang.Object ref = project_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      project_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_FIELD_NUMBER = 138946292;
  private volatile java.lang.Object region_;
  /**
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      region_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 138946292, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 227560217, project_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(445151652, priority_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firewallPolicy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 498173265, firewallPolicy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(138946292, region_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(project_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(227560217, project_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(445151652, priority_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firewallPolicy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(498173265, firewallPolicy_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest other = (com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest) obj;

    if (!getFirewallPolicy()
        .equals(other.getFirewallPolicy())) return false;
    if (hasPriority() != other.hasPriority()) return false;
    if (hasPriority()) {
      if (getPriority()
          != other.getPriority()) return false;
    }
    if (!getProject()
        .equals(other.getProject())) return false;
    if (!getRegion()
        .equals(other.getRegion())) return false;
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
    hash = (37 * hash) + FIREWALL_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + getFirewallPolicy().hashCode();
    if (hasPriority()) {
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + getPriority();
    }
    hash = (37 * hash) + PROJECT_FIELD_NUMBER;
    hash = (53 * hash) + getProject().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest prototype) {
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
   * A request message for RegionNetworkFirewallPolicies.GetRule. See the method description for details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest)
      com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleRegionNetworkFirewallPolicyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleRegionNetworkFirewallPolicyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest.class, com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest.newBuilder()
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
      firewallPolicy_ = "";

      priority_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      project_ = "";

      region_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_GetRuleRegionNetworkFirewallPolicyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest build() {
      com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest buildPartial() {
      com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest result = new com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.firewallPolicy_ = firewallPolicy_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.priority_ = priority_;
        to_bitField0_ |= 0x00000001;
      }
      result.project_ = project_;
      result.region_ = region_;
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
      if (other instanceof com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest other) {
      if (other == com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest.getDefaultInstance()) return this;
      if (!other.getFirewallPolicy().isEmpty()) {
        firewallPolicy_ = other.firewallPolicy_;
        onChanged();
      }
      if (other.hasPriority()) {
        setPriority(other.getPriority());
      }
      if (!other.getProject().isEmpty()) {
        project_ = other.project_;
        onChanged();
      }
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        onChanged();
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
      com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object firewallPolicy_ = "";
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The firewallPolicy.
     */
    public java.lang.String getFirewallPolicy() {
      java.lang.Object ref = firewallPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firewallPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for firewallPolicy.
     */
    public com.google.protobuf.ByteString
        getFirewallPolicyBytes() {
      java.lang.Object ref = firewallPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firewallPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The firewallPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setFirewallPolicy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firewallPolicy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearFirewallPolicy() {
      
      firewallPolicy_ = getDefaultInstance().getFirewallPolicy();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the firewall policy to which the queried rule belongs.
     * </pre>
     *
     * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for firewallPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setFirewallPolicyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      firewallPolicy_ = value;
      onChanged();
      return this;
    }

    private int priority_ ;
    /**
     * <pre>
     * The priority of the rule to get from the firewall policy.
     * </pre>
     *
     * <code>optional int32 priority = 445151652;</code>
     * @return Whether the priority field is set.
     */
    @java.lang.Override
    public boolean hasPriority() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The priority of the rule to get from the firewall policy.
     * </pre>
     *
     * <code>optional int32 priority = 445151652;</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }
    /**
     * <pre>
     * The priority of the rule to get from the firewall policy.
     * </pre>
     *
     * <code>optional int32 priority = 445151652;</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(int value) {
      bitField0_ |= 0x00000001;
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The priority of the rule to get from the firewall policy.
     * </pre>
     *
     * <code>optional int32 priority = 445151652;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      bitField0_ = (bitField0_ & ~0x00000001);
      priority_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object project_ = "";
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The project.
     */
    public java.lang.String getProject() {
      java.lang.Object ref = project_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        project_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for project.
     */
    public com.google.protobuf.ByteString
        getProjectBytes() {
      java.lang.Object ref = project_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        project_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The project to set.
     * @return This builder for chaining.
     */
    public Builder setProject(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      project_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearProject() {
      
      project_ = getDefaultInstance().getProject();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project ID for this request.
     * </pre>
     *
     * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for project to set.
     * @return This builder for chaining.
     */
    public Builder setProjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      project_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString
        getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      region_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      
      region_ = getDefaultInstance().getRegion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the region scoping this request.
     * </pre>
     *
     * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      region_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest)
  private static final com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest();
  }

  public static com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRuleRegionNetworkFirewallPolicyRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetRuleRegionNetworkFirewallPolicyRequest>() {
    @java.lang.Override
    public GetRuleRegionNetworkFirewallPolicyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetRuleRegionNetworkFirewallPolicyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetRuleRegionNetworkFirewallPolicyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRuleRegionNetworkFirewallPolicyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GetRuleRegionNetworkFirewallPolicyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
