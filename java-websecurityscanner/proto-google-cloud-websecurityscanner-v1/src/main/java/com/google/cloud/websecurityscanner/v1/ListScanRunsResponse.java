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
// source: google/cloud/websecurityscanner/v1/web_security_scanner.proto

package com.google.cloud.websecurityscanner.v1;

/**
 *
 *
 * <pre>
 * Response for the `ListScanRuns` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.websecurityscanner.v1.ListScanRunsResponse}
 */
public final class ListScanRunsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.websecurityscanner.v1.ListScanRunsResponse)
    ListScanRunsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListScanRunsResponse.newBuilder() to construct.
  private ListScanRunsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListScanRunsResponse() {
    scanRuns_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListScanRunsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListScanRunsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                scanRuns_ =
                    new java.util.ArrayList<com.google.cloud.websecurityscanner.v1.ScanRun>();
                mutable_bitField0_ |= 0x00000001;
              }
              scanRuns_.add(
                  input.readMessage(
                      com.google.cloud.websecurityscanner.v1.ScanRun.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        scanRuns_ = java.util.Collections.unmodifiableList(scanRuns_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.websecurityscanner.v1.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1_ListScanRunsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.websecurityscanner.v1.WebSecurityScannerProto
        .internal_static_google_cloud_websecurityscanner_v1_ListScanRunsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.websecurityscanner.v1.ListScanRunsResponse.class,
            com.google.cloud.websecurityscanner.v1.ListScanRunsResponse.Builder.class);
  }

  public static final int SCAN_RUNS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.websecurityscanner.v1.ScanRun> scanRuns_;
  /**
   *
   *
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.websecurityscanner.v1.ScanRun> getScanRunsList() {
    return scanRuns_;
  }
  /**
   *
   *
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder>
      getScanRunsOrBuilderList() {
    return scanRuns_;
  }
  /**
   *
   *
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  @java.lang.Override
  public int getScanRunsCount() {
    return scanRuns_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1.ScanRun getScanRuns(int index) {
    return scanRuns_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of ScanRuns returned.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder getScanRunsOrBuilder(int index) {
    return scanRuns_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
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
    for (int i = 0; i < scanRuns_.size(); i++) {
      output.writeMessage(1, scanRuns_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < scanRuns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, scanRuns_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.websecurityscanner.v1.ListScanRunsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.websecurityscanner.v1.ListScanRunsResponse other =
        (com.google.cloud.websecurityscanner.v1.ListScanRunsResponse) obj;

    if (!getScanRunsList().equals(other.getScanRunsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getScanRunsCount() > 0) {
      hash = (37 * hash) + SCAN_RUNS_FIELD_NUMBER;
      hash = (53 * hash) + getScanRunsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parseFrom(
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
      com.google.cloud.websecurityscanner.v1.ListScanRunsResponse prototype) {
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
   * Response for the `ListScanRuns` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.websecurityscanner.v1.ListScanRunsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.websecurityscanner.v1.ListScanRunsResponse)
      com.google.cloud.websecurityscanner.v1.ListScanRunsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.websecurityscanner.v1.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1_ListScanRunsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.websecurityscanner.v1.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1_ListScanRunsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.websecurityscanner.v1.ListScanRunsResponse.class,
              com.google.cloud.websecurityscanner.v1.ListScanRunsResponse.Builder.class);
    }

    // Construct using com.google.cloud.websecurityscanner.v1.ListScanRunsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getScanRunsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (scanRunsBuilder_ == null) {
        scanRuns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        scanRunsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.websecurityscanner.v1.WebSecurityScannerProto
          .internal_static_google_cloud_websecurityscanner_v1_ListScanRunsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.ListScanRunsResponse getDefaultInstanceForType() {
      return com.google.cloud.websecurityscanner.v1.ListScanRunsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.ListScanRunsResponse build() {
      com.google.cloud.websecurityscanner.v1.ListScanRunsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.websecurityscanner.v1.ListScanRunsResponse buildPartial() {
      com.google.cloud.websecurityscanner.v1.ListScanRunsResponse result =
          new com.google.cloud.websecurityscanner.v1.ListScanRunsResponse(this);
      int from_bitField0_ = bitField0_;
      if (scanRunsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          scanRuns_ = java.util.Collections.unmodifiableList(scanRuns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.scanRuns_ = scanRuns_;
      } else {
        result.scanRuns_ = scanRunsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.websecurityscanner.v1.ListScanRunsResponse) {
        return mergeFrom((com.google.cloud.websecurityscanner.v1.ListScanRunsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.websecurityscanner.v1.ListScanRunsResponse other) {
      if (other == com.google.cloud.websecurityscanner.v1.ListScanRunsResponse.getDefaultInstance())
        return this;
      if (scanRunsBuilder_ == null) {
        if (!other.scanRuns_.isEmpty()) {
          if (scanRuns_.isEmpty()) {
            scanRuns_ = other.scanRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureScanRunsIsMutable();
            scanRuns_.addAll(other.scanRuns_);
          }
          onChanged();
        }
      } else {
        if (!other.scanRuns_.isEmpty()) {
          if (scanRunsBuilder_.isEmpty()) {
            scanRunsBuilder_.dispose();
            scanRunsBuilder_ = null;
            scanRuns_ = other.scanRuns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            scanRunsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getScanRunsFieldBuilder()
                    : null;
          } else {
            scanRunsBuilder_.addAllMessages(other.scanRuns_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.websecurityscanner.v1.ListScanRunsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.websecurityscanner.v1.ListScanRunsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.websecurityscanner.v1.ScanRun> scanRuns_ =
        java.util.Collections.emptyList();

    private void ensureScanRunsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scanRuns_ =
            new java.util.ArrayList<com.google.cloud.websecurityscanner.v1.ScanRun>(scanRuns_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1.ScanRun,
            com.google.cloud.websecurityscanner.v1.ScanRun.Builder,
            com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder>
        scanRunsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1.ScanRun> getScanRunsList() {
      if (scanRunsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(scanRuns_);
      } else {
        return scanRunsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public int getScanRunsCount() {
      if (scanRunsBuilder_ == null) {
        return scanRuns_.size();
      } else {
        return scanRunsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1.ScanRun getScanRuns(int index) {
      if (scanRunsBuilder_ == null) {
        return scanRuns_.get(index);
      } else {
        return scanRunsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder setScanRuns(int index, com.google.cloud.websecurityscanner.v1.ScanRun value) {
      if (scanRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanRunsIsMutable();
        scanRuns_.set(index, value);
        onChanged();
      } else {
        scanRunsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder setScanRuns(
        int index, com.google.cloud.websecurityscanner.v1.ScanRun.Builder builderForValue) {
      if (scanRunsBuilder_ == null) {
        ensureScanRunsIsMutable();
        scanRuns_.set(index, builderForValue.build());
        onChanged();
      } else {
        scanRunsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder addScanRuns(com.google.cloud.websecurityscanner.v1.ScanRun value) {
      if (scanRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanRunsIsMutable();
        scanRuns_.add(value);
        onChanged();
      } else {
        scanRunsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder addScanRuns(int index, com.google.cloud.websecurityscanner.v1.ScanRun value) {
      if (scanRunsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScanRunsIsMutable();
        scanRuns_.add(index, value);
        onChanged();
      } else {
        scanRunsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder addScanRuns(
        com.google.cloud.websecurityscanner.v1.ScanRun.Builder builderForValue) {
      if (scanRunsBuilder_ == null) {
        ensureScanRunsIsMutable();
        scanRuns_.add(builderForValue.build());
        onChanged();
      } else {
        scanRunsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder addScanRuns(
        int index, com.google.cloud.websecurityscanner.v1.ScanRun.Builder builderForValue) {
      if (scanRunsBuilder_ == null) {
        ensureScanRunsIsMutable();
        scanRuns_.add(index, builderForValue.build());
        onChanged();
      } else {
        scanRunsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder addAllScanRuns(
        java.lang.Iterable<? extends com.google.cloud.websecurityscanner.v1.ScanRun> values) {
      if (scanRunsBuilder_ == null) {
        ensureScanRunsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, scanRuns_);
        onChanged();
      } else {
        scanRunsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder clearScanRuns() {
      if (scanRunsBuilder_ == null) {
        scanRuns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        scanRunsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public Builder removeScanRuns(int index) {
      if (scanRunsBuilder_ == null) {
        ensureScanRunsIsMutable();
        scanRuns_.remove(index);
        onChanged();
      } else {
        scanRunsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1.ScanRun.Builder getScanRunsBuilder(int index) {
      return getScanRunsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder getScanRunsOrBuilder(int index) {
      if (scanRunsBuilder_ == null) {
        return scanRuns_.get(index);
      } else {
        return scanRunsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder>
        getScanRunsOrBuilderList() {
      if (scanRunsBuilder_ != null) {
        return scanRunsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(scanRuns_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1.ScanRun.Builder addScanRunsBuilder() {
      return getScanRunsFieldBuilder()
          .addBuilder(com.google.cloud.websecurityscanner.v1.ScanRun.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public com.google.cloud.websecurityscanner.v1.ScanRun.Builder addScanRunsBuilder(int index) {
      return getScanRunsFieldBuilder()
          .addBuilder(index, com.google.cloud.websecurityscanner.v1.ScanRun.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of ScanRuns returned.
     * </pre>
     *
     * <code>repeated .google.cloud.websecurityscanner.v1.ScanRun scan_runs = 1;</code>
     */
    public java.util.List<com.google.cloud.websecurityscanner.v1.ScanRun.Builder>
        getScanRunsBuilderList() {
      return getScanRunsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.websecurityscanner.v1.ScanRun,
            com.google.cloud.websecurityscanner.v1.ScanRun.Builder,
            com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder>
        getScanRunsFieldBuilder() {
      if (scanRunsBuilder_ == null) {
        scanRunsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.websecurityscanner.v1.ScanRun,
                com.google.cloud.websecurityscanner.v1.ScanRun.Builder,
                com.google.cloud.websecurityscanner.v1.ScanRunOrBuilder>(
                scanRuns_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        scanRuns_ = null;
      }
      return scanRunsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no
     * more results in the list.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.websecurityscanner.v1.ListScanRunsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.websecurityscanner.v1.ListScanRunsResponse)
  private static final com.google.cloud.websecurityscanner.v1.ListScanRunsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.websecurityscanner.v1.ListScanRunsResponse();
  }

  public static com.google.cloud.websecurityscanner.v1.ListScanRunsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListScanRunsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListScanRunsResponse>() {
        @java.lang.Override
        public ListScanRunsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListScanRunsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListScanRunsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListScanRunsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.websecurityscanner.v1.ListScanRunsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
